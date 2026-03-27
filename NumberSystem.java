package SOFTECH;
public class NumberSystem{
public static void dectobin(int num){
int i=0;
int j=1;
while(num>0){
int rem=num%2;
i=i+rem*j;
j=j*10;
num=num/2;
}
System.out.println(i);
}
public static void bintodec(int num){
int i=0;
int j=1;
while(num>0){
int rem=num%10;
i=i+rem*j;
j=j*2;
num=num/10;
}
System.out.println(i);
}
public static void dectooct(int num){
int i=0;
int j=1;
while(num>0){
int rem=num%8;
i=i+rem*j;
j=j*10;
num=num/8;
}
System.out.println(i);
}
public static void octtodec(int num){
int i=0;
int j=1;
while(num>0){
int rem=num%10;
i=i+rem*j;
j=j*8;
num=num/10;
}
System.out.println(i);
}
}