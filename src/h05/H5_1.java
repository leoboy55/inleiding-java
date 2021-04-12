package h05;

import java.applet.*;
import java.awt.*;

public class H5_1 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int cirkel1;
    int cirkel2;


    public void init() {

        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;
        cirkel1 = 100;
        cirkel2 = 100;

    }

    public void paint(Graphics g) {
        //rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        //afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        //gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        //gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        // Taartpunt met ovaal eromheen
        g.setColor(lijnkleur);
        g.drawOval(530,100, breedte, hoogte);
        g.drawArc(530,100, 0,45, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(530,100, breedte, hoogte, 0,45 );
        //Cirkel
        g.setColor(lijnkleur);
        g.drawOval(575,225, cirkel1, cirkel2);
    }
    }

