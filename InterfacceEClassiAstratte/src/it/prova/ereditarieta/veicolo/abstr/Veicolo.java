package it.prova.ereditarieta.veicolo.abstr;

public abstract class Veicolo {
	
	private int peso;
	private String identificativo;
	private float velocitaMax;
	
	public Veicolo() {
		
	}
	
	public Veicolo(int peso, String identificativo, float velocitaMax) {
		this.peso = peso;
		this.identificativo = identificativo;
		this.velocitaMax = velocitaMax;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getIdentificativo() {
		return identificativo;
	}
	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}
	public float getVelocitaMax() {
		return velocitaMax;
	}
	public void setVelocitaMax(float velocitaMax) {
		this.velocitaMax = velocitaMax;
	}
	
	public abstract void accelera(float incremento);
	
	public void arresta() {
		System.out.println("Il veicolo è fermo");
	}
}
