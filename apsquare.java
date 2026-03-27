import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
// <applet code="apsquare.class" width=300 height=200></applet>
public class apsquare extends Applet implements ActionListener
{
Label L1, L2;
TextField T1, T2;
Button b;
public void init()
{
L1 = new Label("SIDE");
L2 = new Label("AREA");
T1 = new TextField(10);
T2 = new TextField(10);
b = new Button("CALCULATE");
add(L1); add(T1);
add(L2); add(T2);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int side = Integer.parseInt(T1.getText());
int area = side * side;
T2.setText(""+area);
}
}