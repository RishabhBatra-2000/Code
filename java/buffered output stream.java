import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class WriteByteToFile {
 
 public static void main(String[] args) {
 
 String strFile = "C:/FileIO/BufferedOutputStreamDemo.txt";
 BufferedOutputStream bos = null;
 
 try
 {
 //Create FileOutputStream for the file
 FileOutputStream fos = new FileOutputStream(strFile);
 
 //Create BufferedOutputStream object for FileOutputStream
 bos = new BufferedOutputStream(fos);
 
 byte b = 66;
 
 
 System.out.println("BufferedOutputStream: writing file");
 bos.write(b);
 
 System.out.println("BufferedOutputStream : written file");
 }
 catch(FileNotFoundException fnfe)
 {
 System.out.println("Specified file not found" + fnfe);
 }
 catch(IOException ioe)
 {
 System.out.println("Error while writing to file" + ioe);
 }
 finally
 {
 try
 {
 if(bos != null)
 {
 bos.flush();
 bos.close();
 }
 
 }
 catch(Exception e){}
 
 }
 
 }
}
