import java.util.Scanner;
class stdd{
int id,fees;
String name;
static int a;
void input(){
Scanner cin=new Scanner(System.in);
System.out.println("Enter id,name,fees");
id=cin.nextInt();
name=cin.next();
fees=cin.nextInt();
if(fees>5000)
a++;
}
void output(){
System.out.println("Total students above fees 5000 are: "+ a);
}
}
class Main{
public static void main(String[] args){
stdd s1=new stdd();
stdd s2=new stdd();
stdd s3=new stdd();
stdd s4=new stdd();
stdd s5=new stdd();
s1.input();
s2.input();
s3.input();
s4.input();
s5.input();
s3.output();
}
}