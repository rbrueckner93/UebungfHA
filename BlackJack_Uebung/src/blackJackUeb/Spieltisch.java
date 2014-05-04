package blackJackUeb;

import blackJackUeb.*;


public class Spieltisch {

	public final Integer zielWertHand = 21;

	/**
	 * Wertet die H�nde nach geltenden BlackJack Regeln aus. Auswertung nach
	 * Anzahl der Asse. G�nstigste Wahl der Wertigkeiten
	 */
	public void auswertungSpiel() {
	}

	/**
	 * Begr��ung des Spielers und erstellen der notwendigen
	 * Objekte(Stapel,Spielerhand,Dealerhand) automatisches Ziehen der ersten
	 * Spielkarte
	 */
	public void begruessung() {
		System.out.println("Willkommen bei BlackJack with Java!");
		Kartenhand spielerhand = new Kartenhand();
		System.out.println("Wir haben auch schon eine Kartenhand generiert.");
	}

	/**
	 * auswertungSpiel() checkt, ob Spiel fortzusetzten ist Zeigt Aktuelle
	 * Kartenhand an + Aktuellen Handwert Fenster, das M�glichkeit zur Auswahl
	 * gibt. Liefert true oder false zur�ck.
	 */

	public void willstDuKarte() {
		int spielerAuswertung;
		spielerAuswertung = 5; //
		if (spielerAuswertung < zielWertHand) {
			// getTextdarstellung Kartenhand Spieler
			System.out
					.println("M�glich. TODO: Danach Fragen, ob er neue Karte will");
		} else {
			System.out.println("Nicht m�glich");
		}

	}

	/**
	 * Gibt auswertung Spiel aus und fragt nach neuem Spiel.
	 */
	public void spielBeenden() {
		auswertungSpiel();
		System.out.println("M�chtest du nochmal?");
		// hier fragen mit Dialogbox
		// erstmal wird nur beendet
		System.exit(0);
	}

}
