import java.applet.*;
import java.awt.*;
import java.awt.event.*;
// <applet code="apdr1.class" width="300" height="300"></applet>
public class apdr1 extends Applet implements ActionListener {
Label L1, L2, L3, L4;
TextField T1, T2, T3, T4;
Button b,b1,b2,b3,b4;
public void init() {
L1 = new Label("X");
L2 = new Label("Y");
L3 = new Label("Width");
L4 = new Label("Height");
T1 = new TextField(10);
T2 = new TextField(10);
T3 = new TextField(10);
T4 = new TextField(10);
b1 = new Button("Rectangle");
b2 = new Button("Oval");
b3 = new Button("Square");
b4 = new Button("Circle");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
add(L1);add(T1);
add(L2);add(T2);
add(L3);add(T3);
add(L4);add(T4);
add(b1);add(b2);add(b3);add(b4);
}
public void actionPerformed(ActionEvent e){
b=(Button)e.getSource();
repaint();
}
public void paint(Graphics g){
int i,j,k,h;
i=Integer.parseInt(T1.getText());
j=Integer.parseInt(T2.getText());
k=Integer.parseInt(T3.getText());
h=Integer.parseInt(T4.getText());
if(b==b1)
g.drawRect(i,j,k,h);
else if(b==b2)
g.drawOval(i,j,k,h);
else if(b==b3)
g.drawRect(i,j,k,k);
else if(b==b4)
g.drawOval(i,j,k,k);
}
}