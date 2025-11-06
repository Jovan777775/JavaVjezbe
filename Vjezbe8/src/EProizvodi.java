
public class EProizvodi {

	private String opisProizvoda;
	private String sifra;
	private double uvoznaCijena;
	public EProizvodi(String opisProizvoda, String sifra, double uvoznaCijena) {
		super();
		this.opisProizvoda = opisProizvoda;
		this.sifra = sifra;
		this.uvoznaCijena = uvoznaCijena;
	}
	
	public double maloprodajnaCijena() {
		double cijena = uvoznaCijena * 1.05;
		return cijena;
	}

	@Override
	public String toString() {
		return "EProizvodi [opisProizvoda=" + opisProizvoda + ", sifra=" + sifra + ", uvoznaCijena=" + uvoznaCijena
				+ "]";
	}
	
	
}
