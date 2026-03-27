import java.util.Scanner;
class Dimo{
public static void main(String[] args){
int a[]={50,17,0,14,38};
int i,j,t;
Scanner cin=new Scanner(System.in);
System.out.println("Enter the value of i");
i=cin.nextInt();
try{
j=a[i]/a[i+1];
System.out.println(j);
}
catch(ArithmeticException e){
System.out.println(e); 
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
catch(Exception e){
System.out.println(e);
}
System.out.println("Addition of array Elements: ");
for(i=0,t=0;i<a.length;i++){
t=t+a[i];
}
System.out.println(t);
}
}