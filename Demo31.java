interface University
{

   //Universicty(){}
   //int a;
   //void xyz(){}

    //public static final int a=100; for variables
    //public abstract void xyz();   for methods
   void exam();
   void result();

   // java 1.8
  // static void display()
  // {
  // }
        
     //default void aa()
    // {
     //}
}


class IITB implements University
{

  public void exam()
  {
    //online
  }
  public void result ()
  {

   //mail 
  }
}

class IITD implements University
{

  public void exam()
  {
    //offline
  }
  public void result ()
  {

   //web 
  }
}

class IITM implements University
{

  public void exam()
  {
    //offline
  }
  public void result ()
  {

   //newsPaper
  }
}



class Demo31
{
  public static void main(String args[])
  {

    IITM m=new IITM();
     m.exam();
     m.result();
     //create a obj for class and print
  }
}