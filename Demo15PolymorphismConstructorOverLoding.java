class A
{

  A()
  {
   System.out.println("A()");
  }

 A(int a)
  {
   System.out.println("A(int)");
  } 

 A(int a, String name)
  {
   System.out.println("A(inta,String name) ");
  }
}

class Demo15PolymorphismConstructorOverLoding
{
  public static void main(String args[])
  {
     A a=new A();
     A a1=new A(100);
     A a2 =new A(200,"suprit");
  }
}


// over loading?

// same constructor name + multiple time +with different parameter + in same class = is called constructor over loading