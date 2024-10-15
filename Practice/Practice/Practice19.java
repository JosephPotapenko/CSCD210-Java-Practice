package Practice;

import java.util.Scanner;


public class Practice19
{

   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter num: ");
      int num = kb.nextInt();
      kb.nextLine();
      
      
      while (num > 0)
      {
          int res = num % 10;
          System.out.print(res);
          num /= 10; // num = num/10
      }
   }
}