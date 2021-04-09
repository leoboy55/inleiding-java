package h04;

import java.applet.*;
import java.awt.*;

public class H4_7 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        //background color
        setBackground(Color.lightGray);

        //Main frame Dobbelsteen
        g.setColor(Color.white);
        g.drawRect(20, 20, 100, 100);
        g.fillRect(20,20,100,100);

        //Links boven cirkel
        g.setColor(Color.black);
        g.drawOval(30, 30, 25, 25);
        g.fillOval(30,30,25,25);

        //Rechts boven cirkel
        g.setColor(Color.black);
        g.drawOval(85, 30, 25, 25);
        g.fillOval(85,30,25,25);

        //Links onder cirkel
        g.setColor(Color.black);
        g.drawOval(30, 85, 25, 25);
        g.fillOval(30,85,25,25);

        //Rechts onder cirkel
        g.setColor(Color.black);
        g.drawOval(85, 85, 25, 25);
        g.fillOval(85,85,25,25);


    }
}
