package h02;

import java.applet.*;
import java.awt.*;

public class H2_2 extends Applet{
    public void init(){
        setBackground(new Color(255, 255, 255));
    }
    public void paint (Graphics g ){
        g.setColor(new Color(255, 0, 0));
        g.drawString("Leonardo", 60, 50);
        g.setColor(new Color(0xFC0000));
        g.drawString("Slonek", 60,70);
    }
}
