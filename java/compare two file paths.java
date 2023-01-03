import java.io.*;
 
public class CompareTwoFilePaths {
 
  public static void main(String[] args) {
   
    //create first file object
    File file1 = new File("C://FileIO//demo1.txt");
   
    //create second file object
    File file2 =  new File("C://FileIO//demo1.txt");
   
    
     if(file1.compareTo(file2) == 0)
     {
       System.out.println("Both paths are same!");
     }
     else
     {
       System.out.println("Paths are not same!");
     }
  } 
}
