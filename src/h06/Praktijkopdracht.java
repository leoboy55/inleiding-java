package h06;

import java.applet.*;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    int Gemmideld1CijferAchterDeKomma;
    double Cijfer1, Cijfer2, Cijfer3, GemiddeldeCijfer,GemiddeldCijferFinal;


    public void init() {
        Cijfer1 = 5.9;
        Cijfer2 = 6.3;
        Cijfer3 = 6.9;
        GemiddeldeCijfer = (Cijfer1 + Cijfer2 + Cijfer3) / 3 * 10;
        Gemmideld1CijferAchterDeKomma = (int) GemiddeldeCijfer;
        GemiddeldCijferFinal = (double) Gemmideld1CijferAchterDeKomma / 10;

    }

    public void paint(Graphics g) {
        g.drawString("uitkomst =" + " " + GemiddeldCijferFinal, 20,20);
    }
}
