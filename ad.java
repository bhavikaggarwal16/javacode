class address{
String city,state,country;
address(String c,String s,String cou){
this(c,s);
country=cou;
}
address(String c,String s){
this(c);
state=s;
}
address(String c){
city=c;
}
void display(){
System.out.print("City="+city+" "+"State="+state+" "+"Country="+country);
}
}
class ad{
public static void main(String args[]){
address add=new address("Hisar","Haryana","India");
add.display();
}
}