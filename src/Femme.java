import java.util.Random;

public class Femme extends Humain {
	private int fertilite;
	private int nbBebe;
	private Homme mari;

	public Femme(Femme h) {
		super(h);
		fertilite = h.fertilite;
	}

	public Femme(String nom) {
		super(nom);
		fertilite = 0;
		loterie = new Random();
		esperancevie = 60 + loterie.nextInt(30);
	}

	public Femme(int poids, String nom, int age, int espv, int fertilite) {
		super(poids, nom, age, espv);
		this.fertilite = fertilite;
	}

	public void vieillir() {
		super.vieillir();
		loterie = new Random();
		if (age > 15)
			fertilite = loterie.nextInt(100);
		if (age <= 15 && poids < 40)
			grossir(loterie.nextInt(3) + 1);
	}

	public Humain rencontre(Humain h) {
		Humain b;
		loterie = new Random();
		if (h instanceof Femme)
			return null;
		if (age > 15 && age < 50 && h.age > 15) {
			if (poids > 150 || h.poids > 150) {
				return null;
			} else {
				int f = loterie.nextInt(100);
				if (f > fertilite)
					return null;
				int p = loterie.nextInt(100);
				if (p < 50)
					b = new Homme("toto");
				else
					b = new Femme("titi");
				grossir(10);
				nbBebe++;
			}
		} else
			return null;
		return b;
	}

	public int getFertilite() {
		return fertilite;
	}

	public void setFertilite(int fertilite) {
		this.fertilite = fertilite;
	}

	public int getNbBebe() {
		return nbBebe;
	}

	public void setNbBebe(int nbBebe) {
		this.nbBebe += nbBebe;
	}
}
