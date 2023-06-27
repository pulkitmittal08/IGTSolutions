class DuplicateCharacter
{
  public static void main(String args[])
    {
      String name="Hello";
      int count =0;
      
      for (int i=0; i<name.length();i++)
      {
         char current=name.charAt(i);
               for (int j=i+1; j<name.length();j++)
      {
         if (current == name.charAt(j))
            {
                count++;
                 System.out.println("Duplicate Found  :"+current +count );
            }
        
       } 
        
       } 
       
   }
}