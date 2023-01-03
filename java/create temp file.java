import java.io.*;
 
public class CreateTempFileDirectory {
 
  public static void main(String[] args) {
   
    
    File file = null;
    File dir = new File("C://FileIO");
   
    try
    {
      file = File.createTempFile("JavaTemp", ".javatemp", dir);
    }
    catch(IOException ioe)
    {
    System.out.println("Exception creating temporary file : " + ioe);
    }
 
    System.out.println("Temporary file created at : " + file.getPath());
  }
}
