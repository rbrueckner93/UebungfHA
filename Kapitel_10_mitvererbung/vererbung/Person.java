package vererbung;

public class Person {

	private String vorname;
	private String nachname;
	private int alter;

	public Person(String vorname, String nachname, int alter) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}

	

	public int getAlter() {
		return alter;
	}
	public String getNachname() {
		return nachname;
	}
	public String getVorname() {
		return vorname;
	}
}
