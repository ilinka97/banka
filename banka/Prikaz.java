package banka;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prikaz {

	public static void main(String[] args) throws IOException{
		Scanner unos=new Scanner(System.in);
		Racun rac=null;
		
		while(true){
			System.out.println("Dobrodosli! Izaberite jednu od opcija: ");
			System.out.println("1. Kreiranje racuna");
			System.out.println("2. Transfer novca");
			System.out.println("3. Ispisivanje detalja racuna");
			System.out.println("4. Izlaz");
			int odgovor=-1;
			try{
				odgovor=unos.nextInt();
			}catch(InputMismatchException ex){
				System.out.println("Pogresan unos, unesite broj od 1 do 4!");
				unos.nextLine();
			}
			switch(odgovor){
			case 1:
				rac=new Racun();
				System.out.println("Unesite id racuna, Vase ime i iznos na racunu: ");
				rac.setBrojRacuna(unos.nextInt());
				rac.setImeVlasnika(unos.next());
				rac.setIznosRacuna(unos.nextDouble());
				rac.unosPodataka();
				System.out.println("Racun uspjesno kreiran");
				break;
			case 2:
				Transfer t=new Transfer();
				System.out.println("Unesite ID svog racuna: ");
				int id1=unos.nextInt();
				System.out.println("Unesite ID racuna na koji zelite poslati novac: ");
				int id2=unos.nextInt();
				System.out.println("Unesite iznos transakcije: ");
				double iznos=unos.nextDouble();
				t.transferNovca(id1, id2, iznos);
				break;
			case 3:
				rac.ispisPodataka();
				break;
			case 4:
				System.out.println("Dovidjenja!");
				unos.close();
				System.exit(0);
				break;
			}
		}
		
	}


}
