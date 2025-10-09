package it.corso.oggetti.automobile;

public class Auto {
	
	public static final int caratteriDellaTarga = 7;
	
	private String targa;
	private int numeroPorte;
	private boolean isAccesa;
	private float velocita;
	
	public Auto(String targa,int numeroPorte) {
		this.targa = targa;
		if(numeroPorte < 3 || numeroPorte >5) {
			System.out.println("Numero di porte non valido, verranno impostate di default a 3");
			numeroPorte = 3;
		}
		this.numeroPorte = numeroPorte;
	}
	
	public String getTarga() {
		return this.targa;
	}
	
	public void setTarga(String nuovaTarga) {
		if(isTargaValida(nuovaTarga)) {
			this.targa = nuovaTarga;
		}
	}
	
	private boolean isTargaValida(String nuovaTarga) {
		if(nuovaTarga.length() != caratteriDellaTarga) {
			System.out.println("lunghezza della targa diversa da 7");
			return false;
		}
		return true;
		//altri controlli
	}
	
	public int getNumeroPorte() {
		return this.numeroPorte;
	}
	
	public void accendi() {
		if(this.isAccesa) {
			System.out.println("L'auto era già accesa.");
		} else {
			this.isAccesa = true;
			System.out.println("Ho acceso l'auto.");
		}
	}
	
	public void spegni() {
		if(!this.isAccesa) {
			System.out.println("L'auto era già spenta.");
		} else {
			this.isAccesa = false;
			System.out.println("Ho spento l'auto.");
		}
	}
	
	public boolean isAccesa() {
		return this.isAccesa;
	}
	
	public void accelera(float incremento) {
		this.velocita += validaIncrementoDiVelocita(incremento);
	}
	
	public void decelera(float decremento) {
		this.velocita -= validaDecrementoDiVelocita(decremento);		
	}
	
	private float validaIncrementoDiVelocita(float inc) {
		inc = valoreAssoluto(inc);
		if(this.velocita + inc > 200f) {
			System.out.println("Velocità troppo alta, la fisso al massimo");
			inc = 200f - this.velocita;
		}
		return inc;		
	}
	
	private float validaDecrementoDiVelocita(float dec) {
		dec = valoreAssoluto(dec);
		if(this.velocita - dec < -30f) {
			System.out.println("Velocità troppo alta, la fisso al massimo");
			dec = this.velocita + 30f;
		}
		return dec;		
	}
	
	private float valoreAssoluto(float val) {
		if(val == 0) {
			System.out.println("Non c'è incremento di velocità");
		}
		if(val < 0) {
			System.out.println("L'incremento è negativo, lo moltiplico per -1 per farlo diventare positivo");
			val = -1 * val;
		}
		return val;
	}
	
	public void arresta() {
		this.velocita = 0f;
	}
	
	public float getVelocita() {
		return this.velocita;
	}
	
	public boolean isFerma() {
		return this.velocita == 0;
	}
	
	@Override
	public String toString() {
		String result = "Automobile con le seguenti proprietà:\n"
				+ "- targa: " + this.targa + "\n"
				+ "- numero di porte: " + this.numeroPorte + "\n"
				+ "- stato: " + (this.isAccesa ? "accesa" : "spenta") + "\n"
				+ "- velocità attuale: " + this.velocita + "km/h\n";
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!this.getClass().equals(other.getClass())) {
			return false;
		}
		return this.targa.equals(((Auto) other).getTarga());
	}
	
}
