package Practice;

import java.util.Scanner;

public class Practice31AverageOfTheDigitsInTheNumberAddedTogether
{
   public static void main(String [] args)
   {  
      int num, num1;
      
      Scanner kb = new Scanner(System.in);
   
      System.out.print("Please enter an num: ");
      num = Integer.parseInt(kb.nextLine());
      
      int count = 0;
      double sum = 0;
      while(num > 0)
      {
         num1 = num % 10;
         count++;
         sum = sum + num1;
         num = num / 10;
      }
      System.out.println(sum/count);
   }
}
      