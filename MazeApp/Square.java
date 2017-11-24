
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
    // instance variables - replace the example below with your own
    private int type;
    private int row;
    private int col;
    private Square previous;
    /**
     * Constructor for objects of class Square
     */
    public Square(int row, int col, int type)
    {
        // initialise instance variables
        this.type = type;
        this.row = row;
        this.col = col;
        previous = null;
    }

    public int getRow()
    {
        return this.row;
    }

    public int getCol()
    {
        return this.col;
    }

    public int getType()
    {
        return this.type;
    }

    public String toString()
    {
        if (this.type == 0) 
        {
            return "_";
        }
        else if (this.type == 1)
        {
            return "#";
        }
        else if (this.type == 2)
        {
            return "S";
        }
        else if (this.type == 3)
        {
            return "E";
        }
        else if(this.type == 4)
        {
            return ".";
        }
        else if (this.type == 5)
        {
            return "o";
        }
        else
        {
            return "x";
        }
    }

        public Square getPrevious()
    {
        return this.previous;
    }    
    
    public void setType(int type)
    {
        this.type = type;
    }
    
    public void setPrevious(Square sq)
    {
        this.previous = sq;
    }
    
    public boolean equals(Square sq)
    {
        return (sq.getRow() == this.getRow() && sq.getCol() == this.getCol() && sq.getType() == this.getType());

    }
}
