/**
 * Une carte bancaire
 * @author Frédéric Drouhin
 *
 */
public class CompteBancaire {
	
	/**
	 * Nom 
	 */
	String nom ;
	
	/**
	 * Prénom
	 */
	String prenom ;
	
	/**
	 * Numéro de la carte
	 */
	String numero ;
	
	/**
	 * Date d'expération
	 */
	Date dateExperitation ;

	/**
	 * Création d'un compte bancaire
	 * @param n nom
	 * @param p prénom
	 * @param dExperitation date d'expiration
	 */
	public CompteBancaire(String n, String p, String num, Date dExperitation) {
		nom = n;
		prenom = p;
		numero = num ;
		dateExperitation = dExperitation;
	}
	
	/**
	 * Vérifie que la carte 
	 * @param d date du jour
	 * @return true si la carte est expiré, false sinon
	 */
	public boolean expire(Date d) {
		boolean expire = true ;
		
		if (dateExperitation.annee >= d.annee) {
			if (dateExperitation.mois >= d.mois) {
				if (dateExperitation.jour >= d.jour) {
					expire = false ;
				}
			}
			
		}
	
		return expire ;
	}
	
	/**
	 * Retourne le comptebancaire sous la forme d'une String
	 */
	public String toString() {
		String str = "" ;
		
		str = nom + " " + prenom + " possède " + " la carte numéro " + numero + " qui expire le " + dateExperitation.toString() ;
		
		return str ;
		
	}
	
	

}
