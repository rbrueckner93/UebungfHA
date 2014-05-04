import java.util.Random;

public class Kartenstapel {


	/**
	 * Gibt Position im array an, an der sich die aktuell oberste Karte des
	 * laufenden Spiels befindet
	 */
	public int obersteKarte = 51;

	public Spielkarte[] stapel;

	/**
	 * Erzeugt ein Array der Länge Farbe*Bezeichnungen und schreibt Spielkarten
	 * anhand möglicher farben,bezeichnungen in das array
	 */
	public Kartenstapel() {
		stapel = new Spielkarte[52];
		String[] farben = Spielkarte.erzeugeMoeglicheFarben();
		String[] bezeichnungen = Spielkarte.erzeugeMoeglicheBezeichnungen();
		int index = 0;
		for (String farbe : farben) {
			for (String bezeichnung : bezeichnungen) {
				stapel[index] = new Spielkarte(farbe, bezeichnung);
				index++;
			}

		}

	}

	/**
	 * Schleife, die über Klasse Random 2 Spielkarten im array findet und diese
	 * in eigene variablen abspeichert und sie über Kreuz im Stapelarray
	 * abspeichert. Nach Abschluss mischen() obersterKarte zurücksetzten.
	 */
	public void mischen() {
		Random generator = new Random();
		for (int mischer = 1; mischer <= 1000; mischer++) {
			int pos1 = generator.nextInt(51);
			int pos2 = generator.nextInt(51);
			Spielkarte eins = stapel[pos1];
			Spielkarte zwei = stapel[pos2];
			stapel[pos2] = eins;
			stapel[pos1] = zwei;
		}
		obersteKarte = 51;

	}

	/**
	 * Gibt aus dem Stapel array anhand von obersterKarte eine Spielkarte zurück
	 * und verändert obersteKarte. Bei letzter Karte, neu mischen()
	 * stapel[obersteKarte]
	 */
	public Spielkarte karteGeben() {
		Spielkarte neueKarte = 	stapel[obersteKarte];
		obersteKarte = obersteKarte -1;
		return neueKarte;
	}

}