import java.util.Scanner;
class student{
public static void main(String args[])
{
Scanner cin=new Scanner(System.in);
int n,i,marks,max=0,min=101,avg,t=0;
System.out.println("ENter the number of subjects");
n=cin.nextInt();
for(i=1;i<=n;i++)
{
System.out.println("Enter the marks");
marks=cin.nextInt();
t=t+marks;
if(max<marks)
max=marks;
if(min>marks)
min=marks;
}
avg=t/n;
System.out.print("Highest marks:"+max+" Lowest marks:"+min+" Average:"+avg);
}
}