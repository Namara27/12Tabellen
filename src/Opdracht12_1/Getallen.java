package Opdracht12_1;

import java.applet.*;
import java.awt.*;

public class Getallen extends Applet {
    double[] getal;
    double totaal;

    public void init() {
        getal = new double[10];
        getal[0] = 23;
        getal[1] = 76;
        getal[2] = 54;
        getal[3] = 44;
        getal[4] = 22;
        getal[5] = 69;
        getal[6] = 3;
        getal[7] = 99;
        getal[8] = 17;
        getal[9] = 50;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getal.length; teller++) {
            totaal = getal[teller];
            totaal = (getal[0] + getal[1] + getal[2] + getal[3] + getal[4] + getal[5] + getal[6] + getal[7] + getal[8] + getal[9]) / 10;
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
            g.drawString("Gemiddelde: " + totaal, 50, 220);
        }
    }
}
