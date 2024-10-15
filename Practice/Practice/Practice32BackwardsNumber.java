package Practice;

import java.util.Scanner;

public class Practice32BackwardsNumber
{
   public static void main(String [] args)
   {
      int theNum;
      Scanner kb = new Scanner(System.in); 
      System.out.print("Please enter a number: ");
      theNum = Integer.parseInt(kb.nextLine());  
      
      int x=5, copy = theNum;
      while(x > 1)
      {
         x = copy % 10;
         System.out.print(x);
         copy = copy/10;
      }
   }
}
      