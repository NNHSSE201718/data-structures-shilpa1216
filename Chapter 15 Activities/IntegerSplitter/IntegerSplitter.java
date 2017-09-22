package IntegerSplitter;

import java.util.Scanner;
import java.util.Stack;
/**
Class for splitting an integer into its individual digits.
 */
public class IntegerSplitter
{
    /**
    Splits the given integer into its individual digits
    and prints them to the screen.
    @param number Integer to be split.
     */
    public static void split(int number)
    {
        // Complete this method. Use a Stack

        Stack<String> digits = new Stack<>();
        Stack<String> output = new Stack<>();

        int n = number;
        String str = " " + number;
        for(int l = 0; str.length(); l++)
        {
            digits.push(str.substring(1,l+1));
            n = n/10;
        }
        


    }
}
