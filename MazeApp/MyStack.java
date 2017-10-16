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
    public MyStack(ArrayList list) 
    {
        // initialise instance variables
        this.arrayList = list;
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
        
        return arrayList.remove(arrayList.size()-1);
    } 

    public T top()
    {
        return arrayList.get(arrayList.size()-1);
    }  
    
    public int size()
    {
        return arrayList.size();
    }

    public void clear()
    {
        for( int i = 0; i < arrayList.size(); i++)
        {
            arrayList.remove(i);
        }
    }
    
}
