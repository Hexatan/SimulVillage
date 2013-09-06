import java.util.Random;

public class Humain {
	protected int poids;
	protected String nom;
	protected int age;
	protected Random loterie;
	protected int esperancevie;
	protected boolean adulte;

	public Humain(Humain h) {
		nom = String.valueOf(h.nom);
		poids = h.poids;
		age = h.age;
		esperancevie = h.esperancevie;
		adulte = h.adulte;
	}

	public Humain(String nom) {
		this.nom = nom;
		this.poids = 3;
		this.age = 0;
		adulte = isAdulte();
	}

	public Humain(int poids, String nom, int age, int espv) {
		this.nom = nom;
		this.poids = poids;
		this.age = age;
		esperancevie = espv;
		adulte = isAdulte();
	}

	public void vieillir() {
		age++;
	}

	public void grossir(int p) {
		poids += p;
	}

	public boolean isDead() {
		if (age > esperancevie)
			return true;
		else if (age <= 5 && (loterie.nextInt(25) + 1) == 1)
			return true;
		else
			return false;
	}

	public Humain rencontre(Humain h) {
		return h;
	}

	public boolean isAdulte() {
		if (age > 15)
			return true;
		else
			return false;
	}

	public void print() {
		System.out.println("Humain " + nom + " et poids " + poids + " et age "
				+ age + "espvie" + esperancevie);
	}

	public void setTaille(int taille) {
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Random getLoterie() {
		return loterie;
	}

	public void setLoterie(Random loterie) {
		this.loterie = loterie;
	}

	public int getEsperancevie() {
		return esperancevie;
	}

	public void setEsperancevie(int esperancevie) {
		this.esperancevie += esperancevie;
	}

}
