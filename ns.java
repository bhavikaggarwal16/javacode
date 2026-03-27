import java.util.Scanner;
import SOFTECH.*;

public class ns{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int ch,n;

System.out.println("1 Decimal to Binary");
System.out.println("2 Binary to Decimal");
System.out.println("3 Decimal to Octal");
System.out.println("4 Octal to Decimal");

System.out.print("Enter choice: ");
ch=sc.nextInt();

System.out.print("Enter number: ");
n=sc.nextInt();

switch(ch){
case 1:
NumberSystem.dectobin(n);
break;
case 2:
NumberSystem.bintodec(n);
break;
case 3:
NumberSystem.dectooct(n);
break;
case 4:
NumberSystem.octtodec(n);
break;
default:
System.out.println("Invalid choice");
}
}
}