import java.io.ByteArrayInputStream;
 
public class ByteArrayInputStreamExample {
 
 public static void main(String[] args) {
 
 String str = "ByteArrayInputStream Example!";
 
 //get bytes from string using getBytes method
 byte[] bytes = str.getBytes();
 
 //create ByteArrayInputStream object
 ByteArrayInputStream bai = new ByteArrayInputStream(bytes);
 
 int ch;
 
 //read bytes from ByteArrayInputStream using read method
 while((ch = bai.read()) != -1)
 {
 System.out.print((char)ch);
 }
 
 }
}
