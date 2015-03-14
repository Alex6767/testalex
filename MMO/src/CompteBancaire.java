/**
 * Une carte bancaire
 * @author Fr�d�ric Drouhin
 *
 */
public class CompteBancaire {
	
	/**
	 * Nom 
	 */
	String nom ;
	
	/**
	 * Pr�nom
	 */
	String prenom ;
	
	/**
	 * Num�ro de la carte
	 */
	String numero ;
	
	/**
	 * Date d'exp�ration
	 */
	Date dateExperitation ;

	/**
	 * Cr�ation d'un compte bancaire
	 * @param n nom
	 * @param p pr�nom
	 * @param dExperitation date d'expiration
	 */
	public CompteBancaire(String n, String p, String num, Date dExperitation) {
		nom = n;
		prenom = p;
		numero = num ;
		dateExperitation = dExperitation;
	}
	
	/**
	 * V�rifie que la carte 
	 * @param d date du jour
	 * @return true si la carte est expir�, false sinon
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
		
		str = nom + " " + prenom + " poss�de " + " la carte num�ro " + numero + " qui expire le " + dateExperitation.toString() ;
		
		return str ;
		
	}
	
	

}
