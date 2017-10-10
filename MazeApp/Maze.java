import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
/**
 * Write a description of class Maze here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maze
{
    // instance variables - replace the example below with your own
    private int x;
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
}
