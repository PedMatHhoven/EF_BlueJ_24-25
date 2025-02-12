package Gesicht;
import java.awt.Rectangle;

public class Rechteck {
    private int groessex;
    private int groessey;
    private int xPosition;
    private int yPosition;
    private String farbe;
    private boolean istSichtbar;
    
    public Rechteck() {
        groessex = 60;
        groessey = 30;
        xPosition = 400;
        yPosition = 120;
        farbe = "rot";
        istSichtbar = false;
    }

    public void sichtbarMachen() {
        istSichtbar = true;
        zeichnen();
    }

  
    public void unsichtbarMachen() {
        loeschen();
        istSichtbar = false;
    }

    public void nachRechtsBewegen() {
        horizontalBewegen(20);
    }

    public void nachLinksBewegen() {
        horizontalBewegen(-20);
    }

    public void nachObenBewegen() {
        vertikalBewegen(-20);
    }

    public void nachUntenBewegen() {
        vertikalBewegen(20);
    }

    public void horizontalBewegen(int distance) {
        loeschen();
        xPosition += distance;
        zeichnen();
    }

    public void vertikalBewegen(int entfernung) {
        loeschen();
        yPosition += entfernung;
        zeichnen();
    }

    public void langsamHorizontalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            xPosition += delta;
            zeichnen();
        }
    }

    public void langsamVertikalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            yPosition += delta;
            zeichnen();
        }
    }

    public void groesseAendernx (int neueGroessex)  {
        loeschen();
        groessex = neueGroessex;
        
        zeichnen();
    }
    
    public void groesseAenderny (int neueGroessey)  {
        loeschen();
        groessey = neueGroessey;
        zeichnen();
    }
    
    public void farbeAendern(String neueFarbe) {
        farbe = neueFarbe;
        zeichnen();
    }

    private void zeichnen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(this, farbe, new Rectangle(xPosition, yPosition,
                    groessex, groessey));
            leinwand.warte(10);
        }
    }

    private void loeschen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
    }
}
