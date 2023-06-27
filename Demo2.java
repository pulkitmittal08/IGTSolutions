import java.util.Scanner;

class Demo2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the ID ?");
    int uid=sc.nextInt();

    System.out.print("Enter the Name ?");
    String name=sc.next();
    
    System.out.println("ID :" +uid); 
    System.out.println("Name :" +name);

  }
}

=============================================================================================================

import java.util.Scanner;

class Demo2
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


