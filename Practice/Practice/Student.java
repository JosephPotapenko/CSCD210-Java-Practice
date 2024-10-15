public class Student
{
   private String name;
   private int id;
   
   public Student()
   {
      this.name = "Ima Nerd";
      this.id = 123456789;
   
   }
   
   public Student(final String name, final int id)
   {
      if(name == null || nam.isBlank())
         throw new IllegalArgumentException("bad params Student");
         
      this.name = name;
      this.id = id;
   
   
   }
   
   public Student(final String name, final int id)
   {
      this(name, id);
   }
   
   @Override
   public String toString()
   {
      String temp = "Name" + this.name + "\nID:" + this.id;
      return temp;
      
   
}