package it.corso.ereditarieta.persona;

public class Persona {
	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	@Override
	public String toString() {
		return "Persona: " + (this.nome != null ? this.nome : "?")  + " " + (this.cognome != null ? this.cognome : "?");
	}
	
	public void saluta() {
		System.out.println("Ciao, sono " + this.nome + ", piacere di conoscerti!");
	}
}
