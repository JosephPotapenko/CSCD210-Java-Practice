package Practice;

public class Practice29ExplanationOfMethods
{
   public static int readNum(final String term, final Scanner kb)
   {
      int num = SC.readNum();                //1 doesn't take parameters. returns int
      double num2 = SC.readNum(kb);          //2 takes parameters. returns double
      SC.calcAvg(num2, num, SC.readNum());   //3 takes parameters. unsure if returns
      
   }
}