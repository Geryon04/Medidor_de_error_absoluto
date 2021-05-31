package main;

import java.util.List;

public class valorPromedio implements IPromedio {
	
	private List<Float> mediciones;
	
	public valorPromedio(List<Float> mediciones) {
		this.mediciones = mediciones;
	}

	//calcula el promedio de todos los valores dados como parametro
	@Override
	public float calculoPromedio() {
		float suma = 0;
		float longitud = mediciones.size();
		float resultado = 0;
		for(float valor : mediciones) {
			suma = suma + valor;
			resultado = suma / longitud;
		}
		return resultado;
	}

}
