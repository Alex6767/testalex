/**
 * Un personnage du jeu
 * @author Frédéric DROUHIN
 * @version 0.1
 */
public class Personnage {

	// Attributs
	
	/**
	 * Pseudo du personnage
	 */
	String pseudo ;
	
	/**
	 * Niveau du personnage
	 */
	int niveau ;
	
	/**
	 * Points de vie du personnage
	 */
	int pointsVie ;

	/**
	 * Initiative du personnage
	 */
	int initiative ;
	
	// Constructeur
	
	/**
	 * Un personnage à partir du pseudo. Le reste est par défaut à 1 
	 * @param p le pseudo
	 */
	Personnage(String pse) {
		pseudo = pse ;
		niveau = 1 ;
		pointsVie = 1 ;
		initiative = 1 ;
	}
	
	/**
	 * Un personnage avec son niveau.
	 * L'initiative et ses points de vie sont dépendantes de classe Mage ou Guerrier
	 * @param p pseudo du personne
	 * @param niv niveau du personnage
	 */
	Personnage(String pse, int niv) {
		pseudo = pse ;
		niveau = niv ;
		pointsVie = niv ;
		initiative  = 1 ;
	}
	
	/**
	 * Effectue une attaque entre moi (je/this) et le personnage p
	 * @param p Personnage, l'ennemi
	 */
	void attaque(Personnage p) {
		
		// Si je (this) ai l'initiative
		if (initiative > p.initiative) {
			
			// Je (this) tape en 1er
			int mesDegats = this.niveau ;
			p.pointsVie = p.pointsVie - mesDegats ;
		}
		else { // initiative <= p.initiative
			
			// S'il (p) a l'initiative
			if (initiative < p.initiative) {
				
				// Il (p) tape en 1er
				int sesDegats = p.niveau ;
				this.pointsVie = this.pointsVie - sesDegats ;
				
			}
			else { // initiative = p.intiative
				
				// Ils (this et p) tappent en même temps
				int mesDegats = this.niveau ;
				int sesDegats = p.niveau ;
				p.pointsVie = p.pointsVie - mesDegats ;
				this.pointsVie = this.pointsVie - sesDegats ;
			}
		}
	}
	

	/**
	 * Un combat est composé de plusieurs attaques (voir la méthode attaque)
	 * @param p Personnage à combattre l'ennemi 
	 */
	void combattre(Personnage p) {
		
		// Ni moi ni p ne sont morts !
		boolean lUnDesDeuxEstMort = false ;
		
		// --------------------------------------------------------------
		// Il faut ajouter que si l'un des deux morts au début du combat, 
		// il ne faut pas faire d'attaque
		

		// --------------------------------------------------------
		// Tant que ni p ni moi ne sont morts, je fais des attaques
		while (lUnDesDeuxEstMort == false) {
			attaque(p) ;
			
			// Si je suis mort
			if (this.pointsVie <= 0) {
				lUnDesDeuxEstMort = true ;
			}
			
			// S'il est mort
			if (p.pointsVie <= 0) {
				lUnDesDeuxEstMort = true ;
			}
		}
	}
	
	/** Retourne une chaine correspondant à mon personne 
	 */
	public String toString() {
		String str = "" ;
		str = "Je suis le Personnage " + pseudo + ", mon niveau est " + niveau	+ ", mes points de vie sont " + pointsVie + " et mon initiative " + initiative ;
		return str ;
	}
	
	/**
	 * Un personnage se guerit
	 */
	public void seGuerir() {
		pointsVie = niveau ;
	}

} // Fin de classe, rien en dessous
