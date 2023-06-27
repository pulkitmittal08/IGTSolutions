class A
{
  A()
  {
    System.out.println("A Class constructor");
  }
  void abc()
  {
  int a= 20;
  int b=530;
  int c=340;
              if (a>b && a>c)
              {
                System.out.println("A Greater");
              }
              else if (b>a && b>c)
              {
                System.out.println("B Greater ");
              }

              else 
              {
                System.out.println("C Greater ");
              }

  }
}

class Demo6
{
  public static void main(String args[])
  {
    
    A a=new A(); //always try to create only once
    a.abc();

  }
}