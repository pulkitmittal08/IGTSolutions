class Draw
{
    void Draw()
    {
        System.out.println(" Draw()");
    }
    void Draw(int a )
    {
        System.out.println(" Draw() area of  square "+ (a * a ));
    }
 

    void Draw(int l, int b)
    {
        System.out.println(" Draw() area of Rectanlge "+ (l*b));
    }
}
class  Demo18DrawPolymorphismMethodOverLoding
{
    public static void main(String args[])
    {
         Draw d1= new Draw();
         d1.Draw();
        d1.Draw(10);
        d1.Draw(10,20);

    }    
}


//// same Method name + multiple time +with different parameter + in same class = is called Method over loading