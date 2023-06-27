//=========================================================Constructor=================================================================================
import java.util.Scanner;

class Demo3
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the Age?");
    int age=sc.nextInt();

    System.out.print("Enter the Salary?");
    int salary=sc.nextInt();

    System.out.print("Enter the Designation?");
    String designation=sc.next();
   // String designation=sc.nextLine();
    
    System.out.println("Age :" +age); 
    System.out.println("Salary:" +salary);
    System.out.println("Designation:" +designation);
    A a=new A();
    B b=new B();
    C c=new C();

  }
}

class A
 {
    A()
    {
        System.out.println("A class");  
     }
 }

class B
 {
    B()
    {
        System.out.println("B class");  
     }
 }

class C
 {
    C()
    {
        System.out.println("C class");  
     }
 }

//====================================================More Than one Main Method====================================================================

import java.util.Scanner;

class Demo3
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the Age?");
    int age=sc.nextInt();

    System.out.print("Enter the Salary?");
    int salary=sc.nextInt();

    System.out.print("Enter the Designation?");
    String designation=sc.next();
   // String designation=sc.nextLine();
    
    System.out.println("Age :" +age); 
    System.out.println("Salary:" +salary);
    System.out.println("Designation:" +designation);

  }
}

class A
 {
    public static void main(String args[])
    {
        System.out.println("A class");  
     }
 }

class B
 {
    public static void main(String args[])
    {
        System.out.println("B class");  
     }
 }

class C
 {
    public static void main(String args[])
    {
        System.out.println("C class");  
     }
 }