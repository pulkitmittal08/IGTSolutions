import java.util.Scanner;
class A
{
  int firstNumber;
  int secondNumber;
  A()
  {
    System.out.println("A Class constructor");
    Scanner sc =new Scanner(System.in);
     System.out.print("Enter the FirstNumber?");
     firstNumber=sc.nextInt();

    System.out.print("Enter the SecondNumber?");
     secondNumber=sc.nextInt();

  }
  void abc()
  {
              if (firstNumber >= secondNumber)
              {
                System.out.println("firstNumber Greater");
              }
              else 
              {
                System.out.println("secondNumber Greater ");
              }

  }
}

class Max2
{
  public static void main(String args[])
  {
    
    A a=new A(); //always try to create only once
    a.abc();

  }
}