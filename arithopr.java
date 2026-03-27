import java.util.*;
class arithopr{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter two numbers:");
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("Enter:\n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division");
int ch = sc.nextInt();

switch(ch) {
case 1: 
System.out.println("Result: " + (a + b)); 
break;
case 2: 
System.out.println("Result: " + (a - b)); 
break;
case 3: 
System.out.println("Result: " + (a * b)); 
break;
case 4: 
System.out.println("Result: " + (a / b)); 
break;
default: 
System.out.println("Invalid choice");
}
}
}
