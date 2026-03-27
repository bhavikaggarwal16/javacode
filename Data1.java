import java.util.*;
class temp{
String name,city;
int age;
void input(){
Scanner cin=new Scanner(System.in);
System.out.println("Enter your name,age,city: ");
name=cin.next();
age=cin.nextInt();
city=cin.next();
}
void output(){
System.out.println("Name= "+name+" "+"City= "+city+" "+"Age= "+age);
}
}
class student extends temp{
int fees;
void inp(){
input();
Scanner cin=new Scanner(System.in);
System.out.println("Enter your fees: ");
fees=cin.nextInt();
}
void display(){
output();
System.out.println("Fees= "+fees);
}
}
class teacher extends temp{
int sal;
void input_data(){
input();
Scanner cin=new Scanner(System.in);
System.out.println("Enter your fees: ");
sal=cin.nextInt();
}
void display_data(){
output();
System.out.println("Salary= "+sal);
}
}
class data1{
public static void main(String[] args){
student s=new student();
s.inp();
s.display();
teacher t=new teacher();
t.input_data();
t.display_data();
}}