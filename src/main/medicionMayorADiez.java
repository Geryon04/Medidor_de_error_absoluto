package main;

import java.util.List;

public class medicionMayorADiez  implements IErrorAbsoluto {
	
	private float promedio;
	private List<Float> medicion;
	
	public medicionMayorADiez(List<Float> medicion , float promedio) {
		this.medicion = medicion;
		this.promedio = promedio;
	}

	//funcion de calculo de incertidumbre o error absoluto
	@Override
	public float calculoDeError(float promedio) {
		float longitud = medicion.size();
		float valor = 0;
		float resultado = (float) Math.pow(valor / longitud, 2);
		for(float instancia : medicion) {
			valor += Math.pow(promedio - instancia, 2);
		}
		return resultado;
	}

	//expresion del resultado de la medicion
	@Override
	public String expresion() {
		return "El resultado es " + this.promedio + "+- " + calculoDeError(this.promedio);
	}

}
