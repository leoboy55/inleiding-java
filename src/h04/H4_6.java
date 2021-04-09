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
        g.drawOval(20, 20, 250, 400);
        g.fillOval(20,20,250,400);

        //Rood color Stoplicht
        g.setColor(Color.red);
        g.drawOval(95,70 , 100, 100);
        g.fillOval(95,70,100,100);

        //Orange color stoplicht
        g.setColor(Color.orange);
        g.drawOval(95,180 , 100, 100);
        g.fillOval(95,180,100,100);

        //Green color stoplicht
        g.setColor(Color.green);
        g.drawOval(95,290 , 100, 100);
        g.fillOval(95,290,100,100);

    }
}
