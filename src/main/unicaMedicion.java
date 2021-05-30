package main;


public class unicaMedicion implements IErrorAbsoluto{
	
	private float resolucion;
	private float promedio;
	
	public unicaMedicion(float promedio, float resolucion) {
		this.promedio = promedio;
		this.resolucion = resolucion;
	}	
	
	@Override
	public float calculoDeError(float promedio) {		
		return resolucion;
	}

	@Override
	public String expresion() {
		return "El resultado es " + this.promedio + "+- " + this.calculoDeError(resolucion);
	}

	
}
