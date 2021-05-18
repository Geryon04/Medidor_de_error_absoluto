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
		
		return 0;
	}

	@Override
	public String expresion() {
		// TODO Auto-generated method stub
		return null;
	}

}
