package main;

import java.util.List;

public class valorPromedio implements IPromedio {

	//calcula el promedio de todos los valores dados como parametro
	@Override
	public float calculoPromedio(List<Float> mediciones) {
		float suma = 0;
		float longitud = mediciones.size();
		float resultado = suma / longitud;
		for(float valor : mediciones) {
			suma = suma + valor;
		}
		return resultado;
	}

}
