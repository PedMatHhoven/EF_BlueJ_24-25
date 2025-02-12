package Gesicht;

public class Bild {
    private Quadrat Gesicht;
    private Rechteck Mund;
    private Dreieck erstesDreieck;
    private Dreieck zweitesDreieck;
    private Dreieck Nase;
    private Kreis AugeE;
    private Kreis AugeZ;
    private Kreis PupilleE;
    private Kreis PupilleZ;

    public void zeichne() {
        Gesicht = new Quadrat();
        Gesicht.groesseAendern(200);
        Gesicht.sichtbarMachen();
        Gesicht.horizontalBewegen(-150);
        Gesicht.vertikalBewegen(-50);
       
        erstesDreieck = new Dreieck();
        erstesDreieck.sichtbarMachen();
        erstesDreieck.vertikalBewegen(-130);
      
        zweitesDreieck = new Dreieck();
        zweitesDreieck.sichtbarMachen();
        zweitesDreieck.horizontalBewegen(100);
        zweitesDreieck.vertikalBewegen(-130);
        
        Nase = new Dreieck();
        Nase.sichtbarMachen();
        Nase.horizontalBewegen(50);
        
        Mund = new Rechteck();
        Mund.sichtbarMachen();
        Mund.farbeAendern("blau");
        Mund.horizontalBewegen(-190);
        Mund.vertikalBewegen(100);
        Mund.groesseAendernx(100);
        
        AugeE = new Kreis();
        AugeE.farbeAendern("gelb");
        AugeE.vertikalBewegen(10);
        AugeE.horizontalBewegen(-45);
        AugeE.groesseAendern(50);
        AugeE.sichtbarMachen();
        
        AugeZ = new Kreis();
        AugeZ.farbeAendern("gelb");
        AugeZ.vertikalBewegen(10);
        AugeZ.horizontalBewegen(55);
        AugeZ.groesseAendern(50);
        AugeZ.sichtbarMachen();
        
        PupilleE = new Kreis();
        PupilleE.farbeAendern("schwarz");
        PupilleE.vertikalBewegen(30);
        PupilleE.horizontalBewegen(70);
        PupilleE.groesseAendern(20);
        PupilleE.sichtbarMachen();
        
        PupilleZ = new Kreis();
        PupilleZ.farbeAendern("schwarz");
        PupilleZ.vertikalBewegen(30);
        PupilleZ.horizontalBewegen(-30);
        PupilleZ.groesseAendern(20);
        PupilleZ.sichtbarMachen();
    }
}
