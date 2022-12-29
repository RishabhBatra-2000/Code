import java.applet.Applet;
import java.awt.Graphics;
 
public class GetAppletInfoExample extends Applet{
 
 public void paint(Graphics g){
 
 String info = getAppletInfo();
 g.drawString(info,50,50);
 }
 
 public String getAppletInfo(){
 String info = "";
 
 info = info + "GetAppletInfoExample";
 info = info + "@java-examples.com";
 
 return info;
 }
}
