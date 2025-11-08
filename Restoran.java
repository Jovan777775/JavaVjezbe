
	import java.util.ArrayList;

public class Restoran {
    private String naziv;
    private String adresa;
    private String PIB;
    private ArrayList<Zaposleni> zaposleni;

    public Restoran(String naziv, String adresa, String PIB) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.PIB = PIB;
        this.zaposleni = new ArrayList<>();
    }

    
    public void dodajZaposlenog(Zaposleni z) {
        zaposleni.add(z);
    }

    
    public boolean ukloniZaposlenog(int id) {
        for (Zaposleni z : zaposleni) {
            if (z.id == id) {
                zaposleni.remove(z);
                return true;
            }
        }
        return false; 
    }

    
    public Zaposleni nadjiPoID(int id) {
        for (Zaposleni z : zaposleni) {
            if (z.id == id) {
                return z;
            }
        }
        return null; 
    }

    
    public void obracunajPlate() {
        System.out.printf("%-5s %-20s %-10s %-20s %-10s\n",
            "ID", "Ime i Prezime", "Sati", "Prekovremeni/Bonus", "Plata €");
        System.out.println("-------------------------------------------------------------");

        for (Zaposleni z : zaposleni) {
            double plata = z.izracunajPlatu();  
            String dodatak = z.getDodatak();

            System.out.printf("%-5d %-20s %-10.1f %-20s %-10.2f\n",
                    z.id, z.ime + " " + z.prezime, z.ukupanBrojSati, dodatak, plata);
        }
    }

    
    public double ukupniTrosakPlata() {
        double ukupno = 0;
        for (Zaposleni z : zaposleni) {
            ukupno += z.izracunajPlatu();
        }
        return ukupno;
    }
}
