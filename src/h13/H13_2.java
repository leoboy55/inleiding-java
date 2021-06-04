package h13;

import java.applet.*;
import java.awt.*;

public class H13_2 extends Applet {

    public void init(){

    }
    public void paint(Graphics g) {

        int y1 = 40;

        for (int i = 0; i < 10; i++) {
            tekenBaksteen(getGraphics(), 40,  y1, 80, 40);
            y1 += 42;
        }
    }

    public static void tekenBaksteen(Graphics g, int x1, int y1, int x2, int y2) {

        for (int i = 0; i < 10 ; i++) {

            g.setColor(Color.red);
            g.fillRect(x1,y1,x2,y2);
            x1 += 82;
        }
    }
}
