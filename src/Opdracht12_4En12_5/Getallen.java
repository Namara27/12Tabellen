package Opdracht12_4En12_5;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Getallen extends Applet {
    int[] getal = {69, 13, 14, 27, 420, 99, 21, 65, 88, 7};
    TextField tekstvak;
    String tekst;
    Button knop;

    public void init() {
        tekstvak = new TextField("");
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(tekstvak);
        add(knop);
        tekst = "";
    }

    public void paint(Graphics g) {
        g.drawString("" + tekst, 50, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int input = Integer.parseInt(tekstvak.getText());
            tekst = "De waarde is niet gevonden.";
            for (int i = 0; i < getal.length; i++) {

                if (input == getal[i]) {
                    tekst = "De waarde is gevonden! De index is: " + i;
                    break;
                }
            }
            repaint();
        }
    }
}
