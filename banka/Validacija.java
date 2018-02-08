package banka;

public class Validacija {
	
	
	public void validacijaRacuna(Racun rac){
		if(provjeraDuplikataRacuna(rac,rac.getBrojRacuna())||provjeraRacuna(rac)){	
			rac.getListaRacuna().add(rac);
		}
	}
	
	private boolean provjeraRacuna(Racun rac){
		if(rac.getBrojRacuna()<0 || rac.getIznosRacuna()<0){
			System.out.println("Neodgovarajuci broj ili iznos racuna.");
			return false;
		}else{
			return true;
		}
	}
	private boolean provjeraDuplikataRacuna(Racun rac,int brojRacuna){
		if(rac.getListaRacuna().contains(rac) && rac.getBrojRacuna()==brojRacuna){
			System.out.println("Taj broj racuna vec postoji.");
			return false;
		}else{
			return true;
		}
	}
	
}
