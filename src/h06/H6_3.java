package h06;

import java.applet.*;
import java.awt.*;

public class H6_3 extends Applet {
    int PositiefGetal1, PositiefGetal2, UitkomstNegatief;

    public void init() {
       PositiefGetal1 =  2147483647;
       PositiefGetal2 = 2147483647;
       UitkomstNegatief = PositiefGetal1 + PositiefGetal2;
    }
    public void paint(Graphics g) {
        g.drawString("Uitkomst =" + UitkomstNegatief,20,20);
    }
}

