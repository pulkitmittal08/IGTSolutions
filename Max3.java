import java.util.Scanner;
class A
{
  int firstNumber;
  int secondNumber;
  int thirdNumber;
  A()
  {
    System.out.println("A Class constructor");
    Scanner sc =new Scanner(System.in);
     System.out.print("Enter the FirstNumber?");
     firstNumber=sc.nextInt();

    System.out.print("Enter the SecondNumber?");
     secondNumber=sc.nextInt();

         System.out.print("Enter the ThirdNumber?");
     thirdNumber=sc.nextInt();

  }
  void abc()
  {
              if (firstNumber > secondNumber && firstNumber>thirdNumber)
              {
                System.out.println("firstNumber Greater");
              }
                 else if(secondNumber >firstNumber && secondNumber > thirdNumber )
              {
                System.out.println("secondNumber Greater ");
              }

              else 
              {
                System.out.println("thirdNumber  Greater ");
              }

  }
}

class Max3
{
  public static void main(String args[])
  {
    
    A a=new A(); //always try to create only once
    a.abc();

  }
}