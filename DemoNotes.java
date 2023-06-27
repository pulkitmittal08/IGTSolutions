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












======================================= Abstraction ========================================
 

Hide the implementation and just show the funcunality to the end use 
 

Hide the implementation
 
        how to hide   ?
                by make method as Abstract 

                if method is abstract the class must be abstract 
 
                if class is abstract we cant able to create a object of abstract class
 

                then hiow or where to provide the logic or body for the method ?

                in child class we can provide thebody....!