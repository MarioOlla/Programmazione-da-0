package it.prova.ereditarieta.veicolo;

import it.prova.ereditarieta.veicolo.abstr.Veicolo;

public class Automobile extends Veicolo {
	
	private int numeroPorte;
	private String produttore;
	private String modello;
	
	public Automobile(int peso, String identificativo, float velocitaMax) {
		super(peso, identificativo, velocitaMax);
	}


	public Automobile(int peso, String identificativo, float velocitaMax, int numeroPorte, String produttore, String modello) {
		this(peso, identificativo, velocitaMax);
		this.numeroPorte = numeroPorte;
		this.produttore = produttore;
		this.modello = modello;
	}


	public int getNumeroPorte() {
		return numeroPorte;
	}


	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}


	public String getProduttore() {
		return produttore;
	}


	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}


	public String getModello() {
		return modello;
	}


	public void setModello(String modello) {
		this.modello = modello;
	}


	@Override
	public void accelera(float incremento) {
		System.out.println("L'auto accelera di " + incremento + "km/h");
		
	}
	
	public void apriBagagliaio() {
		System.out.println("Hai aperto il bagagliaio della macchina");
	}
	
	
	
}
