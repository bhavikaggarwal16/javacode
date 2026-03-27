import java.util.Scanner;
class std
{
public static void main(String[] args) {
int rno,tmarks;
String name;
float percentage;
Scanner inp=new Scanner(System.in);
System.out.print("Enter student name: ");
name=inp.next();
System.out.print("Enter roll number: ");
rno=inp.nextInt();
System.out.print("Enter total marks: ");
tmarks=inp.nextInt();
percentage = (float)tmarks/9;
System.out.println("Student name: "+name);
System.out.println("Roll number: "+rno);
System.out.println("Total marks: "+tmarks);
System.out.println("Percentage: "+percentage+"%");
sc.close();
}
}