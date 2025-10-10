package it.corso.ereditarieta.persona;

public class Impiegato extends Persona {
	private String azienda;
	private int salario;
	
	public Impiegato(String nome, String cognome) {
		super(nome, cognome);
	}
	
	public Impiegato(String nome, String cognome, String azienda, int salario) {
		this(nome, cognome);
		this.azienda = azienda;
		this.salario = salario;
	}

	public String getAzienda() {
		return azienda;
	}

	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Impiegato:\n"
				+ super.toString()
				+ "\n" + (this.azienda != null ? "Lavora per "+this.azienda : "Attualmente disoccupato") + "\n"
				+ "Salario mensile: " + (this.salario > 0 ? this.salario : 0) + "€";
	}
	
	
	@Override
	public void saluta() {
		System.out.println(
				"Sono " + this.getNome() + " "
						+ this.getCognome() + ", lavoro per " + (azienda != null ? azienda : "nessuno"));
	}
}
