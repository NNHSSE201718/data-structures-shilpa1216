
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class MyStackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyStackTest
{
    /**
     * Default constructor for test class MyStackTest
     */
    public MyStackTest()
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
    public void testIsEmpty()
    {
        ArrayList list = new ArrayList();
        MyStack stack = new MyStack();
        stack.push(new Square(2,2,0));

        assertEquals(false,stack.isEmpty());
    }

    @Test
    public void testPop()
    {
        ArrayList list = new ArrayList();
        MyStack stack = new MyStack();
        stack.push(new Square(2,2,0));
        Square sq = new Square(2,2,2);
        stack.push(sq);

        assertEquals(sq,stack.pop());
    }

    @Test
    public void testTop()
    {
        ArrayList list = new ArrayList();
        MyStack stack = new MyStack();
        stack.push(new Square(2,2,0));
        stack.push(new Square(2,5,2));
        stack.push(new Square(3,1,7));
        Square sq = new Square(2,2,2);
        stack.push(sq);

        assertEquals(sq,stack.top());

    }

    @Test
    public void testSize()
    {
        ArrayList list = new ArrayList();
        MyStack stack = new MyStack();
        stack.push(new Square(2,2,0));
        stack.push(new Square(2,5,2));
        stack.push(new Square(3,1,7));

        assertEquals(3,stack.size());
    }

    @Test
    public void testClear()
    {
        ArrayList list = new ArrayList();
        MyStack stack = new MyStack();
        stack.push(new Square(2,2,0));
        stack.push(new Square(2,5,2));
        stack.push(new Square(3,1,7));
        stack.clear();

        assertEquals(0, stack.size());
    }

}
