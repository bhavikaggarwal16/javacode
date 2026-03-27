class dem{
static void a() throws java.io.IOException{
throw new java.io.IOException("");
}
static void b() throws java.io.IOException{
a();
}
static void c() throws java.io.IOException{
b();
}
public static void main(String args[]){
try{
c();
}
catch(Exception e){
System.out.println(e);
}
}
}