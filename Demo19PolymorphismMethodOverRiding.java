class A{


   public void display()
   {
   System.out.println("HII");
   }
}


class B extends A{


   public void display()
   { 
   //same method name but different implementation in child classs!!!  over riding
   System.out.println("Hello");
   }
}

class Demo19PolymorphismMethodOverRiding
{ 
   public static void main(String args[])
    {
      B b=new B();
      b.display();

    }
}
