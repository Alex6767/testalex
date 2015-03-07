/**
 * Un démoniste
 * @author Frédéric DROUHIN
 * @version 0.1
 */
public class Demoniste extends Personnage {
	
	/**
	 * Nombre de familier
	 */
	int nbFamiliers ;
	
	/**
	 * Avec un pseudo
	 * @param pse pseudo
	 */
	Demoniste(String pse) {
		super(pse) ;
		nbFamiliers = 1 ;
		pointsVie = niveau * 8 ;
	}
	
	/**
	 * Avec un pseudo, un niveau et un nombre de familiers
	 * @param pse pseudo
	 * @param niv 
	 * @param nb
	 */
	Demoniste(String pse, int niv, int nb) {
		super(pse,niv);
		nbFamiliers=nb;
		pointsVie=niveau*8;
	}
	
	public void seGuerir() {
		pointsVie=niveau*8;
	}
	
	public String toString() {
		String str = "" ;
		str = "Je suis le demoniste " + pseudo + ", mon niveau est " + niveau + ", mes points de vie sont " + pointsVie 
				+ " et mon initiative " + initiative 
				+ ", nombre de familiers est " + nbFamiliers ;
		return str ;
	}

}
