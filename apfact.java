import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
// <applet code="apfact.class" width=300 height=200></applet>
public class apfact extends Applet implements ActionListener
{
Label L1,L2;
TextField T1,T2;
Button b;
public void init()
{
L1=new Label("Number");
L2=new Label("Factorial");
T1=new TextField(10);
T2=new TextField(20);
b=new Button("Calculate");
add(L1);add(T1);
add(L2);add(T2);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int n=Integer.parseInt(T1.getText());
int fact=1;
for(int i=1;i<=n;i++)
fact=fact*i;
T2.setText(""+fact);
}
}