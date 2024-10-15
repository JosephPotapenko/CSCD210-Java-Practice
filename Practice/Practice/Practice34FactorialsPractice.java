package Practice;

import java.util.Scanner;

public class Practice34FactorialsPractice
{
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in); 
      System.out.print("Please enter a number: ");
      double n = Integer.parseInt(kb.nextLine());  
      double sum=1;

      for (double x = 1; x <= n; x++)
      {
         double factorial = 1;
         
         for (double y = 1; y <= x; y++) {
            factorial *= y;

      }
            
         sum += (1/factorial);
      }
      System.out.println(sum); 
   }
   
   
}
  