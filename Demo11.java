class A
{
    A()
      {
      System.out.println("A Class");
       // if i create a child class object automatically parent class default constructor wil call...!
      }
}

class B extends A
{
    B()
      {
      System.out.println("B Class");
      }
}



class Demo11
{
  public static void main(String args[])
  {
     // A a=new A();
      //B b=new B();

      B b=new B();
  }
}