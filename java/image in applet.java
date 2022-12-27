import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Imageinapplet extends Applet
{
 Image img1, img2;
 
 public void init(){
 
 img1 = getImage(getDocumentBase(), getParameter("Image1"));
 img2 = getImage(getDocumentBase(), getParameter("Image2"));
 }
 
 public void paint(Graphics g){
 
 //display an image using drwaImage method of Graphics class.
 g.drawImage(img1, 0,0,this);
 g.drawImage(img2, 100,100,this);
 }
 
}
