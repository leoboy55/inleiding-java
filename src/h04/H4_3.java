package h04;

import java.applet.*;
import java.awt.*;

public class H4_3 extends Applet{
    public void init(){
    }
    public void paint(Graphics g ){
       setBackground(Color.lightGray);
        //Kleur rood
        g.setColor(Color.red);
        g.drawRoundRect(20, 20, 70, 20, 10, 10);
        g.fillRoundRect(20, 20, 70, 20, 10, 10);
        //kleur wit
        g.setColor(Color.white);
        g.drawRoundRect(20,40, 70, 20, 10,10);
        g.fillRoundRect(20,40,70,20,10,10);
        //kleur blauw
        g.setColor(Color.blue);
        g.drawRoundRect(20,60,70,20,10,10);
        g.fillRoundRect(20,60,70,20,10,10);
        //flag stok
        g.setColor(Color.black);
        g.drawLine(20, 20, 20, 140);
    }

}

