package Mensch;

public class Mensch {
   private Person meinePerson;
   private Dreieck meinDreieck;
   private Quadrat meinQuadrat1, meinQuadrat2;
   private Kreis meinKreis1, meinKreis2;
  
   public void zeichnen() {
      meinePerson = new Person();
      meinePerson.horizontalBewegen(-20);
      meinePerson.vertikalBewegen(20);
      meinePerson.groesseAendern(70, 35);
      meinePerson.farbeAendern("schwarz");
      meinePerson.sichtbarMachen();
      
      meinDreieck = new Dreieck();  //Hut
      meinDreieck.horizontalBewegen(49);
      meinePerson.vertikalBewegen(-15);
      meinDreieck.groesseAendern(40, 25);
      meinDreieck.farbeAendern("rot");
      meinDreieck.sichtbarMachen();
      
      meinKreis1 = new Kreis(); //linkes Auge
      meinKreis1.horizontalBewegen(20);
      meinKreis1.vertikalBewegen(90);
      meinKreis1.groesseAendern(10);
      meinKreis1.farbeAendern("gelb");
      meinKreis1.sichtbarMachen();
      
      meinKreis2 = new Kreis(); //rechtes Auge
      meinKreis2.horizontalBewegen(30);
      meinKreis2.vertikalBewegen(90);
      meinKreis2.groesseAendern(10);
      meinKreis2.farbeAendern("gelb");
      meinKreis2.sichtbarMachen();
      
      meinQuadrat1 = new Quadrat(); //linker Schuh
      meinQuadrat1.horizontalBewegen(-70);
      meinQuadrat1.vertikalBewegen(110);
      meinQuadrat1.groesseAendern(15);
      meinQuadrat1.farbeAendern("blau");
      meinQuadrat1.sichtbarMachen();
     
      meinQuadrat2 = new Quadrat(); //rechter Schuh
      meinQuadrat2.horizontalBewegen(-45);
      meinQuadrat2.vertikalBewegen(110);
      meinQuadrat2.sichtbarMachen();
      meinQuadrat2.groesseAendern(15);
      meinQuadrat2.farbeAendern("blau");
    }
}
