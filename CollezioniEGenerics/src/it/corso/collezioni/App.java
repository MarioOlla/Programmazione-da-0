package it.corso.collezioni;

import java.util.ArrayList;
import java.util.List;

import it.corso.collezioni.alimenti.Ortaggio;
import it.corso.collezioni.alimenti.enums.Stagione;
import it.corso.collezioni.mylist.linked.MyLinkedList;
import it.corso.collezioni.mylist.linked.MyLinkedListElement;

public class App {

	public static void main(String[] args) {
//		List<Ortaggio> ortaggi = new ArrayList<Ortaggio>();
//		ortaggi.add(new Ortaggio("Carota","Arancione", Stagione.QUATTRO_STAGIONI, true));
//		ortaggi.add(new Ortaggio("Cipolla","Rosso", Stagione.QUATTRO_STAGIONI, true));
//		ortaggi.add(null);
//		ortaggi.add(new Ortaggio("Zucca","Arancione", Stagione.AUTUNNALE, false));
//		ortaggi.add(new Ortaggio("Iceberg","Verde", Stagione.QUATTRO_STAGIONI, false));
//		ortaggi.add(new Ortaggio("Rapa","Viola", Stagione.INVERNALE, true));
//		
//		stampaContenuto(ortaggi);
//		
//		Ortaggio[] ortArray = ortaggi.toArray(new Ortaggio[ortaggi.size()]);
//		
//		System.out.println("\n");
//		stampaContenuto(ortArray);
//		
//		System.out.println("\n" + ortaggi.get(2));
//		
//		ortaggi.set(2, new Ortaggio("Carciofo", "Verde", Stagione.PRIMAVERILE, false));
//		
//		System.out.println("\n" + ortaggi.get(2));
//		
//		System.out.println("\n");
//		stampaContenuto(ortaggi);
//		
//		System.out.println("\n");
//		ortaggi.remove(new Ortaggio("Carciofo", "Verde", Stagione.PRIMAVERILE, false));
//		
//		stampaContenuto(ortaggi);
//		System.out.println("\n");
//		
//		ortaggi.remove(2);
//		stampaContenuto(ortaggi);
//		
//		System.out.println(ortaggi.size());
//		
//		ortaggi.clear();
//		
//		System.out.println(ortaggi.size());
		
		MyLinkedList<Ortaggio> list = new MyLinkedList<Ortaggio>();
		list.add(new Ortaggio("Carciofo", "Verde", Stagione.PRIMAVERILE, false));
		list.add(new Ortaggio("Carota", "Arancione", Stagione.PRIMAVERILE, true));
		list.add(new Ortaggio("Melanzana", "Viola", Stagione.PRIMAVERILE, false));
		
		list.stampaContenuto();
		
		System.out.println(list.size());
		
//		list.clear();
//		list.stampaContenuto();
//		System.out.println(list.size());
		
		list.imposta(0, new Ortaggio("Bamia", "Rosso", Stagione.QUATTRO_STAGIONI, false));
		list.stampaContenuto();
		
		System.out.println("\n");
		
		list.remove(2);
		list.stampaContenuto();
		System.out.println(list.size());
	}
	
	public static void stampaContenuto(List<? extends Object> lista) {
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	
	public static void stampaContenuto(Object[] lista) {
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

}
