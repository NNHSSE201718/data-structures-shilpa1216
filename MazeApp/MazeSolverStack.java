
/**
 * Write a description of class MazeSolverStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeSolverStack extends MazeSolver
{
    // instance variables - replace the example below with your own
    MyStack<Square> stack;

    /**
     * Constructor for objects of class MazeSolverStack
     */
    public MazeSolverStack(Maze maze)
    {
       super(maze);
    }
    
    public void makeEmpty()
    {
        stack = new MyStack<Square>();
    }
    
    boolean isEmpty()
    {
        return stack.isEmpty();
    }
    
    void add(Square sq)
    {
        stack.push(sq);
    }
    
    public Square next()
    {
        return stack.pop();
    }

}
