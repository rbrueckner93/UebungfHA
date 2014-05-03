public class Kartenhand {

/*
 * @@author Nils
 * @return Array mit Spielkarten. 
 *
 */
  public Spielkarte[] spielHand;
  		

  private Kartenhand() {
	spielHand = new Spielkarte[(Spielkarte.erzeugeMoeglicheBezeichnungen().length*Spielkarte.erzeugeMoeglicheFarben().length)-1];
}

/** 
   *  Fordert eine aus Stapel und schreibt sie in hand array
   */
  public void karteNehmen() {
	  
  }

  /** 
   *  Wertet das Handarray nach realen Werten aus(Ass=11)
   */
  public void auswertungRealwert() {
	  for (int i <= 51; )
  }

  /** 
   *  textdarstellung aller Karten auf der Hand
   */
  public void handAnzeigen() {
  }

}