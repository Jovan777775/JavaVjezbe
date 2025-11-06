
public class TV extends EProizvodi {

	private double velicinaEkrana;

	public TV(String opisProizvoda, String sifra, double uvoznaCijena, double velicinaEkrana) {
		super(opisProizvoda, sifra, uvoznaCijena);
		this.velicinaEkrana = velicinaEkrana;
	}
	public double maloprodajnaCijena() {
		double cijena = super.maloprodajnaCijena();
		if (velicinaEkrana > 65) {
			cijena *= 1.10;
		}
		return cijena;
	}
	@Override
	public String toString() {
		return super.toString() + "TV [velicinaEkrana=" + velicinaEkrana + "]";
	}
	
	}
	
	
	

