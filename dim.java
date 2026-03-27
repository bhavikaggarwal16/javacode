import java.io.*;
class dim{
public static void main(String[] args){
int hrs,min,sec;
try{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print("Enter hrs,mins,secs: ");
hrs=Integer.parseInt(br.readLine());
min=Integer.parseInt(br.readLine());
sec=Integer.parseInt(br.readLine());
sec+=(hrs*3600)+(min*60);
System.out.println("Total secs: "+sec);
}
catch(Exception e){
System.out.print(e);
}
}
}