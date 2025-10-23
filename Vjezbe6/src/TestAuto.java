import java.util.ArrayList;

class Auto{
	private String markaAuta;
	private int godisteAuta;
	private float snagaMotora;
	private boolean prodato;
	private float kubikaza;
	private boolean reigistrovan;
	private static int brojProdatih = 0;
	
	public Auto(String markaAuta, int godisteAuta, float snagaMotora, boolean prodato, float kubikaza, boolean registrovan) {
	this.markaAuta = markaAuta;	
	this.godisteAuta = godisteAuta;
	this.snagaMotora = snagaMotora;
	this.kubikaza = kubikaza;
	this.prodato = prodato;
	if(prodato) brojProdatih++;
	this.reigistrovan = godisteAuta < 1985 ? false : registrovan;
	}
	
	public String getMarkaAuta() {
		return markaAuta;
				
	}
	public void setMarkaAuta(String markaAuta) {
		this.markaAuta = markaAuta;
	}
	
	public int getGodisteAuta() {
		return godisteAuta;
	}
	
	public void setGodisteAuta(int godisteAuta) {
		if (godisteAuta >= 2025) {
			System.out.print("Jos nijesmo stigli do te goodine");
			return;
		}
		this.godisteAuta = godisteAuta;
		if (godisteAuta < 1985) this.reigistrovan = false;
	}
	
	public float getSnagaMotora() {
		return this.snagaMotora;
		
	}
	public void setSnagaMotora(float snagaMotora) {
		this.snagaMotora = snagaMotora;
	}
	public boolean jeProdato() {
		return this.prodato;
	}
	public void setProdato(boolean prodato) {
		if (this.prodato != prodato && prodato) brojProdatih++;
		this.prodato = prodato;
	}
	public float getKubikazaMotora() {
		return this.kubikaza;
	}
	public void setKubikazaMotora(float kubikaza) {
	this.kubikaza = kubikaza;	
	}
	public boolean jeRegistrovan() {
		return this.jeRegistrovan();
	}
	public void setRegistrovan(boolean registrovan) {
		if (this.godisteAuta >= 1985) this.reigistrovan = registrovan;
	}
	public static int brojProdatih() {
		return brojProdatih;
	}
	public boolean mozeSeRegistrovati() {
		return godisteAuta >= 1985;
	}
	public static double koeficijentZaGodiste(int godiste) {
	    if (godiste < 1985)	 return 0.0;
	    if (godiste <= 2000) return 3.0;
	    if (godiste <= 2010) return 2.0;
	    return 1.5;
	}
	public double cijenaRegistracije() {
		if (!mozeSeRegistrovati()) return 0.0;
		return koeficijentZaGodiste(godisteAuta) * kubikaza * snagaMotora;
	}
	public String toString() {
		return String.format("Auto [marka =%s, godiste =%d, snaga =%.1f" + "kubikaza =%1f, registrovan =%s, prodato =%s, cijenaReg=%2f]", markaAuta, godisteAuta, snagaMotora, kubikaza, reigistrovan ? "da": "ne", cijenaRegistracije());
	}
	
}
class AutoServis {
	public static ArrayList<Auto> neregostrovaniKojiSeMoguRegistrovati(ArrayList<Auto>auta) {
	ArrayList<Auto> lista = new ArrayList<>();
	for (Auto a: auta) {
		if (a.mozeSeRegistrovati() && !a.jeRegistrovan()) {
			lista.add(a);
		}
	}
	return lista;
}

public static double ukupnaRegistracija(ArrayList<Auto>auta) {
	double suma = 0;
	for (Auto a:auta) {
		suma += a.cijenaRegistracije();
	}
	return suma;
}
}
public class TestAuto {

	public static void main(String[] args) {
    ArrayList<Auto> auta = new ArrayList<>();
    Auto a1 = new Auto("VW Golf 3", 1995, 55, true, 1600, false);
    auta.add(a1);
    for (Auto a: AutoServis.neregostrovaniKojiSeMoguRegistrovati(auta)) {
    	System.out.println(a);
    }
    System.out.print(auta.get(0));
	}

}
