import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		System.out.println("unesi tekst:");
		String tekst = sc.nextLine();
		String[] rijeci = tekst.split(" ");
		System.out.println("Broj rijeci je:" + rijeci.length);

	
	}

}
