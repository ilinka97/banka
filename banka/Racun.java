package banka;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Racun {
	
	private int brojRacuna;
	private double iznosRacuna;
	private String imeVlasnika;
	private static ArrayList<Racun> racuni = new ArrayList<>();
	
	public Racun(){
		racuni.add(this);
	}
	public Racun(int brojRacuna,double iznosRacuna,String imeVlasnika) {
		this.brojRacuna=brojRacuna;
		this.iznosRacuna=iznosRacuna;
		this.imeVlasnika=imeVlasnika;
	}
	
	
	public void setBrojRacuna(int brojRacuna) {
		if(brojRacuna>0 && postojanjeRacuna(brojRacuna)){
			this.brojRacuna = brojRacuna;
		}else{
			System.out.println("Nije dozvoljeno kreiranje racuna sa negativnim brojem ili vec postojecim.");
			return;
		}
	}
	private boolean postojanjeRacuna(int brojRacuna){
		for(Racun r : racuni){
			if(brojRacuna==r.brojRacuna){
				return false;
			}
		}
		return true;
	}
	public int getBrojRacuna() {
		return brojRacuna;
	}
	public double getIznosRacuna() {
		return iznosRacuna;
	}
	public void setIznosRacuna(double iznosRacuna) {
		if(iznosRacuna>0){
			this.iznosRacuna = iznosRacuna;
		}else{
			System.out.println("Nije dozvoljeno kreiranje racuna sa negativnim iznosom.");
			return;
		}
	}
	public String getImeVlasnika() {
		return imeVlasnika;
	}
	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika= imeVlasnika;
	}
	public static ArrayList<Racun> getRacuni() {
		return racuni;
	}
	public static void setRacuni(ArrayList<Racun> racuni) {
		Racun.racuni = racuni;
	}
	
	
	public void unosPodataka() throws IOException{
		
		Path path=Paths.get("baza.txt");
		BufferedWriter writer=Files.newBufferedWriter(path);
			
		for(Racun r : racuni){
			writer.write(r.brojRacuna+" ");
			writer.write(String.valueOf(r.iznosRacuna)+" ");
			writer.write(r.imeVlasnika+" ");	
			writer.newLine();
		}
		writer.close();
	}
	
	
	
	
	public void transferNovca(int id1, int id2, double iznos){
		
		int idPosiljaoca=provjeraPosiljaoca(id1);
		int idPrimaoca=provjeraPrimaoca(id2);
		
		double stanjePosiljaoca=Racun.getRacuni().get(idPosiljaoca).getIznosRacuna();
		double stanjePrimaoca=Racun.getRacuni().get(idPrimaoca).getIznosRacuna();
		
		if(stanjePosiljaoca>=iznos){
			Racun.getRacuni().get(idPosiljaoca).setIznosRacuna(stanjePosiljaoca-iznos);
			Racun.getRacuni().get(idPrimaoca).setIznosRacuna(stanjePrimaoca+iznos);
		}else{
			System.out.println("Nedovoljan iznos racuna.");
		}
		
	}
	private int provjeraPosiljaoca(int id1){
		
		for(Racun rc : racuni){
			if(id1==rc.getBrojRacuna()){
				int idPosiljaoca=Racun.getRacuni().indexOf(rc);
				return idPosiljaoca;
			}
		}
		return id1;
	}
	private int provjeraPrimaoca(int id2){
		
		for(Racun rc : racuni){
			if(id2==rc.getBrojRacuna()){
				int idPrimaoca=Racun.getRacuni().indexOf(rc);	
				return idPrimaoca;
			}
		}
		return id2;
	}
	
	
	
	
	
	public void ispisPodataka() throws IOException{
		
		Path path=Paths.get("baza.txt");
		BufferedReader reader = Files.newBufferedReader(path);
		String line;
		
		while((line=reader.readLine()) != null){
			System.out.println(line);
		}
		reader.close();
	}
	

}
