class A{
void display(){
System.out.println("Base Class!");
}
}
class B extends A{
void display(){
super.display();
System.out.println("Derived Class!");
}
}
class Dimo1{
public static void main(String[] args){
B b=new B();
b.display();
}
}