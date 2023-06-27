class A {
int a1=1000;
}
class B extends A
{
 int a1=100;

 void abc(int a1)
  {
    System.out.println("Hi A class" +this.a1);
    System.out.println("Hi A class" +a1);
System.out.println("Hi A class" +super.a1);
  }
}

class Demo7
{

   public static void main(String args[])
   {

     B b =new B();
     b.abc(10);
   }
}


==============================================================================================================================================
class A
{
 int a1=100;

 void abc(int a1)
  {
    System.out.println("Hi A class" +this.a1);
    System.out.println("Hi A class" +a1);
  }
}

class Demo7
{

   public static void main(String args[])
   {

     A a =new A();
     a.abc(1000);
   }
}