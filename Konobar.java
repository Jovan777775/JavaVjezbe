
public class Konobar extends Zaposleni {

	protected double prekovremeniSati;

	public Konobar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati,
			double prekovremeniSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.prekovremeniSati = prekovremeniSati;
	}
	@Override
	public double izracunajPlatu() {
        double osnovnaSedmicnaPlata = ukupanBrojSati * plataPoSatu;
        double prekovremenaSedmicnaPlata = prekovremeniSati * (plataPoSatu * 1.2);
        return 4 * (osnovnaSedmicnaPlata + prekovremenaSedmicnaPlata);
    }
	@Override
	public String getDodatak() {
	    return prekovremeniSati + " sati";
	}

	

	
	}
	

