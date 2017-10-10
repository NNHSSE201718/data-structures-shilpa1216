
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

    /**
     * Constructor for objects of class Square
     */
    public Square(int row, int col, int type)
    {
        // initialise instance variables
        this.type = type;
        this.row = row;
        this.col = col;
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
        return "empty space (0) \n # - wall (1) \n S - Start (2) \n E - Exit (3) \n \n o - is on the solver work list- has been explored \n x - is on the final path to the exit";
    }
}
