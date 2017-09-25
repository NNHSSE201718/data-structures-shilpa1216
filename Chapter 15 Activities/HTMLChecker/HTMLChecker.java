package HTMLChecker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
Write a program that checks whether a sequence of HTML tags
is properly nested. For each opening tag, such as <p>, there
must be a closing tag </p>. A tag such as <p> may have other
tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>

The inner tags must be closed before the outer ones.
Your program should process a file containing tags.
For simplicity, assume that the tags are separated by
spaces, and that there is no text inside the tags.
 */
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "HTMLChecker/TagSample1.html";
        Stack tags = new Stack<>();
        String build = "hi";
        try (Scanner in = new Scanner(new File(filename)))
        {
            // Your code goes here
            while (in.hasNext())
            {
                if (in.next().equals("<"))
                {
                    System.out.println("hi");
                    while(!in.next().equals(">") )
                    {
                        in.next();
                        build = build + in.next();
                        System.out.print(build);
                    }                    
                }
                if(build.contains("/"))
                {
                    
                    tags.pop();
                }
                else
                {
                    tags.push(build);
                }
                build = "";
            }
            
            if (tags.size() > 0)
            {
                System.out.println("The code has errors");
                
            }
            else
            {
                System.out.println("This good is good dude!!!");
            }
            
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}
