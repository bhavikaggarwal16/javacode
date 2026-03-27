import java.util.Scanner;
class fact{
public static void main(String[] args)
{
Scanner cin=new Scanner(System.in);
int f=1,i=1,n;
System.out.println("Enter the number whose factorial you want: ");
n=cin.nextInt();
while(i<=n)
{
f=f*i;
i++;
}
System.out.print("Factorial= "+f);
}
}