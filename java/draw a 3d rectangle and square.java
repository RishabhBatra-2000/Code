import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
public class Draw3DRectanglesExample extends Applet{
 
 public void paint(Graphics g){
 
 g.setColor(Color.green);
 
 g.draw3DRect(10,10,50,100,true);
 
 g.draw3DRect(100,100,50,50,true);
 
 g.setColor(Color.orange);
 
 g.fill3DRect(10,150,50,100,true);
 
 g.fill3DRect(100,200,50,50,true);
 
 }
}
