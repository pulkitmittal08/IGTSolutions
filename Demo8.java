class Parent 
{
    int site=5;
    int money=500;
    String car="BMW";

}

class Child extends Parent
{
   int money=100;
    void use()
    {
    System.out.println("Site:" +site);
    System.out.println("Child Money:" +money);
    System.out.println("Parent Money:" +super.money);
    System.out.println("both:" +(super.money+money));
    System.out.println("Car:" +car);
    } 
}


class Demo8
{ 
   public static void main(String args[])
    {
       Child c=new Child();
       c.use();
    }
}
