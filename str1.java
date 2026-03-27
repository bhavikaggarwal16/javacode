
import java.applet.*;
import java.awt.*;
//<applet code="str.class" width=200 height=200></applet>
public class str1 extends Applet implements Runnable{
Thread t;
String s;
int x=1;
public void init(){
s="Sirsa";
t=new Thread(this);
t.start();
}
public void paint(Graphics g){
g.drawString(s,x,100);
}
public void run(){
for(;x<=200;x++){
try{
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