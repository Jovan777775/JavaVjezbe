
public class Main {

	public static void main(String[] args) {
		
		Restoran restoran = new Restoran("Rostiljijada", "KFC", "Burger King");

        Konobar konobar1 = new Konobar(1, "Stefan", "Stefanovic", 10, 40, 5);
        Kuvar kuvar1 = new Kuvar(2, "Danilo", "Petrovic", 15, 38);
        Menadzer menadzer1 = new Menadzer(3, "Jovan", "Zivkovic", 20, 40, 300);
        Konobar konobar2 = new Konobar(4, "Ivana", "Brajic", 12, 36, 2);
        Kuvar kuvar2 = new Kuvar(5, "Milos", "Milosevic", 14, 42);

        restoran.dodajZaposlenog(konobar1);
        restoran.dodajZaposlenog(kuvar1);
        restoran.dodajZaposlenog(menadzer1);
        restoran.dodajZaposlenog(konobar2);
        restoran.dodajZaposlenog(kuvar2);

        System.out.println("=== Obračun plata za restoran ===");
        restoran.obracunajPlate();

        double ukupniTrosak = restoran.ukupniTrosakPlata();
        System.out.printf("\nUkupan trošak plata restorana: %.2f €\n", ukupniTrosak);

	}

}
