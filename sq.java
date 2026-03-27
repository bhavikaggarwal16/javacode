import java.util.Scanner;
class square
{
int side,area,para;
void input()
{
Scanner cin=new Scanner(System.in);
System.out.print("Enter the side: ");
side=cin.nextInt();
}
}
class sq
{
static void calculate(square s)
{
s.area=s.side*s.side;
s.para=s.side*4;
}
public static void main(String[] args)
{
square s1=new square();
s1.input();
calculate(s1);
System.out.print("Area="+s1.area+"\nPerimeter="+s1.para);
}
}