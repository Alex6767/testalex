/**
 * Une simple date
 * @author Frédéric Drouhin
 *
 */
public class Date {
	/**
	 * Jour 
	 */
	int jour ;
	
	/**
	 * mois
	 */
	int mois ;
	
	/**
	 * année
	 */
	int annee ;
	
	/**
	 * une nouvelle date
	 * @param j jour
	 * @param m mois 
	 * @param a année
	 */
	public Date(int j, int m, int a) {
		jour = j ;
		mois = m ;
		annee = a ;
	}
	
	/**
	 * Retourne la date sous la forme JJ
	 */
	public String toString() {
		String str = "" ;
		
		if (jour < 10) {
			str = "0" + jour + "/" ;
		}
		else {
			str = jour + "/" ;
		}
		
		if (mois < 10) {
			str = str + "0" + mois + "/" ;
		}
		else {
			str = str + mois + "/" ;
		}
		
		str = str + annee ;
		
		return str ;
	}

}
