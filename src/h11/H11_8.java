package h11;

import java.applet.Applet;
import java.awt.*;

public class H11_8 extends Applet {

    public void init(){}

    public void paint(Graphics g){

        int x2 = 5;
        int y2 = 5;


        for (int i = 0; i < 100 ; i++) {

            x2 += 5;
            y2 += 5;

            System.out.println(x2);
            System.out.println(y2);

            g.drawOval(250,250,x2,y2);



        }

    }
}
