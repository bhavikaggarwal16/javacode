class ab implements Runnable{
int i;
public void run(){
for(i=1;i<6;i++){
System.out.println(i);
}
}
}
class impth{
public static void main(String args[]){
ab a=new ab();
Thread t=new Thread(a);
t.start();
}
}