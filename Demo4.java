import java.util.Scanner;

class A
 {
   int age;
   int salary;
   String designation;
   
    A()
    {
        System.out.println("A class"); 
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the Age?");
    age=sc.nextInt();

    System.out.print("Enter the Salary?");
    salary=sc.nextInt();

    System.out.print("Enter the Designation?");
    designation=sc.next();
    
     }
 

void display()
{
    
    System.out.println("Age :" +age); 
    System.out.println("Salary:" +salary);
    System.out.println("Designation:" +designation); 
}
}

class Demo4
{
  public static void main(String args[])
  {
    
    System.out.println("Demo 4");
    A a=new A();
    a.display();

  }
}




