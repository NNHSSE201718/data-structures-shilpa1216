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
    private Node<T> first;
    private int size;
    public MyQueue()
    {
        first = null;
    }

    /**
     * Constructor for objects of class MyQueue
     */
    public void enqueue(T item)
    {
        Node<T> newNode = new Node<>();
        newNode.data = item;
        newNode.next = this.first;
        this.first = newNode;
        size++;
    }

    public T dequeue() throws NoSuchElementException
    {
        Node<T> n = new Node();
        n = this.first;
        while (n.next.next != null)
        {
            n = n.next;
        } 
        Node<T> end = n.next;
        n.next = null;
        return end.data;
    }

    public T front() throws NoSuchElementException
    {
        Node<T> n = new Node();
        n = this.first;
        while (n.next != null)
        {
            n = n.next;
        } 

        return n.data;
    }

    public int size()
    {
        return this.size;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public void clear()
    {
        this.first = null;
        this.size = 0;
    }

}
class Node<T> 
{
    public T data;
    public Node next;
}