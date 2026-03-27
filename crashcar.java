import java.applet.*;
import java.awt.*;
//<applet code="crashcar.class" width=400 height=300></applet>
public class crashcar extends Applet implements Runnable{
Image car1,car2,crash;
int x1=0,x2=300;
int a=0;
Thread t;
public void init(){
car1=getImage(getCodeBase(),"car1.jpg");
car2=getImage(getCodeBase(),"car2.jpg");
crash=getImage(getCodeBase(),"crash.jpg");
t=new Thread(this);
t.start();
}
public void paint(Graphics g){
if(a==0){
g.drawImage(car1,x1,100,this);
g.drawImage(car2,x2,155,this);
}
else{
g.drawImage(crash,120,100,this);
}
}
public void run(){
while(true){
try{
if(a==0){
x1++;
x2--;
if(x1+245>=x2)
a=1;
}
repaint();
t.sleep(70);
}
catch(Exception e){
System.out.println(e);
}
}
}
}