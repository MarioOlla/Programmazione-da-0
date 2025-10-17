package it.corso.game.oggetti;

import it.corso.game.Game;

public class Cura extends Item implements Consumabile {
	
	private int recupero;
	
	public Cura(String nome, String tipo, int costo, int recupero ) {
		super(nome, tipo, costo);
		this.recupero = recupero;
	}

	@Override
	public void consuma() {
		Game.curaGiocatore(recupero);
		Game.rimuoviDallInventarioGiocatore(this);
	}

}
