import java.io.*;
 
public class ConstructFilePath {
 
  public static void main(String[] args) {
   
    
     String filePath = File.separator + "JavaExamples" + File.separator + "IO";
               
    //create new File object
    File file = new File(filePath);
   
    //display file path using getPath() method of File class.
    System.out.println("File path is : " + file.getPath());
       
  }
}
