package it.corso.game.enumerativi;

public enum Direzione {
	NORD,
	EST,
	SUD,
	OVEST;
	
	public Direzione opposta() {
		switch (this) {
			case NORD:
				return SUD;
			case EST:
				return OVEST;
			case SUD:
				return NORD;
			case OVEST:
				return EST;
			default:
				return null;
		}
	}
}
