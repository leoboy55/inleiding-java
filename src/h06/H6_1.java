package h06;

import java.applet.*;
import java.awt.*;

public class H6_1 extends Applet {
    double TotaalBedrag, Jan, Ali, Jeannete, Leonardo;

    public void init() {
        TotaalBedrag = 113;
        Jan = TotaalBedrag / 4;
        Ali = TotaalBedrag / 4;
        Jeannete = TotaalBedrag / 4;
        Leonardo = TotaalBedrag / 4;
    }
    public void paint(Graphics g) {
        g.drawString("Som = 113 euro : 4", 40, 20);
        g.drawString("Jan" + " " + Jan + " " +"Euro", 40, 40 );
        g.drawString("Ali:"+ " " + Ali + " " +"Euro", 40, 60);
        g.drawString("Jeannete:"+ " " + Jeannete + " " +"Euro", 40, 80 );
        g.drawString("Leonardo:"+ " " + Leonardo + " " +"Euro", 40, 100);
    }
}
