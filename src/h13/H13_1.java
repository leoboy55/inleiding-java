package h13;

import java.applet.*;
import java.awt.*;

public class H13_1 extends  Applet{

    public void init(){

    }
    public void paint(Graphics g) {

        tekenDriehoek(getGraphics(),880,50,380,240,0,45);


    }

    public static void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawArc(x1,y1,x2,y2,x3,y3);
        g.fillArc(x1,y1,x2,y2,x3,y3);
    }
}
