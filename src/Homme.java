import java.util.Random;

public class Homme extends Humain {
	private Metier metier;
	private int argent;
	private Femme femme;

	public Homme(Homme h) {
		super(h);
	}

	public Homme(String nom) {
		super(nom);
		loterie = new Random();
		esperancevie = 50 + loterie.nextInt(40);
		metier = null;
	}

	public Homme(int poids, String nom, int age, int espv, int arg) {
		super(poids, nom, age, espv);
		argent = arg;
	}

	public void vieillir() {
		super.vieillir();
		loterie = new Random();
		if (age <= 15 && poids < 50)
			grossir(loterie.nextInt(4) + 2);
		if (age > 15 && poids < 40)
			esperancevie = age + 1;
	}

	public Humain rencontre(Humain h) {
		Humain b;
		loterie = new Random();
		if (h instanceof Homme)
			return null;
		if (h.age > 15 && h.age < 50 && age > 15) {
			if (poids > 150 || h.poids > 150) {
				return null;
			} else {
				int f = loterie.nextInt(100);
				if (f > ((Femme) h).getFertilite())
					return null;
				int p = loterie.nextInt(100);
				if (p < 50)
					b = new Homme("toto");
				else
					b = new Femme("titi");
				int g = loterie.nextInt(20) - 10;
				grossir(g);
				((Femme) h).setNbBebe(1);
			}
		} else
			return null;
		return b;
	}

	public Metier getMetier() {
		return metier;
	}

	public void setMetier(Metier metier) {
		this.metier = metier;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent += argent;
	}
}
