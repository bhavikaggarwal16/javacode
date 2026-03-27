import java.applet.Applet;
import java.awt.*;

// <applet Code="IndianFlag.class" Width=400 Height=500> </applet>

public class IndianFlag extends Applet
{
public void paint(Graphics g)
{
g.setColor(new Color(255,150,50));
g.fillRect(80,40,300,60);
g.setColor(Color.WHITE);
g.fillRect(80,100,300,60);
g.setColor(new Color(20,140,10));
g.fillRect(80,160,300,60);
g.setColor(new Color(0,0,130));
g.drawOval(205,105,50,50);
g.drawLine(230,105,230,155);
g.drawLine(205,130,255,130);
g.drawLine(212,112,248,148);
g.drawLine(248,112,212,148);
g.drawLine(220,107,240,153);
g.drawLine(240,107,220,153);
g.setColor(Color.BLACK);
g.fillRect(70,40,10,340);
g.drawArc(35,370,80,60,0,180);
g.fillRect(35,400,80,20);
g.fillRect(20,420,110,20);
g.setColor(Color.BLUE);
g.drawArc(10,40,120,340,90,180);
}
}