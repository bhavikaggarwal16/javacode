import java.applet.*;
import java.awt.*;
//<applet code="car1.class" width=200 height=200></applet>
public class car1 extends Applet{
Image img;
public void init(){
img=getImage(getCodeBase(),"car.jpg");
}
public void paint(Graphics g){
g.drawImage(img,50,50,this);
}
}
