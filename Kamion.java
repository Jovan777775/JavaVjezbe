package vjezbe7;

public class Kamion extends Vozilo {
	private double kapacitetTereta;
	private boolean imaPrikolicu;
	public Kamion(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, double kapacitetTereta,
			boolean imaPrikolicu) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.kapacitetTereta = kapacitetTereta;
		this.imaPrikolicu = imaPrikolicu;
	}

}
