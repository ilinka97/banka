package banka;

public class Transfer {

	public void transferNovca(Racun rac1,Racun rac2, double iznos){
		if(rac1.getListaRacuna().contains(rac1) && rac2.getListaRacuna().contains(rac2) && rac2.getIznosRacuna()>=iznos){
			rac1.setIznosRacuna(rac1.getIznosRacuna()+iznos);
			rac2.setIznosRacuna(rac2.getIznosRacuna()-iznos);
		}else{
			System.out.println("Nije moguce izvrsiti transakciju.");
		}
	}
}
