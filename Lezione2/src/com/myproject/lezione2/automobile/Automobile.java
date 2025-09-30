package com.myproject.lezione2.automobile;

public class Automobile {

	public int annoImmatricolazione;
	public int kilometriPercorsi;
	public String brand;
	public String modello;
	public String targa;
	public boolean isIncidentata;
	
	
//	public int annoImmatricolazione, kilometriPercorsi;
//	public String brand, modello, targa;
//	public boolean isIncidentata;
	
	
	//dichiarazione del costruttore di DEFAULT ( se non scrivo nessun costruttore 
	//Java ne scrive nascostamente uno vuoto nella classe quando viene compilata)
	public Automobile() {
		
	}
	
	public Automobile(String brand, String modello) {
		this.brand = brand;
		this.modello = modello;
	}
	
	public Automobile(int annoImmatricolazione, int kilometriPercorsi, boolean isIncidentata) {
		this.annoImmatricolazione = annoImmatricolazione;
		this.kilometriPercorsi = kilometriPercorsi;
		this.isIncidentata = isIncidentata;
	}

	public Automobile(
			int annoImmatricolazione, 
			int kilometriPercorsi, 
			String brand, 
			String modello, 
			String targa,
			boolean isIncidentata) {
		this.annoImmatricolazione = annoImmatricolazione;
		this.kilometriPercorsi = kilometriPercorsi;
		this.brand = brand;
		this.modello = modello;
		this.targa = targa;
		this.isIncidentata = isIncidentata;
	}
	
	public void stampaBrandEModello() {
		System.out.println(this.brand + " " + this.modello);
	}
}
