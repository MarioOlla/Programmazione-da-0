package it.corso.oggetti;

public class App {

	public static void main(String[] args) {
		
		ClassePadre padre = new ClassePadre();
		padre = new ClasseFiglia(13,"lallero");
		
		
//		System.out.println("Ho istanziato classe padre e classe figlia.");
		
		((ClasseFiglia)padre).getPropFiglia();
	}

}
