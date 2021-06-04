package h13;

import java.applet.*;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init(){}

    public void paint(Graphics g) {

        int y1 = 200;
        int b1 = 100;
        int x1 = 120;
        int a1 = 50;

        for (int i = 0; i < 2 ; i++) {

            boomTekenen(getGraphics(),x1,y1,40,200, a1,b1,160,160);

            y1 += 50;
            b1 += 50;
            x1 += 50;
            a1 += 50;
        }
    }

    public static void boomTekenen(Graphics g, int x1, int y1, int x2, int y2, int a1, int b1, int a2, int b2){

        for (int i = 0; i < 6; i++) {

            g.setColor(Color.orange);
            g.fillRect(x1,y1,x2,y2);
            g.setColor(Color.green);
            g.fillOval(a1,b1,a2,b2);

            x1 += 100;
            a1 += 100;
        }
    }
}
