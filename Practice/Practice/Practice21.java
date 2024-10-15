package Practice;

import java.util.*;


public class Practice21
{

   public static final int MAX = 100, MIN = 1, MAXTRYS = 3;
   
   public static void main(String [] args)
   {
      int theNum, theGuess = 1, trys;
      Scanner kb = new Scanner(System.in);
      String goAgain = "";
      
     
      
      
      do
      {
         theNum = (int)(Math.random()*(MAX - MIN +1)) +MIN;
         System.out.println(theNum);
         trys =  1; 
         
         
         do
         {
            System.out.printf("Please enter a number between %d and %d inclusive: ", MIN,MAX);
            theGuess = Integer.parseInt(kb.nextLine());
            
            while(theGuess < MIN || theGuess > MAX)
            {
               
               System.out.printf("Please enter a number between %d and %d inclusive: ", MIN,MAX);
               theGuess = Integer.parseInt(kb.nextLine());
               
             }
             
             if(theGuess > theNum)
             {
               System.out.printf("Too High\nYou have %d trys remaining\n",(MAXTRYS - trys));
               trys++;
             }
             else
               System.out.println("Congrats");
         }while( theNum != theGuess && trys <= MAXTRYS);
      

   }while(goAgain.equals("yes"));
}
}
      