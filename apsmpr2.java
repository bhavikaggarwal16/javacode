import java.applet.*;
import java.awt.*;
import java.awt.event.*;
// <applet code="apsmpr2.class" width=300 height=200></applet>
public class apsmpr2 extends Applet implements ActionListener{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4;
public void init(){
l1=new Label("First No");
l2=new Label("Second No");
l3=new Label("Result");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b1=new Button("+");
b2=new Button("-");
b3=new Button("*");
b4=new Button("/");
add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);
add(b1);add(b2);add(b3);add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
Button b=(Button)e.getSource();
int i,j,k=0;
i=Integer.parseInt(t1.getText());
j=Integer.parseInt(t2.getText());
if(b==b1)
k=i+j;
else if(b==b2)
k=i-j;
else if(b==b3)
k=i*j;
else if(b==b4){
if(j==0){
t3.setText("Error");
return;
}
k=i/j;
}
t3.setText(""+k);
}
}