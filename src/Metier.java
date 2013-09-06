public class Metier {
	private int penibilite;
	private String nom;
	private int revenu;

	public Metier(int pen, String nom, int revenu) {
		penibilite = pen;
		this.setNom(nom);
		this.setRevenu(revenu);
	}

	public void reduirEspVie(Humain h) {
		h.setEsperancevie(-penibilite);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getRevenu() {
		return revenu;
	}

	public void setRevenu(int revenu) {
		this.revenu = revenu;
	}
}
