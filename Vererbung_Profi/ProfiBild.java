package Vererbung_Profi;

public class ProfiBild {
   private Rechteck Boden;
   private Quadrat Rumpf;
   private Dreieck Kopf;
   private Kreis Spitze;
   private Person Mensch;
   
    public ProfiBild() {
        Boden = new Rechteck(50,20,50,200,"blau");
        Rumpf = new Quadrat(30,60,170,"gelb");
        Kopf = new Dreieck(25,25,75,145,"blau");
        Spitze = new Kreis(10,70,135,"rot");
        Mensch = new Person(60,30,130,170,"schwarz");
    }
    
    public void Zeichne() {
       Boden.sichtbarMachen();
       Rumpf.sichtbarMachen();
       Kopf.sichtbarMachen();
       Spitze.sichtbarMachen();
       Mensch.sichtbarMachen();
    }
    
    public void Loesche() {
       Boden.unsichtbarMachen();
       Rumpf.unsichtbarMachen();
       Kopf.unsichtbarMachen();
       Spitze.unsichtbarMachen();
       Mensch.unsichtbarMachen();
    }
}
