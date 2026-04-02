import java.applet.*;
import java.awt.*;
import java.awt.event.*;
// <applet code="apdr.class" width="300" height="300"></applet>
public class apdr extends Applet implements ActionListener {
Label L1, L2, L3, L4;
TextField T1, T2, T3, T4;
Button b;
public void init() {
L1=new Label("X");
L2=new Label("Y");
L3=new Label("Width");
L4=new Label("Height");
T1=new TextField(10);
T2=new TextField(10);
T3=new TextField(10);
T4=new TextField(10);
b=new Button("DRAW");
b.addActionListener(this);
add(L1); add(T1);
add(L2); add(T2);
add(L3); add(T3);
add(L4); add(T4);
add(b);
}
public void actionPerformed(ActionEvent e) {
repaint();
}
public void paint(Graphics g) {
int i,j,k,h;
i=Integer.parseInt(T1.getText());
j=Integer.parseInt(T2.getText());
k=Integer.parseInt(T3.getText());
h=Integer.parseInt(T4.getText());
g.drawRect(i,j,k,h);
}
}