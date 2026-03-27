import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
// <applet code="appower.class" width=300 height=200></applet>
public class appower extends Applet implements ActionListener
{
Label L1,L2,L3;
TextField T1,T2,T3;
Button b;
public void init()
{
L1=new Label("Base");
L2=new Label("Exponent");
L3=new Label("Result");
T1=new TextField(10);
T2=new TextField(10);
T3=new TextField(20);
b=new Button("Calculate");
add(L1);add(T1);
add(L2);add(T2);
add(L3);add(T3);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int base=Integer.parseInt(T1.getText());
int exp=Integer.parseInt(T2.getText());
int r=1;
for(int i=1;i<=exp;i++)
r=r*base;
T3.setText(""+r);
}
}