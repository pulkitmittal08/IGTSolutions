class A
{
  A()
  {
    System.out.println("A Class constructor");
  }
  void abc()
  {
    System.out.println("ABC method");
  }
}

class Demo5
{
  public static void main(String args[])
  {
    
    A a=new A(); //always try to create only once
    a.abc();
    a.abc(); // methids can call multiple time

  }
}





// constructor                      method

//A(){}                               same +other name also

//no return type                      must have return type

//always try crate once               utulise with multiple time

//internally it allocate the memory   but no memory it will just utilize same memory

//as soon as object crate constructor  we have to call 
 will call automatically 