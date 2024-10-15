package Practice;

import java.util.Scanner;


public class Practice13
{

   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      int min, max;
      System.out.print("Please enter a min and a max: ");
      int temp = kb.nextInt();
      int temp1 = kb.nextInt();
      
      if(temp > temp1)
      {
         max = temp;
         min = temp1;
      }
      else
      {
         min = temp;
         max = temp1;
      }
      int result = (int)(Math.random() * (max - min + 1));
      System.out.println("Intermediate result: " + result);
      
      result = result + min;
      System.out.println("Final result: " + result);  
      
      Random rand = new Random();
      result = rand.nextInt(max - min +1);
      
      System.out.println("Intermediate result: " + result);
      
      result = result + min;
      System.out.println("Final result: " + result);  
   }
}