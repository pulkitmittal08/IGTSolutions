class Bank{


   public int loan()
   {
   return 8;
   }
}


class SBI extends Bank{

}

class Axis extends Bank{


   public int loan()
   { 
   //same method name but different implementation in child classs!!!  over riding
   return 10;
   }
}

class Demo20PolymorphismMethodOverRiding
{ 
   public static void main(String args[])
    {
        SBI s=new SBI();
        System.out.println(s.loan()+" % ");
        
           Axis a=new Axis();
        System.out.println(a.loan()+" % ");
    }
}
