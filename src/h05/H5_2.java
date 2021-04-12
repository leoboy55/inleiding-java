package h05;

import java.applet.*;
import java.awt.*;

public class H5_2 extends Applet {

    int Valerie;
    int Jeroen;
    int Hans;
    Color Vullingrood,Vullingblauw,Vullinggeel;
    Color Lijnkleur;
    boolean IsVolwassen;


    public void init() {

        Valerie = 40;
        Jeroen = 100;
        Hans = 80;
        Vullingrood = Color.red;
        Vullingblauw = Color.blue;
        Vullinggeel = Color.yellow;
        Lijnkleur = Color.black;
    }


    public void paint(Graphics g) {
        //background color
        setBackground(Color.getHSBColor(10, 122, 6));
        //zwarte lettertekst

        //Staafgrafiek Valerie
        g.setColor(Lijnkleur);
        g.drawRect(30,200 - Valerie, 30, Valerie);
        g.setColor(Vullingrood);
        g.fillRect(30, 200 - Valerie, 30, Valerie);
        g.setColor(Lijnkleur);
        g.drawString("Valerie", 30, 220);

        //Staafgrafiek Jeroen
        g.setColor(Lijnkleur);
        g.drawRect(80,200 - Jeroen,30,Jeroen);
        g.setColor(Vullingblauw);
        g.fillRect(80,200 - Jeroen,30,Jeroen);
        g.setColor(Lijnkleur);
        g.drawString("Jeroen", 80, 220);

        //
        g.setColor(Lijnkleur);
        g.drawRect(130,200 - Hans,30,Hans);
        g.setColor(Vullinggeel);
        g.fillRect(130,200 - Hans,30,Hans);
        g.setColor(Lijnkleur);
        g.drawString("Hans", 130, 220);

    }
}