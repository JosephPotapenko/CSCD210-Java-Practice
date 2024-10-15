package Practice;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Practice10
{
   public static void main(final String [] args)
   {
      
      DecimalFormat df_obj1 = new DecimalFormat("#.##");
      Scanner kb = new Scanner(System.in);
      
      double perimeter, area, rad;
      System.out.println("The radius is 5.5.");
      rad = 5.5;
      perimeter = 2 * 3.1415926535 * rad;
      area = rad * rad * 3.1415926535;
      System.out.println("Perimeter: " + df_obj1.format(perimeter));
      System.out.println("Area: " + df_obj1.format(area));
      
      double perimeter1, area1, rad1;
      System.out.println("The radius is:");
      rad1 = kb.nextDouble(); 
      kb.nextLine();
      
      perimeter1 = 2 * 3.1415926535 * (double)rad1;
      area1 = rad1 * rad1 * 3.1415926535;
      System.out.println("Perimeter: " + df_obj1.format(perimeter1));
      System.out.println("Area: " + df_obj1.format(area1));
   }
}