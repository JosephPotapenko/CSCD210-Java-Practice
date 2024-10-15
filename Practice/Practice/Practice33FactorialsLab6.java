package Practice;

import java.util.Scanner;

public class Practice33FactorialsLab6
{
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in); 
      System.out.print("Please enter a number: ");
      double theNum = Integer.parseInt(kb.nextLine());  
      double sum=1;
    
      for (int x = 1; x <= theNum; x++)
      {
         double factorial = 1;
         for(int y = 1; y <= x; y++)
         {
             factorial = factorial * y;
         }
         sum = sum + (1/factorial);
      }
      System.out.println(sum);
   }
}