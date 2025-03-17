package Vererbung;

//abstrakte Klasse - bietet Ger�st f�r Unterklassen
//- kann selbst kein Objekt erstellen!
public abstract class Form {
    protected int xPosition;
    protected int yPosition;
    protected String farbe;
    protected boolean istSichtbar;

    public Form(int x, int y, String f) {
        xPosition = x;
        yPosition = y;
        farbe = f;
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
    
    public void farbeAendern(String neueFarbe) {
        farbe = neueFarbe;
        zeichnen();
    }
   
    public abstract void zeichnen();
   
    public void loeschen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
        istSichtbar = false;
    }
}
