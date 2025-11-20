
public class Main {

	public static void main(String[] args) {

		Vozilo b = new Biciklo("YY", 50);
		Vozilo m = new Motor("Rossi", 100);
		Vozilo a = new Auto("Golf", 150);
		
		b.info();
        System.out.println("Vrijeme dostave: " + b.izracunajVrijemeDostave(10));

        System.out.println();

        m.info();
        System.out.println("Vrijeme dostave: " + m.izracunajVrijemeDostave(10));

        System.out.println();

        a.info();
        System.out.println("Vrijeme dostave: " + a.izracunajVrijemeDostave(10));
    }

	
	}
	


