package jp.ac.uryukyu.ie.e165749;

/**
 * Created by South on 2017/02/07.
 */
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="GraphicsTest4.class" width="150" height="150">
</applet>
*/

public class GraphicsTest extends Applet{
    public void paint(Graphics g){
        g.drawRect(10, 10, 100, 50);

        g.setColor(Color.red);
        g.drawRoundRect(20, 20, 120, 70, 5, 10);
    }
}
