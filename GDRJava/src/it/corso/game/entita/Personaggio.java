package it.corso.game.entita;

public class Personaggio {
	private String nome;
	private int puntiFeritaMassimi;
	private int puntiFerita;
	
	
	
	public Personaggio(String nome, int puntiFeritaMassimi) {
		this.nome = nome;
		this.puntiFeritaMassimi = puntiFeritaMassimi;
		this.puntiFerita = puntiFeritaMassimi;
	}

	public int getPuntiFeritaMassimi() {
		return puntiFeritaMassimi;
	}

	public void setPuntiFeritaMassimi(int puntiFeritaMassimi) {
		this.puntiFeritaMassimi = puntiFeritaMassimi;
	}

	public String getNome() {
		return nome;
	}

	public int getPuntiFerita() {
		return puntiFerita;
	}

	public void subisciDanno(int danno) {
		this.puntiFerita -= danno;
		if(this.puntiFerita < 0) {
			puntiFerita = 0;
		}
	}
	
	public void recuperaSalute(int cura) {
		this.puntiFerita += cura;
		if(this.puntiFerita > puntiFeritaMassimi) {
			this.puntiFerita = this.puntiFeritaMassimi;
		}
	}
	
	public boolean isVivo() {
		return this.puntiFerita > 0;
	}
}
