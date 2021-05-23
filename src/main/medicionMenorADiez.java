package main;

import java.util.List;

public class medicionMenorADiez extends valorPromedio implements IErrorAbsoluto{
	
	private double promedio;
	private List<Double> medicion;
	
	public medicionMenorADiez(List<Double> medicion) {
		this.medicion = medicion;
		promedio = calculoPromedio(medicion);
	}

	@Override
	public double calculoDeError(double promedio) {
		double maximo = 0;
		double valor = 0;
		for(double instancia : medicion) {
			valor = promedio - instancia;
			if(maximo < valor) {
				maximo = valor;
			}
		}
		return maximo;
	}

	public double getPromedio() {
		return promedio;
	}

	public List<Double> getMedicion() {
		return medicion;
	}

	@Override
	public String expresion() {
		// TODO Auto-generated method stub
		return null;
	}

}
