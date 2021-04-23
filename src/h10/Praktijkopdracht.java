package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField tekstveld;
    Label label;
    String Cijver, Getcijver;
    int CijverGebruiker;

    public void init() {

        label = new Label("Voer je behaalde cijver (1-10) in de tekstvalk");
        tekstveld = new TextField("", 60);
        tekstveld.addActionListener(new GebruikerInput());
        Cijver = "";
        add(label);
        add(tekstveld);

    }

    public void paint(Graphics g) {

        g.drawString(Cijver ,870,60);

    }

  class GebruikerInput implements ActionListener{

      public void actionPerformed(ActionEvent e) {

          Getcijver = tekstveld.getText();
          CijverGebruiker = Integer.parseInt(Getcijver);

          switch (CijverGebruiker){

              case 1 :

                  Cijver = CijverGebruiker + " " + "is een slecht.";
                  break;

              case 2:

                  Cijver = CijverGebruiker + " " + "is een slecht.";
                  break;

              case 3:

                  Cijver = CijverGebruiker + " " + "is slecht";
                  break;

              case 4:

                  Cijver = CijverGebruiker + " " + "is onvoldoende.";
                  break;

              case 5:

                  Cijver = CijverGebruiker + " " + "is matig.";
                  break;

              case 6:

                  Cijver = CijverGebruiker + " " + "is voldoende.";
                  break;

              case 7:

                  Cijver = CijverGebruiker + " " + "is voldoende.";
                  break;

              case 8:

                  Cijver = CijverGebruiker + " " + "is goed.";
                  break;

              case 9:

                  Cijver = CijverGebruiker + " " + "is goed.";
                  break;

              case 10:

                  Cijver = CijverGebruiker + " " + "is goed.";
                  break;

              default:

                  Cijver =  CijverGebruiker + " " + "U heeft een verkeerd nummer ingevoerd.";
                  break;
          }
          repaint();
      }
  }
    }
