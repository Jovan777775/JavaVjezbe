import javax.swing.JOptionPane;
public class Grafika {

	public static void main(String[] args) {

		String ime = JOptionPane.showInputDialog("Unesite ime:");
		String prezime = JOptionPane.showInputDialog("Unesite prezime:");
		String godiste = JOptionPane.showInputDialog("Unesite godiste:");
		
		int godinaRodjenja = Integer.parseInt(godiste);
		
		String confirmationMessage = "Pregled podataka:\n\n" +
		                            "Ime:" + ime + "\n" +
				                    "Prezime:" + prezime + "\n" +
		                            "Godina rodjenja:" + godinaRodjenja + "\n" +
				                    "Da li su uneseni podaci tacni?";
	int dugme = JOptionPane.showConfirmDialog(null,
			                                  confirmationMessage,
			                                  "Pregled i potvrda unosa",
			                                  JOptionPane.YES_NO_CANCEL_OPTION);
	if (dugme == JOptionPane.YES_NO_OPTION) {
		String email = ime + "." + prezime + godinaRodjenja + "@kompanija.me";
		JOptionPane.showMessageDialog(null, "Vasa email adresa je:"+email,
				                             "Email",
				                             JOptionPane.INFORMATION_MESSAGE);
	}
	else {
		JOptionPane.showMessageDialog(null,
                "Otkazano",
                "Email",
                JOptionPane.INFORMATION_MESSAGE);
		
	}
	}

}
