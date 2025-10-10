package it.corso.ereditarieta.persona;

public class Studente extends Persona {
	
	private String matricola;
	
	public Studente(String nome, String cognome) {
		super(nome, cognome);
	}
	
	public Studente(String nome, String cognome, String matricola) {
		this(nome, cognome);
		this.matricola = matricola;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	@Override
	public String toString() {
		return "Studente:\n"
				+ super.toString() 
				+ "\nmatricola :" + (this.matricola != null ? this.matricola : "non immatricolato");
				
	}

}
