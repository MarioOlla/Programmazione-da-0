package it.corso.lezione5;

public class App {

	public static void main(String[] args) {
		char c = 'd';		//dichiarazione di una variabile di tipo char
		int ascii = c;		//posso ottenere il codice secondo la codifica ASCII del carattere desiderato

		System.out.println("Il carattere '" + c + "' ha codice ASCII pari a " + ascii);

		char[] stringa = { 'c', '0', 'o', 'e' };		//dichiarazione di un array di char
		
		System.out.println(tuttiICaratteriSonoLettere(stringa));

	}

	/**
	 * Funzione che data una sequenza di char determina se sono tutte lettere
	 * @param parola :la sequenza di caratteri da esaminare
	 * @return true se sono tutte lettere, false altrimenti
	 */
	public static boolean tuttiICaratteriSonoLettere(char[] parola) {
		for (int i = 0; i < parola.length; i++) {	//scorro l'array...
			int ascii = parola[i];			//per ogni elemento mi ricavo il codice ascii
			//questa condizione verifica se il codice in esame è fuori dai due range delle lettere maiuscole e minuscole
			if (ascii <= 64 || (ascii >= 91 && ascii <= 96) || ascii >= 123) { 
				return false;	// se sono qui ho trovato un carettere che non è una lettera, devo ritornare false
			}
		}
		return true;	//se sono qui ho controllato tutti gli elementi e non sono mai uscito, quindi posso ritornare true+
	}

}
