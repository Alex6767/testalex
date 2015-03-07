/**
 * La classe mage
 * @author FrédéricDROUHIN
 * @version 0.1
 */
public class Mage extends Personnage {
	
	/**
	 * Mana du mage
	 */
	int mana ;

	/**
	 * Mage avec un pseudo
	 * @param pse pseudo
	 */
	public Mage(String pse) {
		
		// Attention au mot cle super qui appelle le constructeur de la super
		super(pse);
		mana = niveau ;
		pointsVie = niveau * 8 ;
	}

	/**
	 * Mage avec un pseudo et un sa mana
	 * @param pse pseudo
	 * @param niv niveau du mage
	 */
	public Mage(String pse, int niv) {
		
		// Attention au mot cle super qui appelle le constructeur de la super, 
		// attention dans ce cas à ne pas oublier le niveau
		super(pse, niv) ;
		mana = niveau ;
		pointsVie = niveau * 8 ;		
	}

	/** Retourne une chaine correspondant à mon personne 
	 */
	public String toString() {
		String str = "" ;
		str = "Je suis le mage " + pseudo + ", mon niveau est " + niveau + ", mes points de vie sont " + pointsVie + " et mon initiative " + initiative + ", ma mana est de " + mana ;
		return str ;
	}

	/**
	 * Un mage se guerit
	 */
	public void seGuerir() {
		pointsVie = niveau * 8 ;
	}

}
