
public class Racunari extends EProizvodi {

	private String procesor;
	private int memorija;
	public Racunari(String opisProizvoda, String sifra, double uvoznaCijena, String procesor, int memorija) {
		super(opisProizvoda, sifra, uvoznaCijena);
		this.procesor = procesor;
		this.memorija = memorija;
	}
	
	public double maloprodajnaCijena() {
		double cijena = super.maloprodajnaCijena();
		cijena *= 1.05;
		return cijena;
	}

	@Override
	public String toString() {
		return super.toString() + "Racunari [procesor=" + procesor + ", memorija=" + memorija + "]";
	}

	
	}

	
	
	

