package it.prova.ereditarieta.veicolo;

import it.prova.ereditarieta.veicolo.abstr.Veicolo;
import it.prova.ereditarieta.veicolo.interfaccia.Galleggiante;
import it.prova.ereditarieta.veicolo.interfaccia.Volante;

public class Acquaplano extends Veicolo implements Volante,Galleggiante {

	@Override
	public void saliDiQuota() {
		System.out.println("L'acquaplano sale di altitudine");

	}

	@Override
	public void scendiDiQuota() {
		System.out.println("L'acquaplano scende di altitudine");

	}

	@Override
	public void accelera(float incremento) {
		System.out.println("L'acquaplano aumenta la sua velocità di " + incremento + "km/h.");
	}

}
