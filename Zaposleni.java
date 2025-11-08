
public class Zaposleni {

	protected int id;
	protected String ime;
	protected String prezime;
	protected double plataPoSatu;
	protected double ukupanBrojSati;
	public Zaposleni(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
	}
	
	public double izracunajPlatu() {
		return 0;
		
	}
	public String getDodatak() {
	    return "-";
	}

	@Override
	public String toString() {
		return "Zaposleni [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", plataPoSatu=" + plataPoSatu
				+ ", ukupanBrojSati=" + ukupanBrojSati + "]";
	}
	
	
}
