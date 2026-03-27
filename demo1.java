import java.util.*;
class number{
int x;
void add(number n)
{
x=x+n.x;
}
void test(number m)
{
if(x>m.x)
add(this);
else
add(m);
}
void display(){
System.out.println(x);
}
}
class demo1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
number n1=new number();
number n2=new number();
System.out.print("Enter first number:");
n1.x=sc.nextInt();
System.out.print("Enter second number:");
n2.x=sc.nextInt();
n1.test(n2);
n1.display();
}
}