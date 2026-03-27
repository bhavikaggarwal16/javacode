class std 
{
int rno,tmarks;
String name;
void Input(int r,String s,int t)
{
rno=r;
name=s;
tmarks=t;
}
void Output()
{
System.out.println("Biodata of student: "+rno+" "+name+" "+tmarks);
}
}
class Data{
public static void main(String args[])
{
std ob=new std();
std ob1=new std();
ob.Input(8,"Bhavik",772);
ob1.Input(18,"Grim",734);
ob.Output();
ob1.Output();
}
}