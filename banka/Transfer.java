package banka;

public class Transfer extends Racun{

	public void transferNovca(int id1, int id2, double iznos){
	
		int idPosiljaoca=provjeraPosiljaoca(id1);
		int idPrimaoca=provjeraPrimaoca(id2);
		
		double stanjePosiljaoca=racuni.get(idPosiljaoca).getIznosRacuna();
		double stanjePrimaoca=racuni.get(idPrimaoca).getIznosRacuna();
		
		if(stanjePosiljaoca>=iznos){
			racuni.get(idPosiljaoca).setIznosRacuna(stanjePosiljaoca-iznos);
			racuni.get(idPrimaoca).setIznosRacuna(stanjePrimaoca+iznos);
		}else{
			System.out.println("Nedovoljan iznos racuna.");
		}
		
	}
	
	private int provjeraPosiljaoca(int id1){
		
		int idPosiljaoca=-1;
		for(Racun rc : racuni){
			if(id1==rc.getBrojRacuna()){
				idPosiljaoca=racuni.indexOf(rc);	
			}
		}
		return idPosiljaoca;
	}
	private int provjeraPrimaoca(int id2){
		
		int idPrimaoca=-1;
		for(Racun rc : racuni){
			if(id2==rc.getBrojRacuna()){
				idPrimaoca=racuni.indexOf(rc);	
			}
		}
		return idPrimaoca;
	}
	
	
}
