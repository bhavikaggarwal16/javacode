import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
// <applet code="apadd.class" width=300 height=200></applet>
public class apadd extends Applet implements ActionListener
{
Label L1, L2, L3;
TextField T1, T2, T3;
Button b;
public void init()
{
L1 = new Label("FIRST NO");
L2 = new Label("SECOND NO");
L3 = new Label("RESULT");
T1 = new TextField(10);
T2 = new TextField(10);
T3 = new TextField(10);
b = new Button("ADD");
add(L1); add(T1);
add(L2); add(T2);
add(L3); add(T3);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int a=Integer.parseInt(T1.getText());
int b=Integer.parseInt(T2.getText());
int result=a+b;
T3.setText(""+result);
}
}