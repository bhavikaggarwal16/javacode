class ab extends Thread{
int i;
public void run(){
for(i=1;i<=10;i++)
System.out.println("Name "+getName()+" "+i+"Priority Number"+getPriority());
}
}
class demo10{
public static void main(String args[]){
ab a=new ab();
ab b=new ab();
ab c=new ab();
a.start();
b.start();
c.start();
a.setPriority(Thread.MAX_PRIORITY);
}
} 