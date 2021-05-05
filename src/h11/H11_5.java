package h11;

import java.applet.Applet;
import java.awt.*;

public class H11_5 extends Applet {

    public void init(){}

    public void paint(Graphics g) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < 5 ; i++) {

            x += 20;
            y += 20;

            g.drawRect(x,y,20,20);

            System.out.println(i);

        }
    }
}
