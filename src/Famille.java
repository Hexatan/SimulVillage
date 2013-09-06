import java.util.Vector;

public class Famille {
	private Vector<Homme> liHomme = new Vector<>();
	private Vector<Femme> liFemme = new Vector<>();

	public Famille() {
		
	}

	public Vector<Homme> getLiHomme() {
		return liHomme;
	}

	public void setLiHomme(Vector<Homme> liHomme) {
		this.liHomme = liHomme;
	}

	public Vector<Femme> getLiFemme() {
		return liFemme;
	}

	public void setLiFemme(Vector<Femme> liFemme) {
		this.liFemme = liFemme;
	}
}
