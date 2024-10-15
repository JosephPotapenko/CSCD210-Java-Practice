package Practice;

import java.util.Scanner;


public class Practice20
{

   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
    //  System.out.print("Enter num: ");
    //  int num = kb.nextInt();
    //  kb.nextLine();
      
      int x=0;
      do
      {
         System.out.print(x);
         x++;
      }while(x<3);
      
      kb.nextLine();
      
      int y=0;
      do
      {
         y++;
         System.out.print(y);
      }while(y<3);
            
      kb.nextLine();
      
      int z=3;
      do
      {
         z++;
         System.out.print(z);
      }while(z<3);

   }
}