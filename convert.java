import java.util.Scanner;
class convert
{
public static void main(String args[])
{
int ch;
float r;
Scanner cin=new Scanner(System.in);
System.out.println("Enter your choice to convert:- 1 = Rs into dollars, 2 = Rs into pounds, 3 = Rs into euros, 4 = Rs into all");
ch=cin.nextInt();
switch(ch)
{
case 1:
System.out.print("Enter your value in rupees: ");
r=cin.nextInt();
System.out.print("Dollars="+r/92);
break;
case 2:
System.out.print("Enter your value in rupees: ");
r=cin.nextInt();
System.out.print("Pounds="+r/125);
break;
case 3:
System.out.print("Enter your value in rupees: ");
r=cin.nextInt();
System.out.print("Euros="+r/108);
break;	
case 4:
System.out.print("Enter your value in rupees: ");
r=cin.nextInt();
System.out.print(" Dollars= "+r/92+" Pounds= "+r/125+" Euros= "+r/108);
break;
default:
System.out.print("Invalid input");
}
}
}
