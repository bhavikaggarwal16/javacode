import java.applet.*;
import java.awt.*;
//<applet code="Robot.class" width=300 height=400></applet>
public class Robot extends Applet{
public void paint(Graphics g){
g.setColor(Color.blue);
g.drawOval(150,50,100,100);
g.drawOval(170,70,15,20);
g.drawOval(215,70,15,20);
g.drawArc(165,65,25,15,0,180);
g.drawArc(210,65,25,15,0,180);
g.drawLine(190,115,200,90);
g.drawLine(200,90,210,115);
g.drawArc(165,105,70,35,0,-180);
g.drawLine(195,150,195,180);	
g.drawRect(120,180,160,120);
g.drawOval(190,215,20,20);
g.drawOval(190,245,20,20);
g.drawRect(80,195,40,25);
g.drawRect(280,195,40,25);
g.drawLine(160,300,160,340);
g.drawRect(140,340,40,30);
g.drawLine(230,300,230,340);
g.drawRect(210,340,40,30);
}
}