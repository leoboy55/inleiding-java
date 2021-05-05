package h11;

import java.applet.Applet;
import java.awt.*;

public class H11_7 extends Applet {

    public void init(){}

    public void paint(Graphics g) {

        int x = 500;
        int y = 500;
        int x2 = 0;
        int y2 = 0;

        for (int i = 0; i < 50 ; i++) {

            x -= 5;
            y -= 5;

            x2 += 10;
            y2 += 10;

            g.drawOval(x,y,x2,y2);

            System.out.println(i);

        }

    }
}
