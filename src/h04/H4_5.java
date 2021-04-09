package h04;

import java.applet.*;
import java.awt.*;

public class H4_5 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {

        //background color
        setBackground(Color.blue);

        //Eclipse
        g.setColor(Color.yellow);
        g.drawOval(20, 20, 200, 400);
        g.fillOval(20,20,200,400);
    }
}

