package h11;

import java.applet.*;
import java.awt.*;

public class H11_4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int tafel3 = 3;
        int totaal;
        int y = 0;

        //if statement tafel 1 x 10
        for (int i = 1; i <= 10; i++) {

            totaal = i * tafel3;

            y += 20;

            //test inputs
            System.out.println(i);
            System.out.println(tafel3);
            System.out.println(totaal);

            //Applet print lijn
            g.drawString("" + totaal,20,y);
        }


            }
        }


