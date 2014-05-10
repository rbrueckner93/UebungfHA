import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Hauptklasse {

	public static void main(String[] args) {

		ArrayList<Integer> liste;
		liste = new ArrayList<Integer>();

		// liste.add(1);
		// liste.add(2);
		// liste.add(3);
		// liste.add(4);
		// liste.add(5);

		Eingabe(liste);
		System.out.println(liste);
		double a = ArithmetischesMittel(liste);
		GeometrischesMittel(liste);
		Groesse(liste);
		ArrayList<Integer> liste2 = Korregieren(liste, a);
		Korregieren2(liste, a, liste2);

	}

	/**
	 * Nimmt die ArrayList und füllt sie mit Eingaben des Users Lässt nur
	 * Integer Werte zu Gibt Liste zurück, damit andere Methoden mit arbeiten
	 * können.
	 */
	public static ArrayList<Integer> Eingabe(ArrayList<Integer> liste) {

		String s = "nichtNichts";

		do {
			try {

				s = JOptionPane
						.showInputDialog("Bitte ganze Zahl eingeben! \n Wenn du keine weitere Zahl eingeben möchtest, drücke einfach OK!");
				if (s.equals("")) {
					return liste;
				}

				int zahl = Integer.parseInt(s);
				liste.add(zahl);

			} catch (NumberFormatException e) {

				try {
					s = JOptionPane
							.showInputDialog("Bitte ganze Zahl eingeben! \n Keine kommezahl und keine Buchstaben! \n Wenn du keine weitere Zahl eingeben möchtest, einfach OK drücken!");
					int zahl = Integer.parseInt(s);
					liste.add(zahl);
				} catch (NumberFormatException f) {
					s = "";
				}
			}

		} while (s != "");

		return liste;

	}

	/**
	 * Rechnet aus und gibt zurück
	 */

	public static double ArithmetischesMittel(ArrayList<Integer> liste) {

		double a = 0;
		for (int i = 0; i < liste.size(); i++) {
			a = a + liste.get(i);
		}

		double arthM = a / liste.size();
		System.out
				.println("Das aritmetische Mittel deiner eingegebnen Zahlen ist: "
						+ arthM);
		return arthM;

	}

	/**
	 * Rechnet aus und gibt zurück
	 */
	public static void GeometrischesMittel(ArrayList<Integer> liste) {
		double a = 1;
		for (int i = 0; i < liste.size(); i++) {
			a = a * liste.get(i);
		}

		// System.out.println(a);
		// System.out.println(liste.size());
		double geoM = Math.sqrt(a);
		System.out
				.println("Das geometrische Mittel deiner eingegebnen Zahlen ist: "
						+ geoM);

	}

	/**
	 * zu einfach um es zu kommentieren
	 */

	public static void Groesse(ArrayList<Integer> liste) {
		int g = liste.size();
		System.out.println("Du hast " + g + " Zahlen eingegeben!");

	}

	/**
	 * Wertet die Liste aus, ob Inhalte im Bereich liegen. Gibt neue Liste
	 * zurück, mit allen Indezes der ursprünglichen Liste zurück, welche nicht
	 * im Bereich liegen.
	 * 
	 * @param liste
	 * @param a
	 * @return
	 */
	public static ArrayList<Integer> Korregieren(ArrayList<Integer> liste,
			double a) {

		int ende = liste.size();
		int anzahl = 0;
		ArrayList<Integer> liste2  = new ArrayList<Integer>();

		for (int i = 0; i < ende; i++) {
			int zahl = liste.get(i);
			if (zahl - 0.5 * a > 0 && zahl - 1.5 * a < 0) {				//hier besseres rechnen möglich
				anzahl = anzahl + 1;

			} else {
				liste2.add(i);											// brauche ich nicht, kann ja gleich ne Liste machen die gut ist
			}

		}

		System.out.println("Die Anzahl der Zahlen in dem Breeich ist: "
				+ anzahl);
		System.out.println(liste2);
		return liste2;

	}

	/**
	 * Entfernt alle Indezes die in der neuen Liste sind von hinten nach vorn
	 * 
	 * @param liste
	 * @param a
	 * @param liste2
	 */
	public static void Korregieren2(ArrayList<Integer> liste, double a,
			ArrayList<Integer> liste2) {

		for (int i = 0; i < liste2.size(); i++) {
			int ende = liste2.size() - 1 - i;
			int eins = liste2.get(ende);
			liste.remove(eins);
		}

		System.out.println("Die korrigierte Liste: " + liste);
	}

}
