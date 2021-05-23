package main;

import java.util.List;

public class medicionMayorADiez extends valorPromedio implements IErrorAbsoluto {
	
	private double promedio;
	private List<Double> medicion;
	
	public medicionMayorADiez(List<Double> medicion) {
		this.medicion = medicion;
		promedio = calculoPromedio(medicion);
	}

	@Override
	public double calculoDeError(double promedio) {
		double longitud = medicion.size();
		double valor = 0;
		double resultado = Math.pow(valor / longitud, 2);
		for(double instancia : medicion) {
			valor += Math.pow(promedio - instancia, 2);
		}
		return resultado;
	}

	public double getPromedio() {
		return promedio;
	}

	public List<Double> getMedicion() {
		return medicion;
	}

	@Override
	public String expresion() {
		return "El resultado es " + getPromedio() + "+- " + calculoDeError(getPromedio());
	}

}
