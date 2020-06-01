package nakupniKosik;

public class Zbozi {
	String nazev;
	double cena;
	int pocetKusu;
	
	
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public int getPocetKusu() {
		return pocetKusu;
	}
	public void setPocetKusu(int pocetKusu) {
		this.pocetKusu = pocetKusu;
	}
	@Override
	public String toString() {
		return "Zbozi [nazev=" + nazev + ", cena=" + cena + ", pocetKusu=" + pocetKusu + "]";
	}
	
	
}
