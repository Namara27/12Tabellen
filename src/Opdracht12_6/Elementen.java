package Opdracht12_6;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Elementen extends Applet {
    int[] getal = {420, 420, 420, 13, 53, 420, 14, 14, 14, 88, 5, 3, 2, 2, 1337, 13, 21, 32, 1, 312432, 66, 69, 69, 43};
    TextField tekstvak;
    String tekst;

    public void init() {
        tekstvak = new TextField("",5);
        TekstvakListener tl = new TekstvakListener();
        tekstvak.addActionListener(tl);
        add(tekstvak);
        tekst = "";
    }

    public void paint(Graphics g) {
        g.drawString("" + tekst,50,60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int input = Integer.parseInt(tekstvak.getText());
            int teller = 0;
            tekst = "You failed, try again!";
            for (int i = 0; i < getal.length; i++) {
                if ( input == getal[i] ) {
                    teller++;
                    tekst = "You did it, de waarde komt " + teller + " keer voor";
                }
                repaint();

            }

        }
    }
}
