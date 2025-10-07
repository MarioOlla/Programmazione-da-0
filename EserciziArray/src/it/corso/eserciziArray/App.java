package it.corso.eserciziArray;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {

		char[] sequenzaPalindroma = { 'a', 'b', 'b', 'a' };
		char[] sequenzaNonPalindroma = { 's', 'y', 's', 'o' };
		char[] asdrubale ={'A','s','d','R','u','b', 'A', 'l','E'};

		System.out.println(sequenzaPalindroma(sequenzaPalindroma));
		System.out.println(sequenzaPalindroma(sequenzaNonPalindroma));
		
		System.out.println(unisciSequenze(sequenzaPalindroma, sequenzaNonPalindroma));
		
		System.out.println(contaIncidenzeDiCarattere(unisciSequenze(sequenzaPalindroma, sequenzaNonPalindroma), 'u'));
		
		System.out.println(contaMaiuscoleForEach(asdrubale));
	}

	/**
	 * Questa funzione controlla se la sequenza di caratteri è palindroma. Trattasi
	 * di problema di verifica globale, quindi per me la condizione è
	 * automaticamente verificata fintanto che non trovo un caso che rompe detta
	 * condizione. Se trovo una condizione che rompe ritorno false;
	 * 
	 * @param sequenza :la sequenza di caratteri di cui devo verificare la
	 *                 palindromia
	 * @return true se la sequenza è palindroma, false altrimenti
	 */
	public static boolean sequenzaPalindroma(char[] sequenza) {
		// ho impostato il ciclo for con lunghezza array/2 perchè guardo gli elementi a
		// coppie
		for (int i = 0; i < sequenza.length / 2; i++) {
			// appena trovo un elemento che rompe la condizione di palindromia esco dalla
			// funzione
			if (sequenza[i] != sequenza[sequenza.length - 1 - i]) {
				return false;
			}
		}
		// se sono qui vuol dire che la condizione è verificata, posso ritornare true
		return true;
	}

	/**
	 * Funzione che date due sequenze di caratteri le unisce con uno spazio (' ')
	 * nel centro
	 * 
	 * @param seq1 :prima sequenza
	 * @param seq2 :seconda sequenza
	 * @return una nuova sequenza (char[]) che corrisponde all' unione delle due
	 *         precedenti
	 */
	public static char[] unisciSequenze(char[] seq1, char[] seq2) {
		int lenght = seq1.length + seq2.length + 1; 		// mi calcolo la lunghezza del nuovo array che dovrò restituire
		char[] result = new char[lenght]; 				// dichiaro il mio array che conterrà il risultato

		for (int i = 0; i < result.length; i++) {	
			if (i < seq1.length) { 						// fintanto che ci sono ancora elementi nella prima sequenza...
				result[i] = seq1[i]; 					// scrivo gli elementi della prima sequenza dentro la sequenza risultante
			} else if (i == seq1.length) {	 			// se ho finito di trascrivere la prima sequenza inserisco il separatore
				result[i] = ' ';
			} else {
				result[i] = seq2[i - seq1.length -1]; 	// finisco di trascrivere nella mia sequenza risultante tutti gli
														// elementi della seconda
			}
		}
		return result; // ritorno la sequenza composta
	}
	
	/**
	 * Questa funzione conta quante volte trovo un carattere specifico all'interno di una sequenza
	 * @param daContare :char rappresentante l'elemento cercato
	 * @param seq :l'array di char in cui devo contare la presenza dell'elemento cercato
	 * @return	un intero che rappresenta il numero di incidenze
	 */
	public static int contaIncidenzeDiCarattere(char[] seq, char daContare) {
		int counter = 0;								//dichiaro il mio contatore e lo inizializzo a 0 (ancora non ho trovato alcuna istanza del carattere)
		for (int i = 0; i < seq.length; i++) {		//scorro l'intera sequenza:
			if(seq[i] == daContare) {				// se trovo un elemento uguale a daContare...
				counter++;							//...incremento il mio contatore
			}
		}
		return counter;								//restituisco il numero di incidenze
	}
	
	/**
	 * funzione che calcola quante maiuscole ho all'interno della sequenza fornita
	 * @param seq :la sequenza da scandire
	 * @return	il numero intero rappresentante la quantità di caratteri maiuscoli
	 */
	public static int contaMaiuscoleForEach(char[] seq) {
		int counter = 0;				//dichiaro un contatore inizializzato a 0
		for(char c : seq) {			// per ogni elemento c della sequenza seq:
			if(c >= 65 && c <= 90) {	//se è compreso tra 'A' e 'Z' ...
				counter++;			//... incremento il contatore
			}
		}
		return counter;				//restituisco il contatore
		
	}
	
	/**
	 * Funzione che rimuovi i caratteri rappresentanti simboli e numeri da una sequenza di char, lasciando solo lettere
	 * @param sequenza :la sequenza di char da filtrare
	 * @return ritorna una nuova sequenza filtrata (di sole lettere)
	 */
	public static char[] rimuoviSimboliENumeri(char[] sequenza) {
		return null;
	}
	
	/**
	 * Funzione che ritorna un array in cui tutte le prime n posizioni sono occupate da numeri non nulli;
	 * la funzione aggiunge nella prima posizione libera il nuovo elemento, se non ci sono posizioni libere 
	 * raddoppia la capienza dell'array e fa il travaso degli elementi precedentemente esistenti
	 * @param numeri	:sequenza di interi in cui verrà inserito un nuovo elemento
	 * @param daAggiungere :il nuovo elemento da inserire nell'array
	 * @return l'array aggiornato
	 */
	public static int[] aggiungiInCoda(int[] numeri, int daAggiungere) {
		return null;
	}
	
	/**
	 * Funzione che ordina una sequenza dalla 'A' alla 'z'
	 * @param daOrdinare :la sequenza da ordinare
	 */
	public static void ordinaDallaAMaiuscolaAllaZMinuscola(char[] daOrdinare) {
		
	}
}