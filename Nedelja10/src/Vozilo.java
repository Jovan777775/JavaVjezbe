
public abstract class Vozilo {
	protected String id;
	protected double maxBrzina;
	public Vozilo(String id, double maxBrzina) {
		
		this.id = id;
		this.maxBrzina = maxBrzina;
	}
	
	public void info() {
		System.out.println(	"ID vozila:" + id);
		System.out.println("Maksimalna brzina vozila:" + maxBrzina + "kmh");
	}
	
	public abstract double izracunajVrijemeDostave(double udaljenostKm);
	
	
	

}
