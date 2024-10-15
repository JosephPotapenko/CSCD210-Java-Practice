package Practice;

import java.util.Scanner;

public class Practice37BinarySearch
{
   public static int binarySearch(final int[] a, final int target)
   {
      //preconditions
      if(a[0] > target || a[a.length-1] < target)
         return -1;
      int min = 0, max = a.length-1, mid;
      do
      {
         mid = (min + max)/2;
         if(a[mid] > target)
            max = mid - 1;
         else if(a[mid] < target)
            min = mid + 1;
         else
            return mid;
      }while(min <= max);
      return -1; 
   }
}