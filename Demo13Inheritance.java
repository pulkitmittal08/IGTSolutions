   single level Inheritane 
 
class A
{
 
}
class B extends A 
{
 
}
 

====================================
 
        multi level 
class A1
{
 
}
class B1 extends A1
{
 
}
class C1 extends B1
{
 
}
==========================================
        Multiple Inheritane : it will not support in terms of class 
class pravin
{
    abc(){}
}
class Ramesh
{
    abc(){}
}
class Bindu extends pravin, Ramesh
{
    CC  c = new CC();
    c.abc();        // confis so not support
}
===================================================
 
            hirerchical .....?
class Ramesh
{
 
}
class Sindu extends Ramesh
{
 
}
class Bindu extends Rasmesh
{
 
}
 
======================================== Hibred ===============

=========================================================================================
Inheritance : 
        aquri the proprty from prnt to child 
        inherit the proprty from parent to child 
 

        parent---- > Super class -----> Base class  
        child ---- > Sub classs-------> derived class 
 
        advantage ? 
            we can core reusable ....!
            we can reduce the code length and complexity 
            incress the performace of application 
 
        

        Types of Inheritance : 
            Single 
            multilevel 
            multiple 
            hybred 
            hyrichy 


        class A to class B how to aquri the property ? 
                useing extend key word 
                this keyword 
                super keyword 
 
 