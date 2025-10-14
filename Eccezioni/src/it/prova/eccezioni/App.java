package it.prova.eccezioni;

import it.prova.eccezioni.astratto.Accordabile;
import it.prova.eccezioni.astratto.Strumento;
import it.prova.eccezioni.eccezioni.StrumentoNonAccordatoException;

public class App {

	public static void main(String[] args) {
		
		Strumento[] strumenti = {
				new Chitarra(3, "Classica"),
				new Chitarra(5, "Elettrica"),
				new Chitarra(4, "Acustica"),
				null,
				new Fisarmonica(1),
				new Fisarmonica(3),
				new Fisarmonica(2)
		};
			
		System.out.println("Provo a fare il concerto:");
		eseguiConcerto(strumenti);
		
		System.out.println("\nAccordo gli stumenti:");
		accordaStrumenti(strumenti);
		
		System.out.println("\nS gli stumenti:");
		eseguiConcerto(strumenti);
		
	}
	
	public static void eseguiConcerto(Strumento[] strumenti) {
		for (int j = 0; j < strumenti.length; j++) {
			try {				
				strumenti[j].suona();
			} catch (NullPointerException npe) {
				System.err.println("Lo strumento che stai tentando di suonare è nullo!");
			} catch (StrumentoNonAccordatoException snae) {
				System.err.println(snae.getMessage());
			}
		}
	}
	
	public static void accordaStrumenti(Strumento[] strumenti) {
		int i = 0;
		while (i <= strumenti.length ) {
			try {	
				((Accordabile) strumenti[i]).accorda();
			} catch (ClassCastException cce) {
				System.err.println("Lo strumento con indice " + i + " non è accordabile!");			
			} catch (IndexOutOfBoundsException ioobe) {
				System.err.println("L' indice " + i + " non è entro la lunghezza dell'array!");							
			} catch (Exception e) {
				System.err.println("Si è verificato un errore:");
				e.printStackTrace();
			}
			i++;
		}
	}

}
