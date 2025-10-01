package it.corso.lezione3;

public class Main {

	public static void main(String[] args) {

		/**
		 * 
		 * = : operatore di assegnazione ( assegna un valore ad una variabile )
		 * 
		 * OPERATORI MATEMATICI
		 * 
		 * + : effettua la somma di più addendi - : effettua la sottrazione tra minuendo
		 * e sottraendo * : effettua la moltiplicazione tra prodotti / : effettua la
		 * divisione tra dividendo e divisore % : esegue il modulo tra due numeri
		 * 
		 * OPERATORI LOGICI
		 * 
		 * ! : negazione ( !true = false e !false = true ) &&: AND logico ||: OR logico
		 * 
		 * OPERATORI DI CONFRONTO
		 * 
		 * ==: uguaglianza !=: diversità > : maggiore >=: maggiore o uguale < : minore
		 * <=: minore o uguale
		 * 
		 */

		boolean vero = true;

		int positivo = 12;
		int negativo = -3;

		String hello = "Hello";
		String world = "World";

		// blocco condizionale if
		if ((12%4) == 0 && positivo > 5) {
			System.out.println(11%4);
			System.out.println("La condizione booleana è vera");
		} else if(12%4 != 0){
			System.out.println("11 non è multiplo di 4");
		} else { 	// blocco else ( l'alternativa all'if)
			System.out.println("Il numero positivo non è maggiore di 5");
		}
		
		
		if(positivo%2 == 0) {
			System.out.println("Divisibile per due");
		}else if(positivo%3 == 0) {
			System.out.println("Divisibile per tre");
		}
		
		float f = 12.3f;
		double d = 13.0;

		positivo = 0;
		System.out.println("DO_WHILE");
		do {
			// esegui blocco

			positivo--; // decrementa la varibile (positivo = positivo - 1)
			System.out.println("Ora il mio numero vale " + positivo);
		} while (positivo > 0);

		positivo = 0;
		System.out.println("WHILE");
		while (positivo > 0) {
			// esegui blocco

			positivo--; // decrementa la varibile (positivo = positivo - 1)
			System.out.println("Ora il mio numero vale " + positivo);
		}

		positivo = 16;
		System.out.println("Ora il mio numero vale " + positivo);
		for (int i = 1; i < 9; i *= 2) {
			positivo--;
//			System.out.println("Positivo: " + positivo + ", contatore: " + i);

		}

		Genere g = Genere.FEMMINA;

		switch (g) {
		case MASCHIO: {
			System.out.println("maschio");
			break;
		}
		case FEMMINA: {

			System.out.println("femmina");
			break;
		}
		default:
			System.out.println("altro");

		}

	}

}
