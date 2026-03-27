class demo{
int feet,inches;
void input(int f,int i)
{
feet=f;
inches=i;
}
void output()
{
System.out.println("Feet= "+feet+" "+"inches: "+inches);
}
void add(demo d1,demo d2){
feet=d1.feet+d2.feet;
inches=d1.inches+d2.inches;
if(inches>=12)
{
inches-=12;
feet=feet+1;
}
} 
}
class measure{
public static void main(String[] args)
{
demo d1=new demo();
demo d2=new demo();
demo d3=new demo();
d1.input(6,11);
d2.input(7,11);
d3.add(d1,d2);
d3.output();
}
}