package vererbung;

public class Dozent extends Person{

	private String fachbereich;

	public Dozent(String vorname, String nachname, int alter, String fachbereich) {
		super(vorname, nachname, alter);
		this.fachbereich = fachbereich;
	}

	public String getFachbereich() {
		return fachbereich;
	}

	
	//Eine �nderung in git ist super verfolgbar.
	public void halteVorlesung() {
		System.out.println("...Vererbung erlaubt Eigenschaften und Methoden weiter zu geben...");
		System.out.println("...beispielsweise soll eine Klasse Student und eine Klasse Dozent erstellt werden...");
		System.out.println("...beide Klassen besitzen gemeinsame Eigenschaften...");
	}
	
	
	
}
