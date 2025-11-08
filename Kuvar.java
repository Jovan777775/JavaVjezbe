
public class Kuvar extends Zaposleni {

	public Kuvar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
	}
	@Override
	public double izracunajPlatu() {
        return 1500 + 4 * ukupanBrojSati * plataPoSatu;
	}
	@Override
	public String getDodatak() {
	    return "1500€ fiksni";
	}

	
	}
	

