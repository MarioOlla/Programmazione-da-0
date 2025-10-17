package it.corso.game.entita;

import it.corso.game.oggetti.Arma;
import it.corso.game.oggetti.Consumabile;
import it.corso.game.oggetti.Item;

public class Giocatore extends Personaggio {
	
	private Item[] inventario = new Item[20];
	private int soldi;

	public Giocatore(String nome) {
		super(nome, 10);
		this.soldi = 10;
		this.inventario[0] = new Arma("Lama","Coltello",3 , 2);
	}
	
	
	public void rimuoviConsumabile(Consumabile c) {
		for(int i = 0; i < this.inventario.length; i++) {
			if (this.inventario[i] == c) {
				this.inventario[i] = null;
				return;
			}
		}
	}
}
