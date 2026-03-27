class demo{
int feet,inches;
demo(int f,int i){
feet=f;
inches=i;
}
static demo add(demo d1,demo d2){
int feet=d1.feet+d2.feet;
int inches=d1.inches+d2.inches;
feet+=inches/12;
inches%=12;
return new demo(feet,inches);
}
void output(){
System.out.println("Feet= "+feet+" Inches= "+inches);
}
}
class measure1{
public static void main(String[] args){
demo d1=new demo(6,11);
demo d2=new demo(7,11);
d1=demo.add(d1,d2);
d1.output();
}
}