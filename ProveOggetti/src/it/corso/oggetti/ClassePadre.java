package it.corso.oggetti;

//dichiarazione di classe
public class ClassePadre {
	
	//proprietà istanza della classe
	private String propPadre;
	
	
	//costruttore vuoto esplicito
	public ClassePadre() {
		
	}
	
	//costruttore completo
	public ClassePadre(String propPadre) {
		this.propPadre = propPadre;
	}

	//getter di propPadre
	public String getPropPadre() {
		return propPadre;
	}

	//setter di propPadre
	public void setPropPadre(String propPadre) {
		this.propPadre = propPadre;
	}
	
	public void test() {
		System.out.println("Test di classe padre.");
	}

}
