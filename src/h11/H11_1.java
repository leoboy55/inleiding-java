package h11;

import java.applet.*;
import java.awt.*;


public class H11_1 extends Applet {

    public void init(){}

    public void paint(Graphics g) {

        int teller;
        int x = 0;

        for (teller = 0; teller < 10; teller++){
            x += 20;

            g.drawLine(x,50, x, 200);
        }
    }
}


