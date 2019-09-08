package Opdracht12_2;

import java.awt.*;
import java.applet.*;

public class Knoppen extends Applet {


    public void init() {
        Button[] knop = new Button[25];
        for (int i = 0; i < 25; i++) {
            knop[i] = new Button("yes");
            add(knop[i]);
        }
    }
}
