// Creating a nested static class in java 
class TestOuter1{
  // Static data member for the inner static class
  static int data=30;  
  // Static nested class
  static class Inner{  
   void msg()
   {
     System.out.println("data is "+data);}  
   }  
  public static void main(String args[])
  {
    // Static class object.
  TestOuter1.Inner obj=new TestOuter1.Inner();  
  obj.msg();  
  }  
} 
