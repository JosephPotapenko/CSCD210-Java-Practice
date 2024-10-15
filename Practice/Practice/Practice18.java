package Practice;

import java.util.Scanner;


public class Practice18
{

   public static void main(String [] args)
   {
   //turn 543201 -> 102345
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter num: ");
      int num = kb.nextInt();
      kb.nextLine();
      
      String result = num + "";
      int len = result.length();
      int x = len - 1;
      
      while (x >= 0)
      {
         System.out.print(result.charAt(x));
         x--;
      }
   }
}