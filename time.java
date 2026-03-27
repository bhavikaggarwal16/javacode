import java.util.Scanner;
class time{
public static void main(String args[])
{
int secs,hrs,mins;
Scanner cin= new Scanner(System.in);
System.out.println("Enter seconds");
secs=cin.nextInt();
hrs=secs/3600;
secs=secs%3600;
mins=secs/60;
secs=secs%60;
if(hrs>12)
{
hrs=hrs-12;
System.out.print("Time is="+hrs+":"+mins+":"+secs+"P.M");
}
else 
System.out.print("Time is="+hrs+":"+mins+":"+secs+"A.M");
}
}