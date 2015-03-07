
/**
 * @author Frédéric DROUHIN
 * @version 0.1
 */
public class Guerrier extends Personnage {

	/**
	 * Un guerrier avec un pseudo
	 * @param pse pseudo
	 */
	public Guerrier(String pse) {
		super(pse);
		pointsVie = 10 * niveau ;
	}

	/**
	 * Un guerrier avec un pseudo et un niveau
	 * @param pse pseudo
	 * @param niv niveau
	 */
	public Guerrier(String pse, int niv) {
		super(pse, niv);
		pointsVie = 10 * niveau ;
	}
	
	/** Retourne une chaine correspondant à mon personne 
	 */
	public String toString() {
		String str = "" ;
		str = "Je suis le guerrier " + pseudo + ", mon niveau est " + niveau + ", mes points de vie sont " + pointsVie + " et mon initiative " + initiative ;
		return str ;
	}
	
	/**
	 * Un guerrier se guerit
	 */
	public void seGuerir() {
		pointsVie = niveau * 10 ;
	}


}
