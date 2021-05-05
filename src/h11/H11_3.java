package h11;

import java.applet.*;
import java.awt.*;

public class H11_3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int teller;
        int som1 = 0;
        int x = 0;


        for (teller = 1; teller < 200; teller+= som1) {

            som1 += teller;
            x += 45;


                System.out.println(teller);
                System.out.println(som1);

                g.drawString("  " + teller + ",   " + som1 + ",    ", x, 60);
            }

        }
    }

