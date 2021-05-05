package h11;

import java.applet.Applet;
import java.awt.*;

public class H11_9 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int y = 50;

        for (int rij = 0; rij < 8; rij++) {

            int x = 50;

            if (rij == 0 || rij == 2 || rij == 4 || rij == 6) {

                g.setColor(Color.black);

                for (int kolum = 0; kolum < 8; kolum++) {

                    if (kolum == 0 || kolum == 2 || kolum == 4 || kolum == 6) {

                        g.fillRect(x, y, 51, 51);

                    } else {

                        g.drawRect(x, y, 50, 50);

                    }
                    x += 50;
                }
            }
            else {

                g.drawRect(x,y,50,50);

                for (int kolum2 = 0; kolum2 < 8; kolum2++){

                    if (kolum2 == 0 || kolum2 == 2 || kolum2 == 4 || kolum2 == 6) {

                        g.drawRect(x, y, 50, 50);
                    }else {
                        g.setColor(Color.black);
                        g.fillRect(x,y,51,51);
                    }
                    x += 50;
                }
            }
            y += 50;
        }
    }
}


















