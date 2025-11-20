
import java.util.Scanner;

public class CijenaProizvoda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cijena = 0;
        boolean validanUnos = false;

        while (!validanUnos) {
            System.out.print("Unesite cijenu proizvoda: ");
            String unos = scanner.nextLine();

            try {
                
                cijena = Double.parseDouble(unos);

               
                if (cijena <= 0) {
                    throw new IllegalArgumentException("Cijena mora biti veća od 0!");
                }

                validanUnos = true; 
            } catch (NumberFormatException e) {
                System.out.println("Greška: unesite broj, a ne tekst!");
            } catch (IllegalArgumentException e) {
                System.out.println("Greška: " + e.getMessage());
            }
        }

        System.out.println("Cijena proizvoda je: " + cijena + " KM.");
        scanner.close();
    }
}