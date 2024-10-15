package Practice;

import java.util.Scanner;

public class Practice36Arrays
/*
This prgram goes over:
   Reading arrays
   Filling them by user input
   Printing values from it
   Printing the array forwards and backwards
   Filling them manualy
   Printing them out in proper bracket notation
   Printing them out in a foreach loop (shortcut)
   Calling the array into a method that finds a target in the array and prints out the index
   Building a method to make a copy array so as to not change the original
   Building an array to target a value in the array and return the index
*/
{
   public static void main(final String [] args)
   {
      int [] myArray = null;
      Scanner kb = new Scanner(System.in);
      
      System.out.print("How many items in your array?: ");
      int total = Integer.parseInt(kb.nextLine());
      
      //We set up an Array which is basically a list. At the moment, it is empty
      myArray = new int[total];
      System.out.println(myArray.length); //This tells you how many items are in the list
      
      //And now we're going to fill this list
      for(int x = 0; x < myArray.length; x++)
      {
         System.out.print("Enter an item into the array: ");
         myArray[x] = Integer.parseInt(kb.nextLine());
      }
      
      int mid;   
      int[] copy = new int[myArray.length];
      for(int x = 0; x < myArray.length; x++)
         copy[x] = myArray[x];
         
      SortUtils.selectionSort(copy);
      
      if(copy.length % 2 = 0)
      {
         median = (double)(copy[copy.length/2 - 1] + copy[copy.length/2]) / 2;
      }
      
      else
      {
         mid = copy.length/2;
         median = copy[mid];
      }
/*      
      double midpoint = myArray[0] + myArray[myArray.length-1];
      midpoint = midpoint/2;
      System.out.print(midpoint);
      
      //this gets you the mean
      double mean = 0;
      double totalx = 0;
      int x = 0;
      for(; x < myArray.length; x++)
      {
         totalx = totalx + myArray[x];
      }
      mean = totalx / x;

     
      //printing an array with myArray.length-1
      System.out.println(myArray[myArray.length-1]);
      
      //printing array backwards
      int y = myArray.length-1;
      for(;y >= 0; y--)
      {
         System.out.print(myArray[y]);
         System.out.print(" ");
      }
      System.out.println(" ");//spacer
      
      //printing an array forwards
      int z = 0;
      for(;z < myArray.length; z++)
      {
         System.out.print(myArray[z]);
         System.out.print(" ");
      }
       System.out.println(" ");//spacer
      
      //Another way of printing it backwards
      for(int w = myArray.length-1; w > -1; w--)
      {
         System.out.print(myArray[w]);
         System.out.print(" ");
      }
       System.out.println(" ");//spacer
      
      //You can assign all of the values in the array. Only useful for arrays smaller than 10
      int [] newArray = {30,44,86,78};
      System.out.println(newArray[1]);//calling the second index
      
      //To print out in square brackets
      System.out.print("[");
      for(int x = 0; x < myArray.length - 1; x++)
         System.out.print(myArray[x] + ",");
      System.out.print(myArray[myArray.length-1] + "]");
      System.out.println(" ");//spacer
      
      //To shortcut the for loop and print out the whole array, simply do
      for(int e:myArray)
         System.out.print(e + " ");
         
      //calling the below method linearSearch
      //searching if a target value is inside of an array
      System.out.println("Enter a target: ");
      int target = Integer.parseInt(kb.nextLine());
      
      int res = Practice35Arrays.linearSearch(myArray, target);
      
      //checking the return and making sure the array did have the target
      if(res == -1)
         System.out.println("Target was not in the array.");
      //printing out the index of the target in the array 
      else
      {
         System.out.print("The first time the target is in the array is at index: ");
         System.out.print(res);
      }      
   }//end main method
   
   //This creates a deep copy that will not ruin the original array
   public static int [] copyArray(final int[] originalArray)
   {
      int[] aCopy = new int[originalArray.length];
      for(int x = 0; x < originalArray.length; x++)
         aCopy[x] = originalArray[x];
         
      return aCopy;
   }//end copyArray method
   
   //This is the method to test if a target is in the provided array. To call:  Practice35Arrays.linearSearch(THE ARRAY, THE TARGET);
   public static int linearSearch(final int [] originalArray, final int target)
   {
      if(originalArray == null)
         throw new IllegalArgumentException("Bad Params in linearSearch");
         
      if(originalArray.length == 0)
         return -1;
      //array is not null and not a length of 0
      
      for(int x = 0; x < originalArray.length; x++)
      {
         if(originalArray[x] == target)
            return x;
      }
      return -1;
*/

   }//end linearSearch method 
}//end program