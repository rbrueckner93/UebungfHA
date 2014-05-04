
public class Spieltisch{

	public static void main(String[] args) {
		Kartenstapel Test = new Kartenstapel();
		Test.mischen();
		Kartenhand Hand = new Kartenhand();
		Hand.karteNehmen(Test);
		Hand.karteNehmen(Test);
		Hand.karteNehmen(Test);
		Hand.karteNehmen(Test);
		System.out.println(Hand.auswertungRealwert());
		System.out.println(Hand.handAnzeigen());
		System.out.println(Hand.getOptimalenWert());
		
	}

}
