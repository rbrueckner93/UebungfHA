public class Kartenstapel {

  /** 
   *  Gibt Position im array an, an der sich die aktuell oberste Karte des laufenden Spiels befindet
   */
  public Integer obersteKarte = 51;

  public Spielkarte[] stapel;

  /** 
   *  Erzeugt ein Array der L�nge Farbe*Bezeichnungen und schreibt Spielkarten anhand m�glicher farben,bezeichnungen in das array
   */
 private Kartenstapel(){
	 stapel = new Spielkarte[52];
	 
	 
	 }
	 
 }

  /** 
   *  Schleife, die �ber Klasse Random 2 Spielkarten im array findet und diese in eigene variablen abspeichert und sie �ber Kreuz im Stapelarray abspeichert.
   *  Nach Abschluss mischen() obersterKarte zur�cksetzten.
   */
  public void mischen() {
  }

  /** 
   *  Gibt aus dem Stapel array anhand von obersterKarte eine Spielkarte zur�ck und ver�ndert obersteKarte.
   *  Bei letzter Karte, neu mischen()
   *   stapel[obersteKarte]
   */
  public void karteGeben() {
  }

}