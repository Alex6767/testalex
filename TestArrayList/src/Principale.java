import java.util.ArrayList;
import java.util.List;


public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Event> l = new ArrayList<Event>();
		l.add(new Event("Truc"));
		l.add(new Event("Bidule"));
		l.add(new Event("Machin"));
		Event f= new Event("Coucou");
		l.remove(f);
		System.out.println(l.size());
		Event h = l.get(1);
		h.setTitle("coucou");
		System.out.println(l.get(1).getTitle());
		l.remove(h);
		System.out.println(l.size());

		//Première possibilité
		for(int i=0; i<l.size();i++){
			Event e=l.get(i);
			System.out.println(e.getTitle());
		}

		//Deuxième possibilité
		l.add(new Event("TrucBidule"));
		for(Event e:l){
			System.out.println(e.getTitle());
		}









	} // Fin du main

} // Fin de la classe
