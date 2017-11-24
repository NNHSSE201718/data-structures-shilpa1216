

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class MazeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MazeTest
{
    /**
     * Default constructor for test class MazeTest
     */
    public MazeTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        
    }
    
    @Test
    public void testLoadMaze()
    {
        Maze maze = new Maze();
        assertEquals(true, maze.loadMaze("maze-2"));
    }
    
    @Test
    public void testLoadMaze2()
    {
        Maze maze = new Maze();
        assertEquals(false, maze.loadMaze("shilpa"));
    }
    
    @Test
    public void testFinish()
    {
        Maze maze = new Maze();
        maze.loadMaze("maze-2");
        assertEquals(3,maze.getFinish().getType());
        
    }
    
    @Test
    public void testStart()
    {
        Maze maze = new Maze();
        maze.loadMaze("maze-2");
        assertEquals(2,maze.getStart().getType());
    }
    
    @Test
    public void testGetNeighbors()
    {
        Maze maze = new Maze();
        maze.loadMaze("maze-2");
        ArrayList<Square> neighbors = new ArrayList();
        
        neighbors.add(new Square(1,2,0));
        neighbors.add(new Square(2,3,0));
        neighbors.add(new Square(3,2,0));
        neighbors.add(new Square(2,1,1));        
        assertEquals(neighbors, maze.getNeighbors(new Square(2,2,0))); 
        
    }
    
    @Test
    public void testReset()
    {
    }

    
}
