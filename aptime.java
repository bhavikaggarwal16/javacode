import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
// <applet code="aptime.class" width=300 height=200></applet>
public class aptime extends Applet implements ActionListener
{
Label L1, L2, L3, L4, L5;
TextField T1, T2, T3, T4, T5;
Button b;
public void init()
{
L1 = new Label("Total Seconds");
L2 = new Label("Hours");
L3 = new Label("Minutes");
L4 = new Label("Seconds");
L5 = new Label("AM/PM");
T1 = new TextField(10);
T2 = new TextField(5);
T3 = new TextField(5);
T4 = new TextField(5);
T5 = new TextField(5);
b = new Button("Convert");
add(L1); add(T1);
add(L2); add(T2);
add(L3); add(T3);
add(L4); add(T4);
add(L5); add(T5);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int total = Integer.parseInt(T1.getText());
int hrs = total/3600;
int mins = (total%3600)/60;
int secs = total%60;
String prd;
if(hrs >= 12)
prd="PM";
else
prd="AM";
if(hrs>12)
hrs=hrs-12;
if(hrs==0)
hrs=12;
T2.setText(""+hrs);
T3.setText(""+mins);
T4.setText(""+secs);
T5.setText(prd);
}
}