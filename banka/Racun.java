package banka;
import java.util.ArrayList;
public class Racun {
	private int brojRacuna;
	private double iznosRacuna;
	private Korisnik korisnik;
	private ArrayList<Racun> listaRacuna=new ArrayList<>();
	private Validacija val=new Validacija();
	
	public Racun(){
		
	}
	public Racun(int brojRacuna,double iznosRacuna,Korisnik korisnik){
		this.brojRacuna=brojRacuna;
		this.iznosRacuna=iznosRacuna;
		this.korisnik=korisnik;
		val.validacijaRacuna(this);
	}
	
	
	public int getBrojRacuna() {
		return brojRacuna;
	}
	public double getIznosRacuna() {
		return iznosRacuna;
	}
	public void setIznosRacuna(double iznosRacuna) {
		this.iznosRacuna = iznosRacuna;
	}
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	public ArrayList<Racun> getListaRacuna() {
		return listaRacuna;
	}
	
	
	@Override
	public String toString() {
		
		return "Racun [brojRacuna=" + brojRacuna + ", iznosRacuna="
				+ iznosRacuna + ", korisnik=" + korisnik.getIme()+ "]";
	}

}
