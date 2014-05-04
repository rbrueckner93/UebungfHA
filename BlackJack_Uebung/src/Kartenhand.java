public class Kartenhand {

	/*
	 * 
	 */
	public Spielkarte[] spielHand;
	public int kartenAufHand = 0;

	private Kartenhand() {
		spielHand = new Spielkarte[(Spielkarte.erzeugeMoeglicheBezeichnungen().length * Spielkarte
				.erzeugeMoeglicheFarben().length) - 1];
	}

	/**
	 * Fordert eine aus Stapel und schreibt sie in hand array
	 */
	public void karteNehmen(Kartenstapel stapel) {
		Spielkarte gezogeneKarte = stapel.karteGeben();
		spielHand[kartenAufHand] = gezogeneKarte;
		kartenAufHand++;
	}

	/**
	 * Wertet das Handarray nach realen Werten aus(Ass=11)
	 */
	public int auswertungRealwert() {
		int HandWertReal = 0;
		for (Spielkarte karte : spielHand) {
			HandWertReal += karte.getIntWert();
		}
		return HandWertReal;
	}

	/**
	 * textdarstellung aller Karten auf der Hand
	 */
	public String handAnzeigen() {
		String Kartentextaktuell = null;
		String Kartentext = null;
		for(int laeufer = 0; laeufer <= kartenAufHand;laeufer++){
			Spielkarte Karte = spielHand[laeufer];
			Kartentextaktuell = Karte.getTextdarstellung();
			Kartentext =  Kartentext + " " + Kartentextaktuell;
		}
		return Kartentext;
	}

}