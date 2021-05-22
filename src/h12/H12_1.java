package h12;

import java.applet.*;
import java.awt.*;

public class H12_1 extends Applet {

    double average;
    double totaal;
    double[] cijvers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int loop;

    public void init() {

        for (loop = 0; loop < cijvers.length; loop++) {
            totaal = totaal + cijvers[loop];
            System.out.println(cijvers[loop]);
        }
        System.out.println(average);
        average = totaal / cijvers.length;
    }

    public void paint(Graphics g) {

        for (int i = 0; i < cijvers.length; i++) {

            g.drawString("Waardes " + cijvers[i], 20, 20 * i + 10);
            g.drawString("Gemiddelde " + average, 10, 260);

        }
    }
}


