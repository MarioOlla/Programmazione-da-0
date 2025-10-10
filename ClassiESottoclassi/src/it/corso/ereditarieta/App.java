package it.corso.ereditarieta;

import it.corso.ereditarieta.persona.Impiegato;
import it.corso.ereditarieta.persona.Persona;
import it.corso.ereditarieta.persona.Studente;

public class App {

	public static void main(String[] args) {
		Persona p = new Persona("Mario", "Rossi");
		Persona s = new Studente("Giuseppe", "Bianchi","cccqqq");
		Impiegato i = new Impiegato("Giulio", "Neri");
		
		
		System.out.println(((Studente)s).getMatricola());
		
		somma(2,3);
		
	}
	
	public static int somma(int a, int b) {
		return a+b;
	}
	
	public static int somma(float a, float b) {
		return (int) (a+b);
	}
	
	public static float somma(int a, int b, float c) {
		return a+b+c;
	}
	
	public static float somma(int a, float b, int c) {
		return a+b+c;
	}
	

}
