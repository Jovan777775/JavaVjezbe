
public class Menadzer extends Zaposleni {

	protected double bonus;

	public Menadzer(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double bonus) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.bonus = bonus;
	}
	@Override
	public double izracunajPlatu() {
        return 1300 + 4 * ukupanBrojSati * plataPoSatu + bonus;
	}
	@Override
	public String getDodatak() {
	    return bonus + "€ bonus";
	}

	
}
