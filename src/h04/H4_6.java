package h04;

import java.applet.*;
import java.awt.*;

public class H4_6 extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {

        //background color
        setBackground(Color.lightGray);

        //Stoplicht main frame
        g.setColor(Color.black);
        g.drawRect(20, 20, 200, 400);
        g.fillRect(20,20,200,400);

        //Rood color Stoplicht
        g.setColor(Color.red);
        g.drawOval(70,70 , 100, 100);
        g.fillOval(70,70,100,100);

        //Orange color stoplicht
        g.setColor(Color.orange);
        g.drawOval(70,180 , 100, 100);
        g.fillOval(70,180,100,100);

        //Green color stoplicht
        g.setColor(Color.green);
        g.drawOval(70,290 , 100, 100);
        g.fillOval(70,290,100,100);

    }
}
