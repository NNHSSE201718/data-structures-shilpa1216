package Gradebook;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
A program to add, remove, modify or print
student names and grades.
 */
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map<String,String > grades = new HashMap<>();
        Set<String> keySet = grades.keySet();
        
        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {
                done = true;
            }
            else if (input.equals("A"))
            {
                System.out.println("Name of person to add");
                String name = in.next().toUpperCase();
                System.out.println("What is their grade?");
                String grade = in.next().toUpperCase();
                grades.put(name, grade);
            }
            else if (input.equals("R"))
            {
                System.out.println("Name of person to remove");
                String rem_name = in.next().toUpperCase();
                grades.remove(rem_name);
            }
            else if (input.equals("M"))
            {
                System.out.println("Name of person to modify");
                String mod_name = in.next().toUpperCase();
                for (String key: keySet)
                {
                    if (key.equals(mod_name))
                    {
                        System.out.println("What is their grade? ");
                        String mod_grade = in.next().toUpperCase();
                        grades.put(mod_name, mod_grade);
                    }
                }
            }
            else if (input.equalsIgnoreCase("P"))
            {
                for (String key: keySet)
                {
                    System.out.println( key + ": " + grades.get( key )); 
                }
            }
            else
            {
                done = true;
            }
        }
    }
}
