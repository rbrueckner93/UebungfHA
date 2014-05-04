package blackJackUeb;

import blackJackUeb.Kartenhand;

public class Spieltisch {

	public static void main(String args[]) {
		blackJackUeb.Spieltisch.begruessung();
	}

	public final Integer zielWertHand = 21;

	/**
	 * Wertet die Hï¿½nde nach geltenden BlackJack Regeln aus. Auswertung nach
	 * Anzahl der Asse. Gï¿½nstigste Wahl der Wertigkeiten
	 */
	public void auswertungSpiel() {
	}

	/**
	 * Begrï¿½ï¿½ung des Spielers und erstellen der notwendigen
	 * Objekte(Stapel,Spielerhand,Dealerhand) automatisches Ziehen der ersten
	 * Spielkarte
	 * 
	 * @return
	 */
	public static void begruessung() {
		System.out.println("Willkommen bei BlackJack with Java!");
		blackJackUeb.Kartenhand spielerhand = new blackJackUeb.Kartenhand();
		System.out.println("Wir haben auch schon eine Kartenhand generiert.");
	}

	/**
	 * auswertungSpiel() checkt, ob Spiel fortzusetzten ist Zeigt Aktuelle
	 * Kartenhand an + Aktuellen Handwert Fenster, das Moeglichkeit zur Auswahl
	 * gibt. Liefert true oder false zurueck.
	 */

	public void willstDuKarte() {
		int spielerAuswertung;
		spielerAuswertung = 5; //
		if (spielerAuswertung < zielWertHand) {
			// getTextdarstellung Kartenhand Spieler
			System.out.println("Moeglich. TODO: Danach Fragen, ob er neue Karte will");
		} else {
			System.out.println("Nicht mïoeglich");
		}

	}

	/**
	 * Gibt auswertung Spiel aus und fragt nach neuem Spiel.
	 */
	public void spielBeenden() {
		auswertungSpiel();
		System.out.println("Moechtest du nochmal?");
		// hier fragen mit Dialogbox
		// erstmal wird nur beendet
		System.exit(0);
	}

}
