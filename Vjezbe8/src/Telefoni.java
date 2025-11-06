
public class Telefoni extends EProizvodi {

	private String operativniSistem;
	private Double velicinaEkrana;
	public Telefoni(String opisProizvoda, String sifra, double uvoznaCijena, String operativniSistem,
			Double velicinaEkrana) {
		super(opisProizvoda, sifra, uvoznaCijena);
		this.operativniSistem = operativniSistem;
		this.velicinaEkrana = velicinaEkrana;
	}
	
	    public double maloprodajnaCijena() {
		double cijena = super.maloprodajnaCijena();
		if (velicinaEkrana > 6) {
			cijena *= 1.03;
		}
		return cijena;
		
	
}

		@Override
		public String toString() {
			return super.toString() +"Telefoni [operativniSistem=" + operativniSistem + ", velicinaEkrana=" + velicinaEkrana + "]";
		}

		 
		}
	    
	
