package it.prova.eccezioni.astratto;

import it.prova.eccezioni.eccezioni.StrumentoNonAccordatoException;

public abstract class Strumento {
	
	private String nome;
	private boolean accordato;
	private int estensione;
	
	
	
	public Strumento(String nome, boolean accordato, int estensione) {
		this.nome = nome;
		this.accordato = accordato;
		this.estensione = estensione;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public boolean isAccordato() {
		return accordato;
	}



	public void setAccordato(boolean accordato) {
		this.accordato = accordato;
	}



	public int getEstensione() {
		return estensione;
	}



	public void setEstensione(int estensione) {
		this.estensione = estensione;
	}



	public abstract void suona() throws StrumentoNonAccordatoException;
}
