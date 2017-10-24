
/**
 * Write a description of class MazeSolverQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeSolverQueue extends MazeSolver
{
    // instance variables - replace the example below with your own
    MyQueue<Square> q = new MyQueue<Square>();
    

    /**
     * Constructor for objects of class MazeSolverQueue
     */
    public MazeSolverQueue(Maze maze)
    {
        super(maze);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void init()
    {
        q = new MyQueue<>();
    }
    
    public void makeEmpty()
    {
        q.clear();
    }
    
    public boolean isEmpty()
    {
        return q.isEmpty();
    }
    
    public void add(Square sq)
    {
        q.enqueue(sq);
    }
    
    public Square next()
    {
        return q.dequeue();
    }
}

