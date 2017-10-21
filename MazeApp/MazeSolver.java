
/**
 * Abstract class MazeSolver - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class MazeSolver
{
    // instance variables - replace the example below with your own
    MazeSolver (Maze maze)
    {
        this.maze = maze;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    abstract void makeEmpty();
    abstract boolean isEmpty();
    abstract void add(Square sq);
    abstract Square next();
    
    public boolean isSolved()
    {
        if (maze.isEmpty() || )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String getPath()
    {
        return 
    }
    
    public Square step()
    {
        return 
    }
    
    public void solve()
    {
        while (
    }
    
    
}

