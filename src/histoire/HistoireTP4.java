package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		/*Humain homme = new Humain("prof", "kombucha", 54);
		homme.direBonjour();		
		homme.boire();
		*/
		Commercant commercant= new Commercant("Marco",20);
		commercant.direBonjour();
		commercant.seFaireExtorquer();
		commercant.recevoir(15);
		commercant.boire();

	}

}
