import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
// <applet code="apmoney.class" width=400 height=300></applet>
public class apmoney extends Applet implements ActionListener
{
Label L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11;
TextField T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11;
Button b;
public void init()
{
L1=new Label("Total Amount");
L2=new Label("2000");
L3=new Label("500");
L4=new Label("200");
L5=new Label("100");
L6=new Label("50");
L7=new Label("20");
L8=new Label("10");
L9=new Label("5");
L10=new Label("2");
L11=new Label("1");
T1=new TextField(10);
T2=new TextField(5);
T3=new TextField(5);
T4=new TextField(5);
T5=new TextField(5);
T6=new TextField(5);
T7=new TextField(5);
T8=new TextField(5);
T9=new TextField(5);
T10=new TextField(5);
T11=new TextField(5);
b=new Button("Calculate");
add(L1);add(T1);
add(L2);add(T2);
add(L3);add(T3);
add(L4);add(T4);
add(L5);add(T5);
add(L6);add(T6);
add(L7);add(T7);
add(L8);add(T8);
add(L9);add(T9);
add(L10);add(T10);
add(L11);add(T11);
add(b);

b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int amt=Integer.parseInt(T1.getText());
int n2000=amt/2000;
amt=amt%2000;
int n500=amt/500;
amt=amt%500;
int n200=amt/200;
amt=amt%200;
int n100=amt/100;
amt=amt%100;
int n50=amt/50;
amt=amt%50;
int n20=amt/20;
amt=amt%20;
int n10=amt/10;
amt=amt%10;
int n5=amt/5;
amt=amt%5;
int n2=amt/2;
amt=amt%2;
int n1=amt/1;
T2.setText(""+n2000);
T3.setText(""+n500);
T4.setText(""+n200);
T5.setText(""+n100);
T6.setText(""+n50);
T7.setText(""+n20);
T8.setText(""+n10);
T9.setText(""+n5);
T10.setText(""+n2);
T11.setText(""+n1);
}
}