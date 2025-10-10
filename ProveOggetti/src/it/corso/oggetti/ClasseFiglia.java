package it.corso.oggetti;

public class ClasseFiglia extends ClassePadre{
	
	private int propFiglia;
	
	public ClasseFiglia() {
		super();
	}
	
	public ClasseFiglia(String propPadre) {
		super(propPadre);
	}

	public ClasseFiglia(int propFiglia) {
		super();
		this.propFiglia = propFiglia;
	}
	
	public ClasseFiglia(int propFiglia, String propPadre) {
		super(propPadre);
		this.propFiglia = propFiglia;
	}

	public int getPropFiglia() {
		return propFiglia;
	}

	public void setPropFiglia(int propFiglia) {
		this.propFiglia = propFiglia;
	}
	
	@Override
	public void test() {
		super.test();
		System.out.println("Questo è un test della classe figlia.");
	}
}
