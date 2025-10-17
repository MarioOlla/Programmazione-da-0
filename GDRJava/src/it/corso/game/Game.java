package it.corso.game;

import java.util.ArrayList;
import java.util.List;

import it.corso.game.ambienti.Stanza;
import it.corso.game.ambienti.StanzaNormale;
import it.corso.game.entita.Giocatore;
import it.corso.game.enumerativi.Direzione;
import it.corso.game.oggetti.Consumabile;

public class Game {
	
	private static Giocatore giocatore;

	public static void main(String[] args) {
		
		giocatore = new Giocatore("Giorgio");
		
		List<Stanza> stanze = new ArrayList<Stanza>();
		Stanza stanza = new StanzaNormale(true);
		stanze.add(stanza);
		
		Stanza altraStanza = new StanzaNormale(false);
		stanza.collegaStanza(Direzione.NORD, altraStanza);
		stanze.add(altraStanza);
		
		altraStanza = new StanzaNormale(false);
		stanza.collegaStanza(Direzione.EST, altraStanza);
		stanze.add(altraStanza);
		
		altraStanza = new StanzaNormale(false);
		stanza.collegaStanza(Direzione.SUD, altraStanza);
		stanze.add(altraStanza);
		
		
		
		System.out.println(stanza);
	}
	
	public static void curaGiocatore(int cura) {
		giocatore.recuperaSalute(cura);
	}
	
	public static void rimuoviDallInventarioGiocatore(Consumabile c) {
		giocatore.rimuoviConsumabile(c);
	}

}
