package it.corso.lezione3;

public enum StatoUtente {
	
	UNREGISTERED, // utente non ancora censito
	PENDING, //in attesa di completare il processo di iscrizione
	ACTIVE, //utente abilitato in piattaforma
	BANNED, //non abilitato più sulla piattaforma per motivi di condotta
	CANCELLED, // utente che ha chiuso il proprio account

}
