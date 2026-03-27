import java.applet.*;
import java.awt.*;
//<applet code="car1.class" width=200 height=200></applet>
public class car1 extends Applet{
Image img;
public void init(){
img=getimage(getcodeBase(),"car.jpg");
}
public void paint(Graphics g){
g.drawimage(this,50,50,img);
}
}
