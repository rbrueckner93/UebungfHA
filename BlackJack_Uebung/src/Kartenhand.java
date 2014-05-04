public class Kartenhand {

	/*
	 * 
	 */
	public Spielkarte[] spielHand;
	public int kartenAufHand = 0;
	public static final int blackJack = 21;

	public Kartenhand() {
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
		String Kartentext = null;
		for (int laeufer = 0; laeufer <= kartenAufHand; laeufer++) {
			Spielkarte Karte = spielHand[laeufer];
			Kartentext = Kartentext + " " + Karte.getTextdarstellung();
		}
		return Kartentext;
	}

	public int getOptimalenWert() {
		int letzterWert = 0;
		int ohneAssWert = 0;
		int mitAssWert = 0;
		int optimalWert = 0;
		int anzahlAsse = 0;
		for (int laeufer = 0; laeufer <= kartenAufHand; laeufer++) {
			mitAssWert += spielHand[laeufer].getIntWert();
			if (spielHand[laeufer].istAss()) {
				anzahlAsse++;
			}
		}
		if (anzahlAsse != 0) {
			ohneAssWert = mitAssWert - (anzahlAsse * 11);
			int[] handWerte = new int[(kartenAufHand - 1)];
			for (int i = 0; i <= anzahlAsse; i++) {
				int asseMitelf = i;
				int asseMiteins = anzahlAsse - i;
				handWerte[i] = ohneAssWert + (asseMiteins * 1)
						+ (asseMitelf * 11);
			}
			for (int auswerteWert : handWerte) {
				if (auswerteWert <= 21 && auswerteWert > mitAssWert
						&& auswerteWert > letzterWert) {
					letzterWert = auswerteWert;
					optimalWert = auswerteWert;
				} else {
					optimalWert = mitAssWert;
				}
			}
		} else {
			optimalWert = mitAssWert;
		}
		return optimalWert;
	}
}