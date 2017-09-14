package Sieve;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

/**
A program that implements the sieve of Eratosthenes.
 */
public class Sieve
{
    public static void main(String[] args)
    {

        //Scanner in = new Scanner(System.in);
        //System.out.println("Compute primes up to which integer?");

        int n = 20;
        int o = 2;
        Set<Integer> numbers = new HashSet<>();
        Iterator<Integer> iterator = numbers.iterator();
        // Your work goes here
        int current = 2;
        for(current = 2; current < n; current++)
        {
            numbers.add(current);
        }
        
        iterator.next();
        while (iterator.hasNext())
        {
            iterator.next();
            int num_1 = iterator.next();
            //if ((num_1 % current) == 0 && num_1 != current)
            //{
                iterator.remove();
            //}
        }

        System.out.println(numbers);

    }


}
