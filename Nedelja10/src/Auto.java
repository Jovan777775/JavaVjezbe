
public class Auto extends Vozilo {
	

	public Auto(String id, double maxBrzina) {
		super(id, maxBrzina);
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return 0;
	}

}
