/**
   A program that demonstrates the LinkedList class
*/
public class ListDemo
{
   public static void main(String[] args)
   {
      //create LinkedList and add to it
      LinkedList staff = new LinkedList();
      staff.addFirst("Tom");
      staff.addFirst("Romeo");
      staff.addFirst("Harry");
      staff.addFirst("Diana");

      // | in the comments indicates the iterator position
      ListIterator iterator = staff.listIterator();
      iterator.next();
      iterator.next();

      // Add more elements after second element
      iterator.add("Juliet");
      iterator.add("Nina");
      

      // Remove Romeo
      iterator.next();
      iterator.remove();


      // Print all elements

      iterator = staff.listIterator();
      while (iterator.hasNext())
      {
         System.out.print(iterator.next() + " ");
      }
      System.out.println();
   }
}
