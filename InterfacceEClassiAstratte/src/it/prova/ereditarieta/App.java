package it.prova.ereditarieta;

import it.prova.ereditarieta.veicolo.Acquaplano;
import it.prova.ereditarieta.veicolo.Automobile;
import it.prova.ereditarieta.veicolo.abstr.Veicolo;
import it.prova.ereditarieta.veicolo.interfaccia.Galleggiante;

public class App {

	public static void main(String[] args) {
		Veicolo v = new Automobile(2000, "CZ739BQ", 220, 3, "Lamborghini", "Urus");
		v.accelera(5);
		v.arresta();
		
		Galleggiante g = new Acquaplano();
	}

}
