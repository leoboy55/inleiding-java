package h11;

import java.applet.Applet;
import java.awt.*;

public class H11_6 extends Applet {
    
    public void init(){}
    
    public void paint(Graphics g) {

        int x = 10;
        int y = 10;
        int x1 = 300;
        int y1 = 300;

        for (int i = 0; i <5; i++) {

            x += 50;
            y += 50;

            x1 -= 25;
            y1 -= 25;


            g.drawOval(x1,y1,x, y);

            System.out.println(x);
            System.out.println(y);
            System.out.println("Check");
            System.out.println(x1);
            System.out.println(y1);
            System.out.println("nieuw");
            
        }
    }
}
