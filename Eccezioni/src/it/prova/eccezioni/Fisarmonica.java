package it.prova.eccezioni;

import it.prova.eccezioni.astratto.Strumento;

public class Fisarmonica extends Strumento {

	public Fisarmonica( int estensione) {
		super("Fisarmonica", true, estensione);
	}

	@Override
	public void suona() {
		System.out.println("La fisarmonica suona bene");

	}

}
