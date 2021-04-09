package h04;

import java.applet.*;
import java.awt.*;

public class H4_2 extends Applet{
    public void init(){
    }
    public void paint(Graphics g) {
        //vierkanthuis
        g.drawRect(250, 250 , 100, 100);
        //deur
        g.drawRect(275, 310, 30, 40);
        //raam
        g.drawRect(325, 300, 15, 25);
    }
}



