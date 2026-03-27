import java.util.*;
class add 
{
public static void main(String args[])
{
Scanner cin=new Scanner(System.in);
int a,b,q,sum=0;
System.out.println("Enter the starting and ending numbers: ");
a=cin.nextInt();
b=cin.nextInt();
System.out.println("Enter how many no you want to add: ");
q=cin.nextInt();
if(a%2==1)
a=a+1;
while(a<=b){
sum=a+b;
a+=2;
q=q-1;
}
System.out.print("Addition= "+sum);
}
}	