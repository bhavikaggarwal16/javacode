import java.applet.*;
import java.awt.*;
//<applet code="car1.class" width=400 height=200></applet>
public class car1 extends Applet implements Runnable{
Image car,car1,crash;
int x1=1,x2=300;
int a=0;
Thread t;
public void init(){
car=getImage(getCodeBase(),"car.jpg");
car1=getImage(getCodeBase(),"car1.jpg");
crash=getImage(getCodeBase(),"crash.jpg");
t=new Thread(this);
t.start();
}
public void paint(Graphics g){
if(a==0){
g.drawImage(car,x1,80,this);
g.drawImage(car1,x2,120,this);
}
else{
g.drawImage(crash,150,80,this);
}
}
public void run(){
while(true){
try{
if(a==0){
x1++;
x2--;
if(x1>=x2)
flag=1;
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