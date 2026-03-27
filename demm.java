class a extends Thread{
int i;
public void run(){
for(i=1;i<6;i++)
System.out.println(getName()+" "+i);
}
}
class b extends Thread{
int i;
public void run(){
for(i=6;i<11;i++)
System.out.println(getName()+" "+i);
}
}
class d extends Thread{
int i;
public void run(){
for(i=11;i<16;i++)
System.out.println(getName()+" "+i);
}
}
class demm{
public static void main(String[] args){
a a1=new a();
b b1=new b();
d d1=new d();
a1.start();
b1.start();
d1.start();
}
}