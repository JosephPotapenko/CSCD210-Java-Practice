package Practice;

import java.util.Scanner;

public class Practice27SortsThreeReadInts //This program sorts 3 entered numbers largest to smallest
{
   public static void main(String [] args)
   {
      int num1, num2, num3;
      Scanner kb = new Scanner(System.in);
   
      System.out.print("Please enter an int: ");
      num1 = Integer.parseInt(kb.nextLine());
    
      System.out.print("Please enter another int: ");
      num2 = Integer.parseInt(kb.nextLine());
      
      System.out.print("Please enter a third int: ");
      num3 = Integer.parseInt(kb.nextLine());
    
      if(num1 >= num2 && num1 >= num3)
      {
         if(num2 >= num3)
            System.out.println(num1 + ", " + num2 + ", " + num3);
         
         else
            System.out.println(num1 + ", " + num3 + ", " + num2);
      }
    
      else if(num2 >= num3 && num2 >= num1)
      {
         if(num3 >= num1)
            System.out.println(num2 + ", " + num3 + ", " + num1);
         
         else
            System.out.println(num2 + ", " + num1 + ", " + num3);
      }
    
      else
      {
         if(num2 >= num1)
            System.out.println(num3 + num2 + num1);
         
         else
            System.out.println(num3 + num1 + num2);
      }
   }
}