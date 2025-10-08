package it.corso.eserciziArray;

public class App {

	public static void main(String[] args) {

		char[] sequenzaPalindroma = { 'a', 'b', 'b', 'a' };
		char[] sequenzaNonPalindroma = { 's', 'y', 's', 'o' };
		char[] asdrubale = { 'A', 's', 'd', 'R', 'u', 'b', 'A', 'l', 'E', 'd', 'h', 'W' };


		int[] numeriOrdinati = { 2, 9, 10, 11, 12, 13, 14, 18, 21, 22, 23, 24, 28, 29, 31, 34, 35, 36, 37, 39, 40, 44,
				45, 48, 49, 50, 53, 54, 55, 56, 58, 61, 64, 65, 66, 67, 70, 71, 73, 74, 75, 76, 77, 78, 79, 81, 82, 89,
				92, 97 };

//		System.out.println(sequenzaPalindroma(sequenzaPalindroma));
//		System.out.println(sequenzaPalindroma(sequenzaNonPalindroma));
//		
//		System.out.println(unisciSequenze(sequenzaPalindroma, sequenzaNonPalindroma));
//		
//		System.out.println(contaIncidenzeDiCarattere(unisciSequenze(sequenzaPalindroma, sequenzaNonPalindroma), 'u'));
//		
//		System.out.println(contaMaiuscoleForEach(asdrubale));

//		System.out.println(asdrubale);
//		ordinaDallaAMaiuscolaAllaZMinuscola(asdrubale);
//		System.out.println(asdrubale);
		System.out.println("Test efficienza ricerca a forza bruta\n");
		indiceElementoCercatoForzaBruta(numeriOrdinati, 2);
		indiceElementoCercatoForzaBruta(numeriOrdinati, 97);
		indiceElementoCercatoForzaBruta(numeriOrdinati, 65);
		indiceElementoCercatoForzaBruta(numeriOrdinati, -6);
		System.out.println("\nTest efficienza ricerca su sequenza ordinata\n");
		indiceElementoCercatoInSequenzaOrdinata(numeriOrdinati, 49);
		indiceElementoCercatoInSequenzaOrdinata(numeriOrdinati, 2);
		indiceElementoCercatoInSequenzaOrdinata(numeriOrdinati, 65);
		indiceElementoCercatoInSequenzaOrdinata(numeriOrdinati, 6);		
		indiceElementoCercatoInSequenzaOrdinata(numeriOrdinati, -13);
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
		int lenght = seq1.length + seq2.length + 1; // mi calcolo la lunghezza del nuovo array che dovrò restituire
		char[] result = new char[lenght]; // dichiaro il mio array che conterrà il risultato

		for (int i = 0; i < result.length; i++) {
			if (i < seq1.length) { // fintanto che ci sono ancora elementi nella prima sequenza...
				result[i] = seq1[i]; // scrivo gli elementi della prima sequenza dentro la sequenza risultante
			} else if (i == seq1.length) { // se ho finito di trascrivere la prima sequenza inserisco il separatore
				result[i] = ' ';
			} else {
				result[i] = seq2[i - seq1.length - 1]; // finisco di trascrivere nella mia sequenza risultante tutti gli
														// elementi della seconda
			}
		}
		return result; // ritorno la sequenza composta
	}

	/**
	 * Questa funzione conta quante volte trovo un carattere specifico all'interno
	 * di una sequenza
	 * 
	 * @param daContare :char rappresentante l'elemento cercato
	 * @param seq       :l'array di char in cui devo contare la presenza
	 *                  dell'elemento cercato
	 * @return un intero che rappresenta il numero di incidenze
	 */
	public static int contaIncidenzeDiCarattere(char[] seq, char daContare) {
		int counter = 0; // dichiaro il mio contatore e lo inizializzo a 0 (ancora non ho trovato alcuna
							// istanza del carattere)
		for (int i = 0; i < seq.length; i++) { // scorro l'intera sequenza:
			if (seq[i] == daContare) { // se trovo un elemento uguale a daContare...
				counter++; // ...incremento il mio contatore
			}
		}
		return counter; // restituisco il numero di incidenze
	}

