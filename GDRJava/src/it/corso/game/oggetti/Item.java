package it.corso.game.oggetti;

public class Item {

	private String nome;
	private String tipo;
	private int costo;

	public Item(String nome, String tipo, int costo) {
		this.nome = nome;
		this.tipo = tipo;
		this.costo = costo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

}
