import java.applet.*;
import java.awt.*;
//<applet code="str2.class" width=200 height=200></applet>
public class str2 extends Applet implements Runnable{
Thread t;
String s;
int y=1;
public void init(){
s="Sirsa";
t=new Thread(this);
t.start();
}
public void paint(Graphics g){
g.drawString(s,100,y);
}
public void run(){
for(;y<=200;y++){
try{
if(y>199)

s=s.substring(1)+s.charAt(0);
repaint();
t.sleep(70);
}
catch(Exception e){
System.out.println(e);
}
}
}
}