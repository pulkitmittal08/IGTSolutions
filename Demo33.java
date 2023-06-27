
import java.io.*;
class Demo33
{
   public static void main (String args[])
   {
    m1();
   }
   
   static void m1() 
   {
    m2();
        System.out.println("M1 method");
    }
   static void m2()
   {
    m3();
        System.out.println("M2 method");
    }

  static void m3()
  {
             try 
                  {
                      File f=new File("abc.txt");
                      FileReader fi=new FileReader(f);
                  }
             catch(FileNotFoundException e)
                 {
                     System.out.println("Some thing went wrong with file");
                  }
               finally 
                {
                    System.out.println("Thanks You...!");
                }
     }
}

//throws 
   //to handle the checked exception
   //it will pass the exception to the caller method
  //so better always usse try catch block

