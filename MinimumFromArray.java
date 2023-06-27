class MinimumFromArray 
{

   public static void main(String args[])
   {
      int [] numbers ={5,8,3,12,9};
      
      int min =numbers[0];
   
      for (int i=1; i<numbers.length; i++)
      {
        if (numbers[i] <min )
             {
               min=numbers[i];
              }
       }

      System.out.println("The minimum value is:"+ min);
   }
}