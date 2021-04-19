package h05;

import java.applet.*;
import java.awt.*;

public class H5_2 extends Applet {

    int Valerie;
    int Jeroen;
    int Hans;
    Color Vullingrood,Vullingblauw,Vullinggeel;
    Color Lijnkleur;
    int TabelLijnHorizontaal;


    public void init() {

        Valerie = 40;
        Jeroen = 100;
        Hans = 80;
        Vullingrood = Color.red;
        Vullingblauw = Color.blue;
        Vullinggeel = Color.yellow;
        Lijnkleur = Color.black;
        TabelLijnHorizontaal = 300;
    }


    public void paint(Graphics g) {
        //background color
        setBackground(Color.getHSBColor(10, 122, 6));
        //zwarte lettertekst

        //Staafgrafiek Valerie
        g.setColor(Lijnkleur);
        g.drawRect(100,200 - Valerie, 30, Valerie);
        g.setColor(Vullingrood);
        g.fillRect(100, 200 - Valerie, 30, Valerie);
        g.setColor(Lijnkleur);
        g.drawString("Valerie", 100, 220);

        //Staafgrafiek Jeroen
        g.setColor(Lijnkleur);
        g.drawRect(150,200 - Jeroen,30,Jeroen);
        g.setColor(Vullingblauw);
        g.fillRect(150,200 - Jeroen,30,Jeroen);
        g.setColor(Lijnkleur);
        g.drawString("Jeroen", 150, 220);

        //Hans
        g.setColor(Lijnkleur);
        g.drawRect(200,200 - Hans,30,Hans);
        g.setColor(Vullinggeel);
        g.fillRect(200,200 - Hans,30,Hans);
        g.setColor(Lijnkleur);
        g.drawString("Hans", 200, 220);

        //TabelLijnen 100KG
        g.setColor(Lijnkleur);
        g.drawLine(50,100,TabelLijnHorizontaal,100);
        g.drawString("100KG", 5, 105);
        //Tabelijnen 80KG
        g.setColor(Lijnkleur);
        g.drawLine(50,120,TabelLijnHorizontaal,120);
        g.drawString("80KG", 5, 125);
        //Tabelijnen 60KG
        g.setColor(Lijnkleur);
        g.drawLine(50,140,TabelLijnHorizontaal,140);
        g.drawString("60KG", 5, 145);
        //Tabellijnen 40kg
        g.setColor(Lijnkleur);
        g.drawLine(50,160,TabelLijnHorizontaal,160);
        g.drawString("40KG", 5, 165);
        //Tabellijnen 20kg
        g.setColor(Lijnkleur);
        g.drawLine(50,180,TabelLijnHorizontaal,180);
        g.drawString("20KG", 5, 185);
        //Tabellijnen 0kg
        g.setColor(Lijnkleur);
        g.drawLine(50,200,TabelLijnHorizontaal,200);
        g.drawString("0KG", 5, 205);

    }
}