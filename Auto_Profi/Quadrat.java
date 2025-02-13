package Auto_Profi;
import java.awt.*;

/**
 * Ein Original.Quadrat, das manipuliert werden kann und sich selbst auf einer Original.Leinwand
 * zeichnet.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 31.07.2011
 */

public class Quadrat {
    private int Groesse;
    private int XPosition;
    private int YPosition;
    private String Farbe;
    private boolean istSichtbar;

    /**
     * Erzeuge ein neues Original.Quadrat mit einer Standardfarbe an einer
     * Standardposition.
     */
    public Quadrat(int groesse, int xPosition, int yPosition, String farbe) {
        Groesse = groesse;
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

    /**
     * Mache dieses Original.Quadrat sichtbar. Wenn es bereits sichtbar ist, tue nichts.
     */
    public void sichtbarMachen() {
        istSichtbar = true;
        zeichnen();
    }

    /**
     * Mache dieses Original.Quadrat unsichtbar. Wenn es bereits unsichtbar ist, tue
     * nichts.
     */
    public void unsichtbarMachen() {
        loeschen();
        istSichtbar = false;
    }

    /**
     * Bewege dieses Original.Quadrat einige Bildschirmpunkte nach rechts.
     */
    public void nachRechtsBewegen() {
        horizontalBewegen(20);
    }

    /**
     * Bewege dieses Original.Quadrat einige Bildschirmpunkte nach links.
     */
    public void nachLinksBewegen() {
        horizontalBewegen(-20);
    }

    /**
     * Bewege dieses Original.Quadrat einige Bildschirmpunkte nach oben.
     */
    public void nachObenBewegen() {
        vertikalBewegen(-20);
    }

    /**
     * Bewege dieses Original.Quadrat einige Bildschirmpunkte nach unten.
     */
    public void nachUntenBewegen() {
        vertikalBewegen(20);
    }

    /**
     * Bewege dieses Original.Quadrat horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void horizontalBewegen(int distance) {
        loeschen();
        XPosition += distance;
        zeichnen();
    }

    /**
     * Bewege dieses Original.Quadrat vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void vertikalBewegen(int entfernung) {
        loeschen();
        YPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege dieses Original.Quadrat langsam horizontal um 'entfernung'
     * Bildschirmpunkte.
     */
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

    /**
     * Bewege dieses Original.Quadrat langsam vertikal um 'entfernung' Bildschirmpunkte.
     */
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

    /**
     * Ändere die Größe dieses Quadrates in 'neueGroesse'. 'neueGroesse' muss
     * groesser gleich Null sein.
     */
    public void groesseAendern(int neueGroesse) {
        loeschen();
        Groesse = neueGroesse;
        zeichnen();
    }

    /**
     * Ändere die Farbe dieses Quadrates in 'neueFarbe'. Gültige Angaben sind
     * "rot", "gelb", "blau", "gruen", "lila" und "schwarz".
     */
    public void farbeAendern(String neueFarbe) {
        Farbe = neueFarbe;
        zeichnen();
    }

    /**
     * Zeichne dieses Original.Quadrat mit seinen aktuellen Werten auf den Bildschirm.
     */
    private void zeichnen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(this, Farbe, new Rectangle(XPosition, YPosition,
                    Groesse, Groesse));
            leinwand.warte(10);
        }
    }

    /**
     * Lösche dieses Original.Quadrat vom Bildschirm.
     */
    private void loeschen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
    }
}