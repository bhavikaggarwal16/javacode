import java.util.Scanner;

class area{
public static void main(String args[])
{
Scanner cin=new Scanner(System.in);
int s,l,b,sq,rect;
System.out.println("Enter the side of square: ");
s=cin.nextInt();
sq=s*s;
System.out.println("Area of square: "+sq);
System.out.println("Enter the length and breadth of square: ");
l=cin.nextInt();
b=cin.nextInt();
rect=l*b;
System.out.println("Area of rectangle: "+rect);
if(sq>rect)
System.out.println("Area of square is bigger: "+sq);
else
System.out.println("Area of rectangle is bigger: "+rect);
}
}