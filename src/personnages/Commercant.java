package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int quantiteArgents) {
		super(nom, "th�", quantiteArgents);

	}

	public void recevoir(int dont) {
		quantiteArgents += dont;
		parler(dont + " sous ! Je te remercie g�n�reux donateur!");
	}

	public int seFaireExtorquer() {
		int sommeVoler = quantiteArgents;
		quantiteArgents = 0;
		parler("j'ai tout perdu ! le monde est vraiment trop injuste");
		return sommeVoler;
	}
}
