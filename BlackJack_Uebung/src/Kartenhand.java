public class Kartenhand {

	/*
	 * 
	 */
	public Spielkarte[] spielHand;
	public int kartenAufHand = 0;
	public static final int blackJack = 21;

	public Kartenhand() {
		spielHand = new Spielkarte[Spielkarte.erzeugeMoeglicheBezeichnungen().length
				* Spielkarte.erzeugeMoeglicheFarben().length];
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
		for (int i = 0; i < kartenAufHand; i++) {
			HandWertReal = HandWertReal + spielHand[i].getIntWert();
		}
		return HandWertReal;
	}

	/**
	 * textdarstellung aller Karten auf der Hand
	 */
	public String handAnzeigen() {
		String text = spielHand[0].getTextdarstellung();
		for (int i = 1; i < kartenAufHand; i++) {
			text = text + " " + spielHand[i].getTextdarstellung();
		}
		return text;
	}

	public int getOptimalenWert() {
		int workaround = 0;
		int letzterWert = 0;
		int ohneAssWert = 0;
		int mitAssWert = 0;
		int optimalWert = 0;
		int anzahlAsse = 0;
		for (int laeufer = 0; laeufer < kartenAufHand; laeufer++) {
			mitAssWert += spielHand[laeufer].getIntWert();
			if (spielHand[laeufer].istAss()) {
				anzahlAsse++;
			}
		}
		if (anzahlAsse != 0) {
			ohneAssWert = mitAssWert - (anzahlAsse * 11);
			int[] handWerte = new int[(anzahlAsse + 1)];
			for (int i = 0; i <= anzahlAsse; i++) {
				int asseMitelf = i;
				int asseMiteins = anzahlAsse - i;
				handWerte[i] = ohneAssWert + (asseMiteins * 1)
						+ (asseMitelf * 11);
			}
			for (int auswerteWert : handWerte) {
				if (auswerteWert <= blackJack && auswerteWert >= letzterWert) {
					letzterWert = auswerteWert;
					optimalWert = auswerteWert;
					workaround++;
				}
				if (workaround == 0) {
					optimalWert = mitAssWert;
				}
			}
		} else {
			optimalWert = mitAssWert;
		}
		return optimalWert;
	}

	public void Debug() {
		for (Spielkarte Karte : spielHand) {
			System.out.println(Karte.getTextdarstellung());
		}
	}
}