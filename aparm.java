import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
// <applet code="aparm.class" width=300 height=200></applet>
public class aparm extends Applet implements ActionListener
{
Label L1,L2;
TextField T1,T2;
Button b;
public void init()
{
L1=new Label("Number");
L2=new Label("Result");
T1=new TextField(10);
T2=new TextField(20);
b=new Button("Check");
add(L1);add(T1);
add(L2);add(T2);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int n=Integer.parseInt(T1.getText());
int temp=n;
int sum=0;
while(n>0)
{
int d=n%10;
sum=sum+(d*d*d);
n=n/10;
}
if(sum==temp)
T2.setText("Armstrong Number");
else
T2.setText("Not Armstrong");
}
}