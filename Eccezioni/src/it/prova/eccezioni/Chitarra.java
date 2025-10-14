package it.prova.eccezioni;

import it.prova.eccezioni.astratto.Accordabile;
import it.prova.eccezioni.astratto.Strumento;
import it.prova.eccezioni.eccezioni.StrumentoNonAccordatoException;

public class Chitarra extends Strumento implements Accordabile {
	
	public String tipo;
	

	public Chitarra( int estensione, String tipo) {
		super("Chitarra", false, estensione);
		this.tipo = tipo;
	}

	@Override
	public void accorda() {
		this.setAccordato(true);
		System.out.println("Ho accordato la chitarra");

	}

	@Override
	public void suona() throws StrumentoNonAccordatoException {
		if(isAccordato()) {
			System.out.println("La chitarra suona bene");
		} else {
			throw new StrumentoNonAccordatoException("Questa chitarra non è accordata!");
		}

	}

}
