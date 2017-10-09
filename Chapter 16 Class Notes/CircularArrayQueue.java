import java.util.NoSuchElementException;

/**
An implementation of a queue as a circular array.
 */
public class CircularArrayQueue
{
    private Object[] elements;
    //private data
    private int head;
    private int tail;
    private int currentSize;

    /**
    Constructs an empty queue.
     */

    public CircularArrayQueue()
    {
        final int INITIAL_SIZE = 10;
        this.head = head;
        this.tail = tail;
        this.elements = new Object [INITIAL_SIZE];
        this.currentSize = 0;
    }

    /**
    Checks whether this queue is empty.
    @return true if this queue is empty
     */
    public boolean empty()
    {
        return this.currentSize == 0;
    }

    /**
    Adds an element to the tail of this queue.
    @param newElement the element to add
     */

    public void add( Object newElement)
    {
        this.growIfNecessary();

        this.currentSize++;
        this.elements[this.tail] = newElement;
        this.tail++;
        this.tail %= this.elements.length;

    }

    /**
    Removes an element from the head of this queue.
    @return the removed element
     */
    public Object remove()
    {
        if (this.currentSize == 0)
        {
            throw new NoSuchElementException();
        }

        Object remove = this.elements[this.head];
        this.currentSize --;
        this.head = (this.head+1) % this.elements.length;
        return remove;
    }

    /**
    Grows the element array if the current size equals the capacity.
     */

    private void growIfNecessary()
    {
        if (this.currentSize == this.elements.length)
        {
            Object[] newElements = new Object[2 * this.elements.length];
            for (int i = 0; i < this.elements.length; i++)
            {
                newElements[i] = this.elements[(head + i) % this.elements.length];
            }
            this.elements = newElements;
            this.head = 0;
            this.tail = currentSize;
        }

    }

}//CircularArrayQueue
