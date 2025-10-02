package it.corso.lezione4;

public class App {

	public static void main(String[] args) {
//		stampaTabellina(73);
//		
//		stampaTabellinaWhile(5);
//		
//		int prod = prodottoDeiPrimiNumeri(7);
//		System.out.println(prod);

//		System.out.println("\n\nEcco il risultato della funzione : " + primiXNumeriPari(10));
		
		int[] seq1 = {2, 5,-3,9,0,3};
		int[] seq2 = new int[8];
		
		stampaSequenzaDiInteri(seq1);
		stampaSequenzaDiInteri(seq2);
		
		inizializzaConIPrimiNumeri(seq2);
		
		stampaSequenzaDiInteri(seq2);

	}

	public static void stampaTabellina(int numero) {
		System.out.println("Tabellina del " + numero);
		String s = "" + numero;
		for (int i = 2; i <= 10; i++) {
			s += " " + numero * i;
		}

		System.out.println(s + "\n");
	}

	public static void stampaTabellinaWhile(int numero) {
		System.out.println("Tabellina del " + numero + " col ciclo while");
		String s = "" + numero;
		int c = 2; // contatore
		while (c <= 10) { // condizione
			s += " " + numero * c;
			c++; // incremento
		}
		System.out.println(s + "\n");
	}

	public static int prodottoDeiPrimiNumeri(int n) {
		for (int i = n - 1; i > 1; i--) {
			n *= i;
		}
		return n;
	}

	public static String primiXNumeriPari(int x) {
		String s = "";
		for (int i = 2; i <= 2 * x; i += 2) {
			s += " " + i;
		}
		return s;
	}
	
	public static void inizializzaConIPrimiNumeri(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
	}
	
	public static void stampaSequenzaDiInteri(int[] arr) {
		for( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\n\n");
	}
	
}
