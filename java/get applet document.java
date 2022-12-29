mport java.applet.Applet;
import java.awt.Graphics;
import java.net.URL;
 
 
public class GetDocumentBaseExample extends Applet{
 
 public void paint(Graphics g){
 

 URL appletDocDir = getDocumentBase();
 g.drawString(appletDocDir.toString(), 50, 50);
 
 }
}
