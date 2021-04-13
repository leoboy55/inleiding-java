package h06;

import java.applet.*;
import java.awt.*;

public class H6_2 extends Applet {
    int SecondenMinuut, SecondenUur, SecondenDag, SecondenJaar;

    public void init() {
        SecondenMinuut = 60;
        SecondenUur = SecondenMinuut * 60;
        SecondenDag = SecondenUur * 24;
        SecondenJaar = SecondenDag * 365;
    }
    public void paint(Graphics g) {
        g.drawString("Seconden Uur = " + " " + SecondenUur, 20, 40);
        g.drawString("Seconden Dag = " + " " + SecondenDag, 20, 60);
        g.drawString("Seconden Jaar = " + " " + SecondenJaar, 20, 80);
    }
}