	/**
	 * funzione che calcola quante maiuscole ho all'interno della sequenza fornita
	 * 
	 * @param seq :la sequenza da scandire
	 * @return il numero intero rappresentante la quantità di caratteri maiuscoli
	 */
	public static int contaMaiuscoleForEach(char[] seq) {
		int counter = 0; // dichiaro un contatore inizializzato a 0
		for (char c : seq) { // per ogni elemento c della sequenza seq:
			if (c >= 65 && c <= 90) { // se è compreso tra 'A' e 'Z' ...
				counter++; // ... incremento il contatore
			}
		}
		return counter; // restituisco il contatore

	}

	/**
	 * Funzione che rimuovi i caratteri rappresentanti simboli e numeri da una
	 * sequenza di char, lasciando solo lettere
	 * 
	 * @param sequenza :la sequenza di char da filtrare
	 * @return ritorna una nuova sequenza filtrata (di sole lettere)
	 */
	public static char[] rimuoviSimboliENumeri(char[] sequenza) {
		return null;
	}

	/**
	 * Funzione che ritorna un array in cui tutte le prime n posizioni sono occupate
	 * da numeri non nulli; la funzione aggiunge nella prima posizione libera il
	 * nuovo elemento, se non ci sono posizioni libere raddoppia la capienza
	 * dell'array e fa il travaso degli elementi precedentemente esistenti
	 * 
	 * @param numeri       :sequenza di interi in cui verrà inserito un nuovo
	 *                     elemento
	 * @param daAggiungere :il nuovo elemento da inserire nell'array
	 * @return l'array aggiornato
	 */
	public static int[] aggiungiInCoda(int[] numeri, int daAggiungere) {
		return null;
	}

	/**
	 * Funzione che ordina una sequenza dalla 'A' alla 'z'
	 * 
	 * @param daOrdinare :la sequenza da ordinare
	 */
	public static void ordinaDallaAMaiuscolaAllaZMinuscola(char[] daOrdinare) {
		int counter = 0;
		for (int i = 0; i < daOrdinare.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < daOrdinare.length; j++) {
				counter++;
				if (daOrdinare[j] < daOrdinare[minIndex]) {
					minIndex = j;
				}
			}
			char tmp = daOrdinare[i];
			daOrdinare[i] = daOrdinare[minIndex];
			daOrdinare[minIndex] = tmp;

		}
		System.out.println("Ordinata la sequenza in " + counter + " passate.");
	}

	public static int indiceElementoCercatoForzaBruta(int[] seq, int cercato) {
		int counter = 0;
		for (int i = 0; i < seq.length; i++) {
			counter ++;
			if(seq[i] == cercato) {
				System.out.println("ho impiegato " + counter + " passate.");
				return i;
			}
		}
		System.out.println("Non ho trovato l'elemento; ho sprecato " + counter + "cicli.");
		return -1;
	}

	public static int indiceElementoCercatoInSequenzaOrdinata(int[] seq, int cercato) {
		if(cercato < seq[0] || cercato > seq[seq.length - 1]) {
			System.out.println("Non ho trovato l'elemento; ma non ho fatto ancora alcun ciclo.");
			return -1;
		}
		int counter = 0;
		int estremoInf = 0;
		int estremoSup = seq.length - 1;
		while (estremoInf < estremoSup && estremoSup-estremoInf != 1) {
			counter ++;
			int medio = estremoInf + (estremoSup - estremoInf)/2;
			if(seq[medio] == cercato) {
				System.out.println("ho impiegato " + counter + " passate.");
				return medio;
			} else if( seq[medio] > cercato) {
				estremoSup = medio;
			} else {
				estremoInf = medio;
			}
		}
		if(  seq[estremoSup] == cercato) {
			System.out.println("ho impiegato " + counter + " passate.");
			return estremoSup;
		} else if(  seq[estremoInf] == cercato) {
			System.out.println("ho impiegato " + counter + " passate.");
			return estremoInf;
		}else {
			System.out.println("Non ho trovato l'elemento; ho sprecato " + counter + "cicli.");
			return -1;
		}
	}
}