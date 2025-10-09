package it.corso.oggetti;

import it.corso.oggetti.automobile.Auto;

public class App {

	public static void main(String[] args) {
		
		Auto auto = new Auto("DD202DH", 3);

		System.out.println(auto);
		
		Auto veicolo = new Auto("DD202DH", 3);
		
		System.out.println(veicolo);
		
		System.out.println(auto.equals(veicolo));
	}

}
