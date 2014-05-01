public class Kartenstapel {

  /** 
   *  Gibt Position im array an, an der sich die aktuell oberste Karte des laufenden Spiels befindet
   */
  public Integer obersteKarte = 51;

  public Spielkarte[] stapel;

  /** 
   *  Erzeugt ein Array der Länge Farbe*Bezeichnungen und schreibt Spielkarten anhand möglicher farben,bezeichnungen in das array
   */
 private Kartenstapel(){
	 stapel = new Spielkarte[52];
	 
	 
	 }
	 
 }

  /** 
   *  Schleife, die über Klasse Random 2 Spielkarten im array findet und diese in eigene variablen abspeichert und sie über Kreuz im Stapelarray abspeichert.
   *  Nach Abschluss mischen() obersterKarte zurücksetzten.
   */
  public void mischen() {
  }

  /** 
   *  Gibt aus dem Stapel array anhand von obersterKarte eine Spielkarte zurück und verändert obersteKarte.
   *  Bei letzter Karte, neu mischen()
   *   stapel[obersteKarte]
   */
  public void karteGeben() {
  }

}