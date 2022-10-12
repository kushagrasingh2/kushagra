import java.awt.*;
import java.applet.*;
public class adddemo extends Applet
{
public void init()
{
Button b1= new Button("BUTTON 1");
Button b2=new Button("BUTTON 2");
Button b3=new Button("BUTTON 3");
Button b4=new Button("BUTTON 4");
Button b5=new Button("BUTTON 5");
setLayout(new GridLayout(3,5));
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
}
}
/*
<applet code="adddemo.class" height=800 width=900>
</applet>
*/
