package it.corso.game.oggetti;

public class Arma  extends Item{
	private int danno;
	
	public Arma(String tipo, String nome, int costo, int danno) {
		super(nome, tipo, costo);
		this.danno = danno;
	}
	
	public int getDanno() {
		return danno;
	}
	public void setDanno(int danno) {
		this.danno = danno;
	}
	
}
