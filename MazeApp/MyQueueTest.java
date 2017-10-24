import java.util.NoSuchElementException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyQueueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyQueueTest
{
    /**
     * Default constructor for test class MyQueueTest
     */
    public MyQueueTest()
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
    public void testEnqueue()
    {
        MyQueue q = new MyQueue();
        Square sq1 = new Square(0,0,0);
        Square sq2 = new Square(0,0,1);
        q.enqueue(sq1);
        q.enqueue(sq2);

    }

    @Test 
    public void testDequeue()
    {
        MyQueue q = new MyQueue();
        Square sq1 = new Square(0,0,0);
        Square sq2 = new Square(0,0,1);
        q.enqueue(sq1);
        q.enqueue(sq2);

        assertEquals(sq1,q.dequeue());
    }

    @Test
    public void testClear()
    {
        MyQueue q = new MyQueue();
        q.enqueue(new Square(2,2,2));
        q.enqueue(new Square(1,1,1));
        q.clear();

        assertEquals(true, q.isEmpty());
    }

    @Test
    public void testFront()
    {
        MyQueue q = new MyQueue();
        Square sq1 = new Square(0,0,0);
        Square sq2 = new Square(0,0,1);
        q.enqueue(sq1);
        q.enqueue(sq2);
        
        assertEquals(sq1, q.front());
    }

    @Test
    public void testSize()
    {
        MyQueue q = new MyQueue();
        Square sq1 = new Square(0,0,0);
        Square sq2 = new Square(0,0,1);
        q.enqueue(sq1);
        q.enqueue(sq2);

        assertEquals(2,q.size());
    }

    @Test
    public void isEmpty()
    {
        MyQueue q = new MyQueue();
        Square sq1 = new Square(0,0,0);
        Square sq2 = new Square(0,0,1);
        q.enqueue(sq1);
        q.enqueue(sq2);

        q.clear();

        assertEquals(true, q.isEmpty());
    }

}
