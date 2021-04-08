package h02;

import java.applet.*;
import java.awt.*;

public class H2 extends Applet {

    public void init(){
        setBackground(new Color(225, 248, 220));
    }
    public void paint (Graphics g){
      g.setColor(new Color(128,0, 0));
      g.drawString("Mijn eerste Applet!", 50, 70);
    }

}
