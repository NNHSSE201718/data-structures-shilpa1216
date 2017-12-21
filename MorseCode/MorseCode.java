import java.util.TreeMap;

public class MorseCode
{
    private static final char DOT = '.';
    private static final char DASH = '-';

    private static TreeMap<Character, String> codeMap;
    private static TreeNode decodeTree;

    public static void start()
    {
        codeMap = new TreeMap<Character, String>();
        decodeTree = new TreeNode(' ', null, null);  // autoboxing
        // put a space in the root of the decoding tree

        addSymbol('A', ".-");
        addSymbol('B', "-...");
        addSymbol('C', "-.-.");
        addSymbol('D', "-..");
        addSymbol('E', ".");
        addSymbol('F', "..-.");
        addSymbol('G', "--.");
        addSymbol('H', "....");
        addSymbol('I', "..");
        addSymbol('J', ".---");
        addSymbol('K', "-.-");
        addSymbol('L', ".-..");
        addSymbol('M', "--");
        addSymbol('N', "-.");
        addSymbol('O', "---");
        addSymbol('P', ".--.");
        addSymbol('Q', "--.-");
        addSymbol('R', ".-.");
        addSymbol('S', "...");
        addSymbol('T', "-");
        addSymbol('U', "..-");
        addSymbol('V', "...-");
        addSymbol('W', ".--");
        addSymbol('X', "-..-");
        addSymbol('Y', "-.--");
        addSymbol('Z', "--..");
        addSymbol('0', "-----");
        addSymbol('1', ".----");
        addSymbol('2', "..---");
        addSymbol('3', "...--");
        addSymbol('4', "....-");
        addSymbol('5', ".....");
        addSymbol('6', "-....");
        addSymbol('7', "--...");
        addSymbol('8', "---..");
        addSymbol('9', "----.");
        addSymbol('.', ".-.-.-");
        addSymbol(',', "--..--");
        addSymbol('?', "..--..");
    }

    /**
     * Inserts a letter and its Morse code string into the encoding map
     * and calls treeInsert to insert them into the decoding tree.
     */
    private static void addSymbol(char letter, String code)
    {
        codeMap.put(letter, code);
        treeInsert(letter, code);
    }

    /**
     * Inserts a letter and its Morse code string into the
     * decoding tree.  Each dot-dash string corresponds to a path
     * in the tree from the root to a node: at a "dot" go left, at a "dash" go
     * right.  The node at the end of the path holds the symbol
     * for that code string.
     */
    private static void treeInsert(char letter, String code)
    {
        TreeNode current = decodeTree;
        for ( int i = 0; i < code.length(); i++)
        {
            if (code.charAt(i) == '.') 
            {
                if(current.getLeft() == null)
                {
                    current.setLeft(new TreeNode(code.substring(0,i+1)));
                    current = current.getLeft();
                }
                else
                {
                    current = current.getLeft();
                }
            }
            else if (code.charAt(i) == DASH)
            {
                if(current.getRight() == null)
                {
                    current.setRight(new TreeNode(code.substring(0,i+1)));
                    current = current.getRight();
                }
                else
                {
                    current = current.getRight();
                }
            }
        }
        current.setValue(letter);
    }

    /**
     * Converts text into a Morse code message.  Adds a space after a dot-dash
     * sequence for each letter.  Other spaces in the text are transferred directly
     * into the encoded message.
     * Returns the encoded message.
     */
    public static String encode(String text)
    {
        StringBuffer morse = new StringBuffer(400);

        for (int i = 0; i < text.length(); i++)
        {
            String add = codeMap.get(text.toUpperCase().charAt(i));
            if( add != null)
            {
                morse.append(add);
                morse.append(" ");
            }
            else
            {
                morse.append(" ");
            }

        }
        return morse.toString();
    }

    /**
     * Converts a Morse code message into a text string.  Assumes that dot-dash
     * sequences for each letter are separated by one space.  Additional spaces are
     * transferred directly into text.
     * Returns the plain text message.
     */
    public static String decode(String morse)
    {
        StringBuffer text = new StringBuffer(100);
        TreeNode c = decodeTree;
        for ( int i = 0; i < morse.length(); i++)
        {
            if (morse.charAt(i) == '.')
            {
                c = c.getLeft();
            }
            else if (morse.charAt(i) == '-')
            {
                c = c.getRight();
            }
            else
            {
                text.append(c.getValue());
                c = decodeTree;
            }
        }
        return text.toString();
    }

    public static void main(String args[])
    {
        MorseCode mc = new MorseCode();
        mc.start();
        //System.out.println(mc.encode("FOOD"));
        System.out.println(mc.decode(encode("FOOD")));

    }
}
