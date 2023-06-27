import java.util.*;
class Demo30
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
    System.out.println("M3 method"); 
    Scanner sc=new Scanner (System.in);
     try
      {
          System.out.println("Enter the A value:");
          int a=sc.nextInt();

            System.out.println("Enter the B value:");
           int b=sc.nextInt(); 
            int c=a/b;
             System.out.println("result is:"+c);
        }
         
        catch (ArithmeticException ae)
          {
           System.out.println("hello bro we cant divide anything by /0");
           }

          catch (InputMismatchException ime)
          {
           System.out.println("hello bro please enter the number only..!");
           }
     }
}




