import java.applet.Applet;
import java.awt.Graphics;
 
public class GetAppletParameterExample extends Applet{
 
 public void paint(Graphics g){
 
 int x = 0;
 int y = 0;
 String msg = "";
 
 try{
 x = Integer.parseInt(getParameter("xPosition"));
 }
 catch(NumberFormatException ne){
 msg = msg + "Invalid x Value";
 }
 
 try{
 y = Integer.parseInt(getParameter("yPosition"));
 }
 catch(NumberFormatException ne){
 msg = msg + "Invalid y Value";
 }
 
 msg = getParameter("msg");
 
 g.drawString(msg, x, y);
 }
}
