
/**
 * @author Frédéric DROUHIN
 * @version 0.1
 *
 */
public class Principal {

	public static void main(String[] args) {

		// -------------------------------------------------------
		// Deux personnages
		Personnage perso1 = new Personnage("Frédéric") ;
		Personnage persoN = new Personnage("Arnauld", 10) ;

		System.out.println(perso1.toString()) ;
		System.out.println(persoN.toString()) ;

		// -------------------------------------------------------
		// un mage et un guerrier
		Mage mage1 = new Mage("Jacques", 5) ;
		Guerrier guerr1 = new Guerrier("Laurent", 1) ;
		System.out.println(mage1.toString()) ;
		System.out.println(guerr1.toString()) ;

		// ---------------------------------------------------------
		// Le combat
		System.out.println("------------------------ Le combat") ;
		mage1.combattre(guerr1) ;
		System.out.println(mage1.toString()) ;
		System.out.println(guerr1.toString()) ;

		mage1.seGuerir();
		guerr1.seGuerir();

		// ---------------------------------------------------------
		// Les tableaux
		// un tableau de 10 personnages
		Personnage tabPers[] = new Personnage[10] ;

		// Création d'un personnage à l'indice 4 et à l'indice 7
		tabPers[4] = new Personnage("Toto", 10) ;
		tabPers[7] = new Personnage("Arnauld", 1) ;

		// combat entre 2 personnages
		tabPers[7].combattre(tabPers[4]) ;
		tabPers[4].seGuerir();
		tabPers[7].seGuerir();

		// Ajout d'un nouveau personnage
		Personnage pers = new Personnage("Frederic", 100000) ;
		tabPers[0] = pers ;

		pers.pseudo = "Fred" ;
		System.out.println("Voici le nom du personnage en 0 (ca doit être Fred même objet que Fred) : " + tabPers[0].pseudo) ;

		// J'ajoute le mage et le guerrier dans le tableau
		tabPers[2] = mage1 ;
		tabPers[8] = guerr1 ; 

		// Affichage de tous les noms des personnages du tableau (lorsque les personnages existent)
		for (int i = 0 ; i < tabPers.length ; i = i + 1) {
			if (tabPers[i] != null) { // si le personnage existe
				System.out.println(tabPers[i].pseudo) ;
			}
		}

		// Faire combattre "Arnauld" et "Fred" 1000 fois => répéter une opération 1000 fois
		for (int i = 0 ; i < 1000 ; i=i+1) {
			pers.combattre(tabPers[7]); // nous aurions pu écrire tabPers[0].combattre(tabPers[7]) ;

			if (tabPers[7].pointsVie <= 0) {
				if (pers.pointsVie <= 0) {
					System.out.println(tabPers[7].pseudo + " et " + pers.pseudo + " sont morts tous les deux") ;
				}
				else {
					System.out.println(tabPers[7].pseudo + " est mort, " + pers.pseudo + " gagne à tous les coups") ;
				}
			}
			else {
				if (pers.pointsVie <= 0) {
					System.out.println(pers.pseudo + " est mort, " + tabPers[7].pseudo + " gagne à tous les coups") ;
				}
			}

			pers.seGuerir();
			tabPers[7].seGuerir();

		}

		// "Fred" combat tous les personnages
		System.out.println("-------------------- Fred combat les autres");
		for (int i = 1 ; i < tabPers.length ; i=i+1) { // je suppose que pers est dans la case 1, deux autres solutions sont possibles (voir le TP)

			if (tabPers[i] != null) { // si le personnaga à combattre existe
				pers.combattre(tabPers[i]); // nous aurions pu écrire tabPers[0].combattre(tabPers[7]) ;

				if (tabPers[i].pointsVie <= 0) {
					if (pers.pointsVie <= 0) {
						System.out.println(tabPers[i].pseudo + " et " + pers.pseudo + " sont morts tous les deux") ;
					}
					else {
						System.out.println(tabPers[i].pseudo + " est mort, " + pers.pseudo + " gagne à tous les coups") ;
					}
				}
				else {
					if (pers.pointsVie <= 0) {
						System.out.println(pers.pseudo + " est mort, " + tabPers[i].pseudo + " gagne à tous les coups") ;
					}
				}

				pers.seGuerir();
				tabPers[7].seGuerir();
			}
		}

		// "Arnauld" combat tous les personnages
		System.out.println("-------------------- Arnauld combat les autres");
		for (int i = 1 ; i < tabPers.length ; i=i+1) { // je suppose que pers est dans la case 1, deux autres solutions sont possibles (voir le TP)

			if (tabPers[i] != null) { // si le personnaga à combattre existe

				if (tabPers[i] != tabPers[7]) {
					tabPers[7].combattre(tabPers[i]); // nous aurions pu écrire tabPers[0].combattre(tabPers[7]) ;

					if (tabPers[i].pointsVie <= 0) {
						if (tabPers[7].pointsVie <= 0) {
							System.out.println(tabPers[i].pseudo + " et " + tabPers[7].pseudo + " sont morts tous les deux") ;
						}
						else {
							System.out.println(tabPers[i].pseudo + " est mort, " + tabPers[7].pseudo + " gagne à tous les coups") ;
						}
					}
					else {
						if (tabPers[7].pointsVie <= 0) {
							System.out.println(tabPers[7].pseudo + " est mort, " + tabPers[i].pseudo + " gagne à tous les coups") ;
						}
					}

					tabPers[i].seGuerir();
					tabPers[7].seGuerir();
				}
			}
		}

		// Tous les personnages se combattent
		System.out.println("----------- Tous les personnages se combattent") ;
		for (int i = 0 ; i < tabPers.length ; i=i+1) {

			if (tabPers[i] != null) { // si le personnaga existe

				for (int j = 0 ; j < tabPers.length ; j=j+1) {
					
					if (tabPers[j] != null) {
						
						if (tabPers[i] != tabPers[j]) {
							tabPers[i].combattre(tabPers[j]) ;
							if (tabPers[i].pointsVie <= 0) {
								if (tabPers[j].pointsVie <= 0) {
									System.out.println(tabPers[i].pseudo + " et " + tabPers[j].pseudo + " sont morts tous les deux") ;
								}
								else {
									System.out.println(tabPers[i].pseudo + " est mort, " + tabPers[j].pseudo + " gagne à tous les coups") ;
								}
							}
							else {
								if (tabPers[j].pointsVie <= 0) {
									System.out.println(tabPers[j].pseudo + " est mort, " + tabPers[i].pseudo + " gagne à tous les coups") ;
								}
							}
							
						}
					}
				}
			}

		}

		// ---------------------------------------- Pour terminer la classe Joueur
		// Attention une partie présentée dans cette classe n'a pas été vue en TP, toutefois, je vous conseille de regarde la classe Date par exemple et les implications liées!
		Date d = new Date(21,10, 2014) ;
		CompteBancaire compte = new CompteBancaire("COUCOU", "TRUC", "12345", d) ;
		System.out.println(compte.toString()) ;
		
		Joueur moi = new Joueur("COUCOU", "TRUC", compte) ;
		
		System.out.println(moi.toString()) ;
		
		// ajout des personnages du tableau tabPers
		for (int i = 0 ; i < tabPers.length ; i = i + 1) {
			if (tabPers[i] != null) {
				if (moi.ajoutPersonnage(tabPers[i])) {
					System.out.println("Ajout du personnage " + tabPers[i].pseudo + " effectué au joueur " + moi.prenom + " " + moi.nom) ;
				}
				else {
					System.out.println("Impossible d'ajouter le personnage " + tabPers[i].pseudo) ;
				}
			}
		}
		
		System.out.println(moi.toString()) ;
		
		// Je supprime le meilleur personnage du monde
		if (moi.supprimePersonnage(pers)) {
			System.out.println("Suppression du personnage " + pers.pseudo + " effectué") ;
		}
		else {
			System.out.println("Impossible de supprimer le personnage " + pers.pseudo) ;
		}

		// je le supprime une 2ème fois
		if (moi.supprimePersonnage(pers)) {
			System.out.println("Suppression du personnage " + pers.pseudo + " effectué") ;
		}
		else {
			System.out.println("Impossible de supprimer le personnage " + pers.pseudo) ;
		}
		
		System.out.println(moi.toString()) ;
		
		Personnage p = moi.recherchePersonnage("Fred") ;
		if (p == null) {
			System.out.println("Aucun personnage du pseudo de Fred") ;
		}
		else {
			System.out.println("Trouvé : " + p.toString()) ;	
		}
		
		Personnage p1 = moi.recherchePersonnage("Jacques") ;
		if (p1 == null) {
			System.out.println("Aucun personnage du pseudo de Fred") ;
		}
		else {
			System.out.println("Trouvé : " + p1.toString()) ;	
		}

	}
}
