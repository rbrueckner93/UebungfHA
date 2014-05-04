import java.awt.Component;

import javax.swing.JOptionPane;

public class Spieltisch {

	public static void main(String[] args) {
		int weiterSpielen = 0;
		int neuesSpiel = JOptionPane.showConfirmDialog(null, "Neues Spiel");
		if (neuesSpiel == 0) {
			Kartenstapel spielstapel = new Kartenstapel();
			spielstapel.mischen();
			Kartenhand spieler = new Kartenhand();
			Kartenhand dealer = new Kartenhand();
			spieler.karteNehmen(spielstapel);
			JOptionPane.showMessageDialog(null, spieler.handAnzeigen(),
					"Inane warning", JOptionPane.WARNING_MESSAGE);
			while (weiterSpielen == 0
					&& spieler.getOptimalenWert() <= Kartenhand.blackJack) {
				weiterSpielen = JOptionPane.showConfirmDialog(null,
						"Neue Karte");
				spieler.karteNehmen(spielstapel);
				JOptionPane.showMessageDialog(null, spieler.handAnzeigen() + " || Spieler",
						"Inane warning", JOptionPane.WARNING_MESSAGE);
				
				if (spieler.getOptimalenWert() > 21) {
					JOptionPane.showMessageDialog(null, "Verloren",
							"Inane warning", JOptionPane.WARNING_MESSAGE);
				}
				}
				if (weiterSpielen == 1) {
					int dealermaxwert = 17;
					while (dealer.auswertungRealwert() < dealermaxwert) {
						dealer.karteNehmen(spielstapel);
					}
					JOptionPane.showMessageDialog(null, dealer.handAnzeigen(),
							"Inane warning", JOptionPane.WARNING_MESSAGE);
					if (spieler.getOptimalenWert() > dealer
							.auswertungRealwert() && dealer.auswertungRealwert() <=21) {
						JOptionPane.showMessageDialog(null, "Gewonnen!",
								"Inane warning", JOptionPane.WARNING_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Verloren!",
								"Inane warning", JOptionPane.WARNING_MESSAGE);
					}
				}

		} else {
			System.exit(0);
		}

	}

}
