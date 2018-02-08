package banka;

public class Korisnik {
	private String ime;
	private String prezime;
	private String sifra;
	private String namjena;
	private Racun racun;
	
	public Korisnik(){
		
	}
	public Korisnik(String ime,String prezime, String namjena,String sifra){
		this.ime=ime;
		this.prezime=prezime;
		this.namjena=namjena;
		this.sifra=sifra;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	public String getNamjena() {
		return namjena;
	}
	public void setNamjena(String namjena) {
		this.namjena = namjena;
	}
	public Racun getRacun() {
		return racun;
	}
	public void setRacun(Racun racun) {
		this.racun = racun;
	}

}
