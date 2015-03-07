/**
 * Un joueur poss�dant un personnage
 * @author Fr�d�ric DROUHIN
 *
 */
public class Joueur {

	/**
	 * Nom du joueur
	 */
	String nom ;

	/**
	 * Pr�nom du joueur
	 */
	String prenom ;

	/**
	 * Son compte bancaire
	 */
	CompteBancaire compte ;

	/**
	 * 5 personnages au maximum
	 */
	Personnage personnages[] ;

	/**
	 * Un nouveau joueur
	 * @param n nom du joueur
	 * @param p pr�nom du joueur
	 * @param co son compte bancaire
	 */
	public Joueur (String n, String p, CompteBancaire co) {
		nom = n ;
		prenom = p ;
		compte = co ;
		personnages = new Personnage[4] ;
	}

	/**
	 * Ajoute un nouveau personnage (nous n'avons pas encore bien vu la boucle while)
	 * @param p le personnage � ajouter
	 * @return true s'il reste de la place, false sinon 
	 */
	public boolean ajoutPersonnage(Personnage p) {
		boolean ajoute = false ;

		int i = 0 ; // je regarde la premi�re case
		while ((i < personnages.length) && (personnages[i] != null)) { // pas facile, il faudra demander des explications
			i = i + 1 ;
		}

		if (i < personnages.length) {
			personnages[i] = p ;
			ajoute = true ;
		}

		return ajoute ;
	}

	/**
	 * Supprime Personnage (il supprime le personnage en fonction du pseudo du personnage). (nous n'avons pas encore bien vu la boucle while)
	 * @param p le personnage � supprimer
	 * @return true si le personnage est supprim�, false sinon
	 */
	public boolean supprimePersonnage(Personnage p) {
		boolean supprime = false;

		int i = 0 ; // je regarde la premi�re case
		boolean fin = false ;
		while (! fin) {
			if (i >= personnages.length) { // si je suis � la fin du tableau
				fin = true ;
			}
			else {
				if (personnages[i] == null) { // s'il n'y a pas de personnage dans la case, je vais au suivant
					i = i + 1 ;
				}
				else if (!personnages[i].pseudo.equals(p.pseudo)) { // si le nombre ne correspond pas alors je vais au suivant
					i = i + 1 ;
				}
				else { // je l'ai trouv�
					fin = true ;
				}
			}
		}
		
		// A la sortie de la boucle, soit je l'ai trouv�, soit je suis � la fin du tableau
		
		if (i < personnages.length) { // si je ne suis pas � la fin de mon tableau
			personnages[i] = null ;
			supprime = true ;
		}

		return supprime ;
	}
	
	/**
	 * Recherche un Personnage en fonction de son pseudo (m�me algorithme que pour rehercher)
	 * @param pse pseudo du personnage � rechercher
	 * @return null si le personnage n'existe pas, sinon le personnage trouv� 
	 */
	public Personnage recherchePersonnage(String pseudo) {
		Personnage p = null ; 

		int i = 0 ; // je regarde la premi�re case
		boolean fin = false ;
		while (!fin) {
			if (i >= personnages.length) { // si je suis � la fin du tableau
				fin = true ;
			}
			else {
				if (personnages[i] == null) { // s'il n'y a pas de personnage dans la case, je vais au suivant
					i = i + 1 ;
				}
				else if (!personnages[i].pseudo.equals(pseudo)) { // si le nombre ne correspond pas alors je vais au suivant
					i = i + 1 ;
				}
				else { // je l'ai trouv�
					fin = true ;
				}
			}
		}
		
		// A la sortie de la boucle, soit je l'ai trouv�, soit je suis � la fin du tableau

		if (i < personnages.length) {
			p = personnages[i] ;
		}

		return p ;
	}


	/**
	 * Nombre de personnages
	 * @return le nombre de personnages que le joueur poss�de
	 */
	public int getNombrePersonnages() {
		int nb = 0 ;
		for (int i = 0 ; i < personnages.length ; i = i + 1) {
			if (personnages[i] != null) {
				nb = nb + 1 ;
			}
		}
		return nb ;
	}

	/**
	 * Retourne une chaine avec le nom, pr�nom et les personnages du joueur
	 */
	public String toString() {
		String str = "" ;

		str = "Joueur " + prenom + " " + nom + " poss�de " + getNombrePersonnages() + " personnage(s)" ;
		if (getNombrePersonnages() > 0) {
			str = str + " que voici :" ;

			for (int i = 0 ; i < personnages.length ; i = i + 1) {
				if (personnages[i] != null) {
					str = str + "\n" + "\t" + personnages[i].pseudo + " (niveau = " + personnages[i].niveau + ")" ;
				}
			}
		}

		return str ;

	}
}
