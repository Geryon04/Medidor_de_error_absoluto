package main;

import java.util.List;

public class medicionMenorADiez  implements IErrorAbsoluto{
	
	private float promedio;
	private List<Float> medicion;
	
	public medicionMenorADiez(List<Float> medicion, float promedio) {
		this.medicion = medicion;
		this.promedio = promedio;
	}

	@Override
	public float calculoDeError(float promedio) {
		float maximo = 0;
		float valor = 0;
		for(float instancia : medicion) {
			valor = promedio - instancia;
			if(maximo < valor) {
				maximo = valor;
			}
		}
		return maximo;
	}


	@Override
	public String expresion() {
		return "El resultado es " + this.promedio + "+- " + this.calculoDeError(this.promedio);
	}

}
