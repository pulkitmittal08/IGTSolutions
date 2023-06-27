class A
{
   static int x=10;
   static void abc()
   {
     System.out.println("HI abc method");
   }
}

class Demo23Static
{

  public static void main(String agrs[])
  {
    //A a=new A();
    //a.abc();
    //System.out.println("X:"+a.x);
    A.abc();
    System.out.println("X:"+A.x);
   }
}

//static :it will not belong to object
// without creating a object we can access