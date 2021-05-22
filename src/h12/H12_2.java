package h12;

import java.applet.*;
import java.awt.*;

public class H12_2 extends Applet {

    Button[] buttons = new Button[25];


    public void init() {

        for (int i = 0; i < buttons.length; i++) {

            buttons[i] = new Button("OK");
            add(buttons[i]);


        }
    }

    public void paint(Graphics g) {

        }
    }






