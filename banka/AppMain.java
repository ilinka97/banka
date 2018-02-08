package banka;

public class AppMain {

	public static void main(String[] args) {
		
		Transfer t=new Transfer();

		Korisnik k1=new Korisnik("Marko","Markovic","otvaranje racuna","123");
		Racun rac1=new Racun(8,100,k1);
		k1.setRacun(rac1);
		
		Korisnik k2=new Korisnik("Ana","Nikic","otvaranje racuna","12345");
		Racun rac2=new Racun(5,90,k2);
		k2.setRacun(rac2);
		
		t.transferNovca(rac1, rac2,80);
		
		System.out.println(rac1.toString());
		System.out.println(rac2.toString());

	
	}

}
