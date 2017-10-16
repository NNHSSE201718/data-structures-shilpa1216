import java.util.NoSuchElementException;
import java.util.LinkedList;

/**
 * Write a description of class MyQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyQueue<T> implements QueueADT<T> 
{
    // instance variables - replace the example below with your own
    LinkedList list = new LinkedList();
    
    public MyQueue(LinkedList list)
    {
        this.list = list;
    }

    /**
     * Constructor for objects of class MyQueue
     */
    public void enqueue(T item)
    {
        list.add(item);
    }

    public T dequeue() throws NoSuchElementException
    {
        
    }
    
    public T front() throws NoSuchElementException
    {
        list.peek();
    }
    
    public int size()
    {
        return list.size();
    }
    
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    public void clear()
    {
        for (int i = 0; i < list.size(); i++)
        {
            list.remove(i);
        }
    }
    
}
