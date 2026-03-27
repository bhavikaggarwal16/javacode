class ab implements Runnable{
int i;
public void run(){
for(i=1;i<6;i++){
System.out.println(i);
}
}
}
class impthg{
public static void main(String[] args){
ThreadGroup tg=new ThreadGroup("Parent");
Thread t=new Thread(tg,new ab(),"th1");
Thread t1=new Thread(tg,new ab(),"th2");
Thread t2=new Thread(tg,new ab(),"th3");
t.start();
t1.start();
t2.start();
tg.list();
tg.getActiveCount();
}
}