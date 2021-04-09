package h04;

import java.applet.*;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        //lijn
        g.drawLine(20, 20, 400, 20);
        g.drawString("Lijn", 200, 40);

        //rechthoek
        g.drawRect(20, 50, 380, 240);
        g.drawString("Rechthoek", 180, 320);

        //afgeronde rechthoek
        g.drawRoundRect(20, 330, 380, 240, 30, 30);
        g.drawString("Afgeronde rechthoek", 155, 600);

        //gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(450, 50, 380, 240);
        g.setColor(Color.black);
        g.drawOval(450, 50, 380, 240);
        g.drawString("Gevulde rechthoek met ovaal", 555, 320);

        //gevulde ovaal
        g.setColor(Color.magenta);
        g.drawOval(450, 330, 380, 240);
        g.fillOval(450, 330, 380, 240);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 600, 600);

        //Taartpunt met ovaal eromheen
        g.drawOval(880, 50, 380, 240);
        g.drawArc(880, 50, 380, 240, 0, 45);
        g.setColor(Color.magenta);
        g.fillArc(880, 50, 380, 240, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 990, 320);

        //Cirkel
        g.drawOval(950, 330, 240, 240);
        g.drawString("Cirkel", 1050, 600);














    }
    }

