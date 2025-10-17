package it.corso.game.ambienti;

import java.util.EnumMap;

import it.corso.game.enumerativi.Direzione;

public abstract class Stanza {
	// determina se una stanza è buia o meno
	private boolean isBuia;
	//private Oggetto oggetto;
	// Le stanze che si aprono da questa stanza puntando nelle varie direzioni
	private EnumMap<Direzione, Stanza> stanze = new EnumMap<Direzione, Stanza>(Direzione.class);
	private int numeroNemici;
	
	public Stanza(boolean isBuia) {
		this.isBuia = isBuia;
	}
	
	public boolean isBuia() {
		return isBuia;
	}

	public void setBuia(boolean isBuia) {
		this.isBuia = isBuia;
	}


	public EnumMap<Direzione, Stanza> getStanze() {
		return stanze;
	}

	

	//se la stanza nella direzione d è null vuol dire che la direzione non porta ad alcuna stanza
	public boolean direzioneLibera(Direzione d) {
		return (this.stanze.get(d) == null);
	}
	
	public void collegaStanza(Direzione daOccupare, Stanza nuovaStanza) {
		if (this.direzioneLibera(daOccupare) && nuovaStanza.direzioneLibera(daOccupare.opposta())) {
			this.stanze.put(daOccupare, nuovaStanza);
			nuovaStanza.getStanze().put(daOccupare.opposta(), this);
		}
	}
}
