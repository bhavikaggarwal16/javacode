class Abc extends Thread {
int i;
public void run() {
for (i=1;i<=7;i++) {
try{
System.out.println(getName()+" "+i);
sleep(1000);
} 
catch (Exception e){
}
}
}
}
class excslp{
public static void main(String[] args){
Abc A1 = new Abc();
Abc A2 = new Abc();
Abc A3 = new Abc();
A1.start();
A2.start();
A3.start();
}
}