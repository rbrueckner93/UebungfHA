public class Spieltisch {

	public final Integer zielWertHand = 21;

	/**
	 * Wertet die Hände nach geltenden BlackJack Regeln aus. Auswertung nach
	 * Anzahl der Asse. Günstigste Wahl der Wertigkeiten
	 */
	public void auswertungSpiel() {
	}

	/**
	 * Begrüßung des Spielers und erstellen der notwendigen
	 * Objekte(Stapel,Spielerhand,Dealerhand) automatisches Ziehen der ersten
	 * Spielkarte
	 */
	public void begruessung() {
		System.out.println("Willkommen bei BlackJack with Java!");
		Kartenhand Spielerhand = new Kartenhand();
		System.out.println("Wir haben auch schon eine Kartenhand generiert.");
	}

	/**
	 * auswertungSpiel() checkt, ob Spiel fortzusetzten ist Zeigt Aktuelle
	 * Kartenhand an + Aktuellen Handwert Fenster, das Möglichkeit zur Auswahl
	 * gibt. Liefert true oder false zurück.
	 */

	public void willstDuKarte() {
		int spielerAuswertung;
		spielerAuswertung = 5; //
		if (spielerAuswertung < zielWertHand) {
			// getTextdarstellung Kartenhand Spieler
			System.out
					.println("Möglich. TODO: Danach Fragen, ob er neue Karte will");
		} else {
			System.out.println("Nicht möglich");
		}

	}

	/**
	 * Gibt auswertung Spiel aus und fragt nach neuem Spiel.
	 */
	public void spielBeenden() {
		auswertungSpiel();
		System.out.println("Möchtest du nochmal?");
		// hier fragen mit Dialogbox
		// erstmal wird nur beendet
		System.exit(0);
	}

}