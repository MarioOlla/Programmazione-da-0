package com.myproject.lezione2;

import com.myproject.lezione2.automobile.Automobile;

public class Main {

	public static void main(String[] args) {
		
		
		//Dichiarazione di variabile
		// tipo nome
		int intero;
		
		// assegnazione di un valore ad una variabile
		// a sinistra dell'uguale ho il mio contenitore ( variabele ), a destra ho il contenuto ( valore )
		// variabile = valore
		intero = 8;
		
		//inizializzazione di variabile
		// consiste nell'eseguire nella stessa istuzione la dichiarazione e assegnazione di una variabile
		int numero = 5;
		
		
		System.out.println(sommaDiInteri(intero, numero));
		
		Automobile auto = new Automobile("Fiat", "Tipo");
		Automobile auto2 = new Automobile("Audi", "A4");
		Automobile auto3 = new Automobile("Opel", "Corsa");
		Automobile auto4 = new Automobile("Renault", "Clio");
		
		auto.stampaBrandEModello();
		auto2.stampaBrandEModello();
		auto3.stampaBrandEModello();
		auto4.stampaBrandEModello();

	}
	
	
	//Dichiarazione di funzione 
	// modificatore d'accesso | tipo di ritorno | nome della funzione | lista di parametri (se presenti) tra le tonde
	// ps. "static" significa che quel determinato metodo non ha accesso al "this"
	
	public static int sommaDiInteri(int add1, int add2) {
		return (add1 + add2);
	}

}
