import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletWith extends Applet implements MouseListener {
public void init()
{
    addMouseListener(this);
}
public void paint(Graphics g)
{

    g.setColor(Color.green);
    g.drawRect(10, 30, 150, 150);
}
public void mouseClicked(MouseEvent e)
{
    String clickDesc;
    if (e.getClickCount() == 2)
        clickDesc = "double";
    else
        clickDesc = "single";

    System.out.println("Mouse was ");

}
public void mouseEntered(MouseEvent e) 
{ 
System.out.print("MouseClicked");
}
public void mouseExited(MouseEvent e) 
{
System.out.print("ExitedExited");
}
public void mousePressed(MouseEvent e)
 {
System.out.print("Pressed");
}
public void mouseReleased(MouseEvent e) 
{
System.out.print("Released");
}
}

/*
<applet code ="AppletWith.class"width=200 height=200>
</applet>
*/