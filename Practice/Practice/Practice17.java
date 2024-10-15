package Practice;

import java.util.Scanner;


public class Practice17
{

   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in); 
      System.out.print("Please enter a number between 1 & 10 inclusive");
      int num = kb.nextInt();
      kb.nextLine();
      
      while(num < 1 || num > 10)
      {
         System.out.print("Please enter a number between 1 & 10 inclusive");
         num = kb.nextInt();
         kb.nextLine();
      }
      
   }
}