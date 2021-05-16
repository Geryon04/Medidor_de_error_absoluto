package main;

import java.util.List;

public class unicaMedicion extends valorPromedio implements IErrorAbsoluto{
	
	private List<Double> medicion;
	private double resolucion;
	private double promedio;
	
	public unicaMedicion(List<Double> medicion, double resolucion) {
		this.medicion = medicion;
		this.resolucion = resolucion;
		promedio = calculoPromedio(medicion);		
	}	
	
	@Override
	public double calculoDeError(double promedio) {
		setResolucion(promedio);
		return getResolucion();
	}

	@Override
	public String expresion() {
		return "El resultado es " + getPromedio() + "+- " + calculoDeError(getPromedio());
	}


	public double getPromedio() {
	return promedio;
	}


	public List<Double> getMedicion() {
		return medicion;
	}
	

	public void setMedicion(List<Double> medicion) {
		this.medicion = medicion;
	}


	public double getResolucion() {
		return resolucion;
	}


	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	
}
