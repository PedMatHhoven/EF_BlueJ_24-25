package Vererbung;

import java.awt.Rectangle;

public class Rechteck extends Form {
    private int laenge;
    private int breite;

    public Rechteck(int l, int b, int x, int y, String f) {
        super(x,y,f);
        laenge = l;
        breite = b;
    }

    public void laengeAendern(int neueLaenge) {
        loeschen();
        laenge = neueLaenge;
        zeichnen();
    }

    public void breiteAendern(int neueBreite) {
        loeschen();
        breite = neueBreite;
        zeichnen();
    }

    public void zeichnen() {
        Leinwand leinwand = Leinwand.gibLeinwand(); 
        leinwand.zeichne(this, farbe, new Rectangle(xPosition, yPosition,
                         laenge, breite));
        leinwand.warte(10);
    }
}
