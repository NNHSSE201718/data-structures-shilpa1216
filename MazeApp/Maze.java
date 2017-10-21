import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.ArrayList;
/**
 * Write a description of class Maze here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maze
{
    // instance variables - replace the example below with your own
    private Square start;
    private Square exit;
    Square[][] maze;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean loadMaze(String fname) 
    {
        try {
            File file = new File(fname);
            Scanner s = new Scanner(file);
            int numRows = s.nextInt();
            int numCols = s.nextInt();
            this.maze = new Square[numRows][numCols];

            for (int row=0; row < numRows; row++) {
                for (int col=0; col < numCols; col++) {
                    maze[row][col] = null;
                }
            }

            return true;
        }
        catch (FileNotFoundException e)
        {
            return false;
        }
        catch (InputMismatchException i)
        {
            System.out.println("Incorrect file");
            return false;
        }
    }

    public ArrayList<Square> getNeighbors(Square sq)
    {
        ArrayList<Square> neighbors = new ArrayList<Square>();
        int row = sq.getRow();
        int col = sq.getCol();

        if (!(row == 0))
        {
            neighbors.add(maze[row-1][col]);
        }

        if (!(col == maze[0].length))
        {
            neighbors.add(maze[row][col+1]);
        }

        if (!(row == maze.length))
        {
            neighbors.add(maze[row+1][col]);
        }

        if (!(col == 0))
        {
            neighbors.add(maze[row][col-1]);
        }

        return neighbors;
    }

    public Square getStart()
    {
        for (int row=0; row < maze.length; row++) {
            for (int col=0; col < maze[0].length; col++) {

                if (maze[row][col].getType() == 2)
                {
                    start = maze[row][col];
                }
            }
        }

        return start;
    }

    public Square getFinish()
    {
        for (int row=0; row < maze.length; row++) {
            for (int col=0; col < maze[0].length; col++) {

                if (maze[row][col].getType() == 3)
                {
                    exit = maze[row][col]; 
                }
            }
        }
        return exit;
    }

    public void reset()
    {
        for (int row=0; row < maze.length; row++) 
        {
            for (int col=0; col < maze[0].length; col++) {
                maze[row][col].reset();
            }
        }
    }

    public String toString()
    {
        String toReturn = "";
        for (int row=0; row < maze.length; row++) 
        {
            for (int col=0; col < maze[0].length; col++) {
                toReturn = toReturn + maze[row][col].toString();
            }
        }
        return toReturn;
    }
    
    
}

