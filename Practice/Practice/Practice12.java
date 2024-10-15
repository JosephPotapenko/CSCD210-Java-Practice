package Practice; //In class for lab 3 01/20/2023

import java.util.Scanner;

public class Practice12
{

   public static void main(final String [] args)
   {
      
      Scanner kb = new Scanner(System.in);
      String num = ""; // String name = new String("");
      double time = 0;
      
      System.out.print("Please enter a number: ");
      num = kb.nextLine(); 
      System.out.println(num);
      
      char ltr = num.charAt(0);
      
      int res = (int) (ltr- '0'); 
      
      //int res = Intger.compare(Integer.parseInt("12"), Integer.parseInt("100"));
      //int res = Intger.valueOf("12").compareTo(Integer.valueOf("100"));

   }
  
}