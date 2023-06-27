import java.util.Scanner;
class Emp
{
   int id;
   String name;
   int age;
   int salary=2000;
   String designation="Clerk";
   Emp()
   {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the ID?");
     id=sc.nextInt();
    
    System.out.print("Enter the Name?");
     name=sc.next();
    
    System.out.print("Enter the Age?");
     age=sc.nextInt();
    }
    
}


class Clerk extends Emp
{
 
   int salary=2000;
   String designation="Clerk";

     void display()
     {
     System.out.println("Clerk :");
    System.out.println("ID :" +id); 
    System.out.println("Name:" +name);
    System.out.println("Age:" +age); 
    System.out.println("Salary:" +salary);
    System.out.println("Designation:" +designation); 
 
     }
}

class Dev extends Clerk
{

   int salary=3000;
   String designation="Developer";

     void displayDev()
     {
    System.out.println("Developer :");
    System.out.println("ID :" +id); 
    System.out.println("Name:" +name);
    System.out.println("Age:" +age); 
    System.out.println("Salary:" +salary);
    System.out.println("Designation:" +designation); 
     }
}

class Manager extends Dev
{

   int salary=4000;
   String designation="Manager";

     void displayManager()
     {
     System.out.println("Manager :");
    System.out.println("ID :" +id); 
    System.out.println("Name:" +name);
    System.out.println("Age:" +age); 
    System.out.println("Salary:" +salary);
    System.out.println("Designation:" +designation); 
     }
}

class Tester extends Manager
{

   int salary=6000;
   String designation="Tester";

     void displayTester()
     {
    System.out.println("Tester :"); 
    System.out.println("ID :" +id); 
    System.out.println("Name:" +name);
    System.out.println("Age:" +age); 
    System.out.println("Salary:" +salary);
    System.out.println("Designation:" +designation); 
     }
}

class Demo9Project
{
  
   public static void main(String args[])
   { 
     int number=0;
     Scanner sc=new Scanner(System.in);
    do{ 
     System.out.println("1 ) Clerk");
     System.out.println("2 ) Developer");
     System.out.println("3 ) Tester");
     System.out.println("4 ) Manager");
     System.out.println("5 ) Exit");
     System.out.print("Enter the Choise?");
     number=sc.nextInt();
     
    if (number==1)
    {
     Clerk c=new Clerk();
       c.display();
    }
    else if (number==2)
    {
     Dev d=new Dev();
       d.displayDev();
    }
    else if (number==3)
    {
     Manager m=new Manager();
       m.displayManager();
    }

    else if (number==4)
    {
     Tester t=new Tester();
       t.displayTester();
    }
   else if(number==5)
   {
      System.out.println("Thank You");
      System.exit(0);
   }

  }while (number<=4);
 }
}

