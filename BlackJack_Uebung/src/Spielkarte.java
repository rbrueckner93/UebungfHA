public class Spielkarte {

	public String farbe;

	public String bezeichnung;

	private static final String BEZEICHNUNG_ASS = "Ass";
	private static final String BEZEICHNUNG_ZWEI = "Zwei";
	private static final String BEZEICHNUNG_DREI = "Drei";
	private static final String BEZEICHNUNG_VIER = "Vier";
	private static final String BEZEICHNUNG_FUENF = "F�nf";
	private static final String BEZEICHNUNG_SECHS = "Sechs";
	private static final String BEZEICHNUNG_SIEBEN = "Sieben";
	private static final String BEZEICHNUNG_ACHT = "Acht";
	private static final String BEZEICHNUNG_NEUN = "Neun";
	private static final String BEZEICHNUNG_ZEHN = "Zehn";
	private static final String BEZEICHNUNG_BUBE = "Bube";
	private static final String BEZEICHNUNG_DAME = "Dame";
	private static final String BEZEICHNUNG_KOENIG = "K�nig";

	private static final String FARBE_KARO = "Karo";
	private static final String FARBE_HERZ = "Herz";
	private static final String FARBE_PIK = "Pik";
	private static final String FARBE_KREUZ = "Kreuz";

	public Spielkarte(String farbe, String bezeichnung) {
		super();
		this.farbe = farbe;
		this.bezeichnung = bezeichnung;

	}

	/**
	 * Array mit erlaubten Farben
	 */

	public static String[] erzeugeMoeglicheFarben() {
		String[] moeglicheFarben = new String[4];
		moeglicheFarben[0] = FARBE_KARO;
		moeglicheFarben[1] = FARBE_HERZ;
		moeglicheFarben[2] = FARBE_PIK;
		moeglicheFarben[3] = FARBE_KREUZ;
		return moeglicheFarben;
	}
	/**
	 * Array mit erlaubten Bezeichnungen
	 */
	public static String[] erzeugeMoeglicheBezeichnungen() {
		String[] moeglicheBezeichnungen = new String[13];
		moeglicheBezeichnungen[0] = BEZEICHNUNG_ASS;
		moeglicheBezeichnungen[1] = BEZEICHNUNG_ZWEI;
		moeglicheBezeichnungen[2] = BEZEICHNUNG_DREI;
		moeglicheBezeichnungen[3] = BEZEICHNUNG_VIER;
		moeglicheBezeichnungen[4] = BEZEICHNUNG_FUENF;
		moeglicheBezeichnungen[5] = BEZEICHNUNG_SECHS;
		moeglicheBezeichnungen[6] = BEZEICHNUNG_SIEBEN;
		moeglicheBezeichnungen[7] = BEZEICHNUNG_ACHT;
		moeglicheBezeichnungen[8] = BEZEICHNUNG_NEUN;
		moeglicheBezeichnungen[9] = BEZEICHNUNG_ZEHN;
		moeglicheBezeichnungen[10] = BEZEICHNUNG_BUBE;
		moeglicheBezeichnungen[11] = BEZEICHNUNG_DAME;
		moeglicheBezeichnungen[12] = BEZEICHNUNG_KOENIG;
		return moeglicheBezeichnungen;
	}

	/**
	 * Gibt die farbe wieder
	 */
	public String getfarbe() {
		return farbe;
	}

	/**
	 * Gibt die bezeichnung wieder
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * Gibt einen String aus Farbe+bezeichnung zur�ck
	 */
	public String getTextdarstellung() {
		return farbe + " " + bezeichnung;
	}

	/**
	 * Gibt true zur�ck, wenn Karte ein Ass ist
	 */
	public boolean istAss() {
		return getBezeichnung().equals(BEZEICHNUNG_ASS);
	}

	public int getIntWert() {
			if (getBezeichnung().equals(BEZEICHNUNG_ASS)){
				return 11;
			}else if (getBezeichnung().equals(BEZEICHNUNG_ZWEI)){
				return 2;
			}else if (getBezeichnung().equals(BEZEICHNUNG_DREI)){
				return 3;
			}else if (getBezeichnung().equals(BEZEICHNUNG_VIER)){
				return 4;
			}else if (getBezeichnung().equals(BEZEICHNUNG_FUENF)){
				return 5;
			}else if (getBezeichnung().equals(BEZEICHNUNG_SECHS)){
				return 6;
			}else if (getBezeichnung().equals(BEZEICHNUNG_SIEBEN)){
				return 7;
			}else if (getBezeichnung().equals(BEZEICHNUNG_ACHT)){
				return 8;
			}else if (getBezeichnung().equals(BEZEICHNUNG_NEUN)){
				return 9;
			}else if (getBezeichnung().equals(BEZEICHNUNG_ZEHN)){
				return 10;
			}else if (getBezeichnung().equals(BEZEICHNUNG_BUBE)){
				return 10;
			}else if (getBezeichnung().equals(BEZEICHNUNG_DAME)){
				return 10;
			}else if (getBezeichnung().equals(BEZEICHNUNG_KOENIG)){
				return 10;
			}else {
				System.out.println("Fehler!!! Ung�ltige Karte: "+getBezeichnung());
				System.exit(0);
				return 0;
			}
	}
}
