package vjezbe7;

public class Automobil extends Vozilo {
	private int brojVrata;
	private String tipMotora;
	public Automobil(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int brojVrata,
			String tipMotora) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.brojVrata = brojVrata;
		this.tipMotora = tipMotora;
	}
	

}
