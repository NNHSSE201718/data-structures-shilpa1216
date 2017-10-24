import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class MyStack here.
 *
 * @author ssathyanathan
 * @version 10/16/17
 */
public class MyStack<T> implements StackADT<T> 
{
    // instance variables - replace the example below with your own
    private ArrayList<T> arrayList;

    /**
     * Constructor for objects of class MyStack
     */
    public MyStack() 
    {
        // initialise instance variables
        arrayList = new ArrayList();
    }

    public boolean isEmpty()
    {
        return (arrayList.size() == 0);       
    }

    public void push(T item)
    {
        arrayList.add(item);
    }

    public T pop() throws NoSuchElementException
    {        
        T topOfStack = null;
        if (!isEmpty()) 
        {
            topOfStack = arrayList.remove(arrayList.size()-1);
        }
        else
        {
            throw new NoSuchElementException ("Pop attempted on an empty");
        }

        return topOfStack;

    }

    public T top()
    {
        if(arrayList.size() >0)
        {
            return arrayList.get(arrayList.size()-1);
        }
        else
        {
            throw new NoSuchElementException();
        }

    } 

    public int size()
    {
        return arrayList.size();
    }

    public void clear()
    {
        ArrayList list2 = new ArrayList();
        arrayList = list2;
    }

}
