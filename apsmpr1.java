import java.applet.*;
import java.awt.*;
import java.awt.event.*;
// <applet code="apsmpr1.class" width=300 height=200></applet>
public class apsmpr1 extends Applet implements ActionListener{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2;
public void init(){
l1=new Label("First No");
l2=new Label("Second No");
l3=new Label("Result");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b1=new Button("Sum");
b2=new Button("Product");
add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);
add(b1);add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
Button b=(Button)e.getSource();
int i,j,k;
i=Integer.parseInt(t1.getText());
j=Integer.parseInt(t2.getText());
if(b==b1)
k=i+j;
else 
k=i*j;
t3.setText(""+k);
}
}