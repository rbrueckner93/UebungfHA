package blackJackUeb;

import java.util.Random;
import blackJackUeb.Spielkarte;

public class Kartenstapel {


	/**
	 * Gibt Position im array an, an der sich die aktuell oberste Karte des
	 * laufenden Spiels befindet
	 */
	public static int obersteKarte = 51;

	public static Spielkarte[] stapel;

	/**
	 * Erzeugt ein Array der L�nge Farbe*Bezeichnungen und schreibt Spielkarten
	 * anhand m�glicher farben,bezeichnungen in das array
	 */
	public static void kartenstapelErstellen() {
		stapel = new blackJackUeb.Spielkarte[52];
		String[] farben = blackJackUeb.Spielkarte.erzeugeMoeglicheFarben();
		String[] bezeichnungen = blackJackUeb.Spielkarte.erzeugeMoeglicheBezeichnungen();
		int index = 0;
		for (String farbe : farben) {
			for (String bezeichnung : bezeichnungen) {
				stapel[index] = new blackJackUeb.Spielkarte(farbe, bezeichnung);
				index++;
			}

		}

	}

	/**
	 * Schleife, die �ber Klasse Random 2 Spielkarten im array findet und diese
	 * in eigene variablen abspeichert und sie �ber Kreuz im Stapelarray
	 * abspeichert. Nach Abschluss mischen() obersterKarte zur�cksetzten.
	 */
	public static void mischen() {
		Random generator = new Random();
		for (int mischer = 1; mischer <= 1000; mischer++) {
			int pos1 = generator.nextInt(51);
			int pos2 = generator.nextInt(51);
			blackJackUeb.Spielkarte eins = stapel[pos1];
			blackJackUeb.Spielkarte zwei = stapel[pos2];
			stapel[pos2] = eins;
			stapel[pos1] = zwei;
		}
		obersteKarte = 51;

	}

	/**
	 * Gibt aus dem Stapel array anhand von obersterKarte eine Spielkarte zur�ck
	 * und ver�ndert obersteKarte. Bei letzter Karte, neu mischen()
	 * stapel[obersteKarte]
	 */
	public Spielkarte karteGeben() {
		Spielkarte neueKarte = 	stapel[obersteKarte];
		obersteKarte = obersteKarte -1;
		return neueKarte;
	}

}