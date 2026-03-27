import java.util.*;
import SOFTECH.*;
class demo13{
public static void main(String args[]){
int a,b;
Scanner cin=new Scanner(System.in);
System.out.print("Enter the value of a = ");
a=cin.nextInt();
b=mathlib.fact(a);
System.out.print("factorial is : "+b);
}
}