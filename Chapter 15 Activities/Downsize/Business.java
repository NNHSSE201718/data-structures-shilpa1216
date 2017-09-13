package Downsize;
import java.util.ListIterator;
import java.util.LinkedList;

/**
Business utility methods.
 */
public class Business
{
    /**
    Removes every nth element from the linked list
    @param employeeNames the linked list to remove from
    @param n the parameter to determine "nth"
     */
    public static void downsize(LinkedList<String> employeeNames, int n)
    {
        ListIterator<String> iterator = employeeNames.listIterator();
        int number = 1;
        int x = employeeNames.size();
        for (number = 1; number <= x; number++)
        {
            iterator.next();
            if( number % n == 0)
            {
                iterator.remove();
            }
        }
    }
}
