import java.util.Scanner;
class Rect
{
int l,b;
Rect(int l,int b){
this.l=l;
this.b=b;
}
void display(){
System.out.println("Length= "+l+" "+"Breadth= "+b);
}
}
class d{
public static void main(String args[]){
Rect r=new Rect(10,15);
r.display();
}
}