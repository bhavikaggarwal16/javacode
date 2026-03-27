import java.util.Scanner;
import SOFTECH.INFO.*;
class dd{
public static void main(String args[]){
int a,b,r;
Scanner cin=new Scanner(System.in);
System.out.println("Enter the value of two numbers: ");
a=cin.nextInt();
b=cin.nextInt();
r=arith.ADD(a,b);
System.out.println(r);
r=arith.MUL(a,b);
System.out.print(r);
}
}