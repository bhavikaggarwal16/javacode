import java.applet.*;
import java.awt.*;
//<applet code="Graph.class" width=300 height=400></applet>
public class Graph extends Applet {
public void paint(Graphics g) {
g.setColor(Color.blue);
g.drawLine(50,250,380,250);
g.drawLine(70,80,70,250);
g.drawLine(70,250,70,160);
g.drawLine(70,160,110,160);
g.drawLine(110,160,110,250);
g.drawLine(130,250,130,110);
g.drawLine(130,110,170,110);
g.drawLine(170,110,170,250);
g.drawLine(190,250,190,190);
g.drawLine(190,190,230,190);
g.drawLine(230,190,230,250);
g.drawLine(260,250,260,85);
g.drawLine(260,85,300,85);
g.drawLine(300,85,300,250);
g.drawLine(330,250,330,215);
g.drawLine(330,215,370,215);
g.drawLine(370,215,370,250);
}
}