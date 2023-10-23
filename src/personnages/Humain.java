package personnages;

public class Humain {
	private String nom, boissonFavorite;
	protected int quantiteArgents;

	public Humain(String nom, String boissonFavorite, int quantite_argents) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgents = quantite_argents;
	}

	public String getNom() {
		return nom;
	}

	public String getBoisson_favorite() {
		return boissonFavorite;
	}

	public int getQuantiteArgents() {
		return quantiteArgents;
	}

	public void direBonjour() {
		parler("Bonjour ! je m'appele " + nom + " et j'aime boire " + boissonFavorite + ".");
	}

	public void boire() {
		parler("mmm, un bon verre de " + boissonFavorite + " ! GLOUPS!");
	}

	public void gagnerArgent(int gain) {
		quantiteArgents += gain;
	}

	public void perdreArgent(int gain) {
		quantiteArgents -= gain;
	}

	public void acheter(String bien, int prix) {
		perdreArgent(prix);
	}

	protected void parler(String text) {
		System.out.println("(" + nom + ") - " + text);
	}
}
