import java.util.Scanner;
class pattern
{
public static void main(String args[])
{
int i,j;
for(i=5;i>=1;i--)
{
for(j=i;j<5;j++)
System.out.print("*");
for(j=i;j>=1;j--)
System.out.print(j);
for(j=2;j<=i;j++)
System.out.print(j);
for(j=i;j<5;j++)
System.out.print("*");
System.out.println("");
}
}
}

