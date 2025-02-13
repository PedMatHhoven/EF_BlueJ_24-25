package Auto_Profi;
import java.awt.*;

public class Rechteck {
    private int GroesseX;
    private int GroesseY;
    private int XPosition;
    private int YPosition;
    private String Farbe;
    private boolean istSichtbar;

    public Rechteck(int groesseX, int groesseY, int xPosition, int yPosition, String farbe) {
        GroesseX = groesseX;
        GroesseY = groesseY;
        XPosition = xPosition;
        YPosition = yPosition;
        Farbe = farbe;
        sichtbarMachen();
    }

    public void setXPosition(int XPosition) {
        this.XPosition = XPosition;
    }

    public void setYPosition(int YPosition) {
        this.YPosition = YPosition;
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
        XPosition += distance;
        zeichnen();
    }

    public void vertikalBewegen(int entfernung) {
        loeschen();
        YPosition += entfernung;
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
            XPosition += delta;
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
            YPosition += delta;
            zeichnen();
        }
    }

    public void groesseAendernx (int neueGroessex)  {
        loeschen();
        GroesseX = neueGroessex;

        zeichnen();
    }

    public void groesseAenderny (int neueGroessey)  {
        loeschen();
        GroesseY = neueGroessey;
        zeichnen();
    }

    public void farbeAendern(String neueFarbe) {
        Farbe = neueFarbe;
        zeichnen();
    }

    private void zeichnen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(this, Farbe, new Rectangle(XPosition, YPosition,
                    GroesseX, GroesseY));
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