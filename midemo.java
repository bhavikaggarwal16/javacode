interface Animal{
void eat();
}
interface Bird{
void fly();
}
interface Pet{
void play();
}
class Parrot implements Animal,Bird,Pet{
public void eat(){
System.out.println("Parrot eats seeds");
}
public void fly(){
System.out.println("Parrot can fly");
}
public void play(){
System.out.println("Parrot plays with toys");
}
}
public class midemo{
public static void main(String[] args){
Parrot p=new Parrot();
p.eat();
p.fly();
p.play();
}
}