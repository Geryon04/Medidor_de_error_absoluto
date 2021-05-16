package main;

import java.util.List;

public class valorPromedio implements IPromedio {

	@Override
	public double calculoPromedio(List<Double> mediciones) {
		double suma = 0;
		double resultado = suma / mediciones.size();
		for(double valor : mediciones) {
			suma += valor;
		}
		return resultado;
	}

}
