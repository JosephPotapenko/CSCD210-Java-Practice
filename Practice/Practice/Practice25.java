package Practice;

import java.util.*;


public class Practice25
{
	public static void main(String arg[])	
	{
      // Build Scanner object
      Scanner kb = new Scanner(System.in);   
      int theNum, counter, y, x;
      
      // User input for number to work through
      System.out.print("Please enter a positive number: ");
      theNum = Integer.parseInt(kb.nextLine());
      
      
      //Ensures theNum is positive   
      while(theNum < 1)
      {
         System.out.print("Your input was negative. Enter a positive number or the program will not continue: ");
         theNum = Integer.parseInt(kb.nextLine());
      }//end while loop
      
                     // So basically- make a for loop that says for int between 2 and the num, print prime
                     // Then- we have a nested for loop that divides the int above by every number between 2 and it and then prints if nothing is divisable
                     x = 0;
                     System.out.printf("The prime numbers between 0 and %d are: ", theNum);
                     
                     // So here we are basically just running through all the numbers between 1 to theNum
                     for(x = 1; x <= theNum; x++)
                     {
                        counter = 0; //Initializing counter 
                        
                        // and here we are checking if every single number (x) is prime or not
                        for(y = 1; y <= x; y++)
                           {
                              if(x % y == 0) //basically dividing every x value by every value
                              {
                                 counter++; //using the counter to add up both the 1/1 = 0 and the x/x = 0
                              }
                           }
                           if(counter == 2) // the only time the counter is gonna equal 0 is at 1/1 and x/x, so we put a gaurd statement only allowing those two instances to pass
                           {
                              System.out.print(x + " ");
                           }
                           else
                           {
                           }   
                     }        
	}
}