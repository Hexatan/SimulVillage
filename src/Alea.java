import java.util.Random;
import java.util.Vector;

public class Alea {
	private static Random rand = new Random();

	public static Vector<Integer> alea(int k, int n) {
		Vector<Boolean> val = new Vector<>(n, 0);
		for (int i = 0; i < val.capacity(); i++) {
			val.addElement(false);
		}

		Vector<Integer> tab = new Vector<>(k, 0);
		int cpt = 0;

		for (int i = 0; i < k; i++) {
			int r = rand.nextInt(n);

			tab.insertElementAt(r, i);
			cpt++;

			if (val.elementAt(r))
				i--;
			else
				val.setElementAt(true, r);
		}

		System.out.printf("Nombre de 'random' : %d\n", cpt);
		return tab;
	}

}
