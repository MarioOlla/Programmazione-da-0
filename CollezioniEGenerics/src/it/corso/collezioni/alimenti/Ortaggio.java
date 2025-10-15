package it.corso.collezioni.alimenti;

import it.corso.collezioni.alimenti.enums.Stagione;

public class Ortaggio {
	
	private String nome;
	private String colore;
	private Stagione stagione;
	private boolean ipogeo;
	
	public Ortaggio(String nome, String colore, Stagione stagione, boolean ipogeo) {
		this.nome = nome;
		this.colore = colore;
		this.stagione = stagione;
		this.ipogeo = ipogeo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public Stagione getStagione() {
		return stagione;
	}

	public void setStagione(Stagione stagione) {
		this.stagione = stagione;
	}

	public boolean isIpogeo() {
		return ipogeo;
	}

	public void setIpogeo(boolean ipogeo) {
		this.ipogeo = ipogeo;
	}

	@Override
	public String toString() {
		return "Ortaggio [nome=" + nome + ", colore=" + colore + ", stagione=" + stagione + ", ipogeo=" + ipogeo + "]";
	}	
	
	@Override
	public boolean equals(Object other) {
		if(other == null) {
			return false;
		}
		if(this.getClass().equals(other.getClass())) {
			Ortaggio o = (Ortaggio) other;
			return this.nome.equals(o.getNome());
		}
		return false;
	}

}
