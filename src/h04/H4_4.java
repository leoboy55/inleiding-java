package h04;

import java.applet.*;
import java.awt.*;

public class H4_4 extends Applet{
    public void init(){
    }
    public void paint(Graphics g ) {
        //background color
        setBackground(Color.getHSBColor(10,122,6));

        //Eerste staaf Valerie 40kg
        g.setColor(Color.green);
        g.drawRect(20, 140, 30, 80);
        g.fillRect(20, 140, 30, 80);
        //Naam Valerie
        g.setColor(Color.black);
        g.drawString("Valerie", 20, 240);
        //schaal verdeling 0
        g.setColor(Color.black);
        g.drawLine(20, 220, 50, 220);
        g.drawString("0 KG", 60, 225);
        //schaal verdeling 20
        g.drawLine(20, 180, 50, 180);
        g.drawString("20 KG", 60, 185);
        //schaal verdeling 40
        g.drawLine(20, 140, 50, 140);
        g.drawString("40 KG", 60, 145);

        //Tweede staaf Jeroen 100 KG
        g.setColor(Color.red);
        g.drawRect(110, 20, 30, 200);
        g.fillRect(110, 20, 30, 200);
        //Naam Jeroen
        g.setColor(Color.black);
        g.drawString("Jeroen", 110, 240);
        //schaal verdeling 60
        g.drawLine(110, 100, 140, 100);
        g.drawString("60 KG", 150, 105);
        //schaal verdeling 100
        g.drawLine(110, 20, 140, 20);
        g.drawString("100 KG", 150, 25);

        //Derde Staaf Hans 80 KG
        g.setColor(Color.blue);
        g.drawRect(190, 60, 30, 160);
        g.fillRect(190, 60, 30, 160);
        //Naam Hans
        g.setColor(Color.black);
        g.drawString("Hans", 190, 240);
        //schaal verdeling 80
        g.drawLine(190, 60, 220, 60);
        g.drawString("80 KG", 230, 60);

    }
    }
