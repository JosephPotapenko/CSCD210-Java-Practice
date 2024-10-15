package Practice;

public class Practice30ReadInANumberMethod
{
   public static int readNum(final String term, final Scanner kb)
   {
      System.out.print("Please enter" + term + "num");
      int num = kb.nextInt();
      kb.nextLine();
      
      return num;
   }
   public static int readNum(final Scanner kb, final String str)
   {
      return SC.readNum(str, kb);
   }
   
}