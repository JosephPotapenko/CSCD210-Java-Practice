package Practice;

import java.util.Scanner;

public class Practice28Lab3WithMethodsAndMethodCalls
{
   public static final int YEAR = 2023;
   
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      
      char ltr;
      String name = null;
      int birthyear;
      
      System.out.print("Enter a single alphabetic character: ");
      ltr = kb.nextLine().charAt(0);
      
      System.out.print("Enter your full name (first middle last): ");
      name = kb.nextLine();
      
      System.out.print("Enter your birth year: ");
      birthyear = kb.nextInt();
      
      System.out.println("The first letter of your name is: " + name.charAt(0));
      System.out.println("The last letter of your name is: " + name.charAt(name.length() - 1));
      System.out.println("The middle name is: " + getMiddleName(name));
      System.out.println("The hash code of the last name + YEAR + birth year is: " + (name.substring(name.lastIndexOf(" ") + 1) + YEAR + birthyear).hashCode());
      System.out.println("The name with all " + ltr + "s replaced with ?s: " + replaceLetter(name, ltr));
   }
   
   public static String getMiddleName(String name) {
      int firstSpace = name.indexOf(" ");
      int lastSpace = name.lastIndexOf(" ");
      return name.substring(firstSpace + 1, lastSpace);
   }
   
   public static String replaceLetter(String name, char ltr) {
      return name.replaceAll("(?i)" + ltr, "?");
   }
}
