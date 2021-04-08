package h02;

import java.applet.*;
import java.awt.*;

public class H2_1 extends Applet{
    public void init(){
        setBackground(new Color(34, 94, 180));
    }
    public void paint (Graphics g){
        g.setColor(new Color(255, 228, 59));
        g.drawString("Leonardo Slonek", 50, 70);
    }

}
