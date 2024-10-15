package Practice;

import java.util.Scanner;

public class Practice26
{
   public static void main(String [] args)
   {
      int x=2, y=3;
      while(x<4)
      {
         System.out.print(x);
         x++;
      }
      do
      {
         System.out.print(y);
         y++;
      }while(y<4);
      
      for(x=0; x<=5; x++)
      {
         for( ;y<5;y++)
            System.out.print(" "+x+y);
            
         System.out.println();
      }
      System.out.print("x is:" + x);
      System.out.print("y is:" + y);
            

         
   }// end main

}// end class