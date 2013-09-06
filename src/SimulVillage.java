import java.util.Random;
import java.util.Vector;

public class SimulVillage {

	public static void main(String[] args) {
		Vector<Metier> liMetier = new Vector<Metier>();
		liMetier.add(new Metier(3, "bucheron", 1200));
		liMetier.add(new Metier(4, "fermier", 1000));
		liMetier.add(new Metier(2, "saltimbanque", 1700));
		liMetier.add(new Metier(0, "roi", 5000));

		Vector<Humain> population = new Vector<Humain>();
		int nbTour = Integer.parseInt(args[0]);
		int tailleInit = Integer.parseInt(args[1]);
		Random r = new Random();
		int ch = 1;
		int cf = 1;
		for (int i = 0; i < tailleInit; i++) {
			if (i % 2 == 0) {
				population.add(new Homme(70, ("homme" + ch),
						(16 + r.nextInt(9)), (50 + r.nextInt(40)), 1000));
				ch++;
			} else {
				population.add(new Femme(55, ("femme" + cf),
						(16 + r.nextInt(9)), (50 + r.nextInt(50)), r
								.nextInt(100)));
				cf++;
			}
		}
		((Homme) population.elementAt(0)).setMetier(liMetier.lastElement());
		
		
	}
}