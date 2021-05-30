package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class medidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese las instancias o oprima 0 para terminar");
		List<Float> listado = new ArrayList<Float>();
		valorPromedio valorP = new valorPromedio();
		float promedioTotal = valorP.calculoPromedio(listado);
		Float instancia = entrada.nextFloat();
		
		
		while(instancia != 0) {			
			listado.add(instancia);
			System.out.println("ingrese otra instancia o 0 para terminar");
			instancia = entrada.nextFloat();
		}
		
		
		
		if(listado.size() == 1) {		 
			 System.out.println("ingrese la resolucion de la herramienta");
			 Float resolucion = entrada.nextFloat();
			 unicaMedicion unico = new unicaMedicion(promedioTotal , resolucion);
			 unico.calculoDeError(promedioTotal);
			 System.out.println(unico.expresion());
		}
		else if(listado.size() < 10 && listado.size() > 1) {
			medicionMenorADiez menorADiez = new medicionMenorADiez(listado, promedioTotal);
			menorADiez.calculoDeError(promedioTotal);
			System.out.println(menorADiez.expresion());
		}
		else {
			medicionMayorADiez mayorADiez = new medicionMayorADiez(listado, promedioTotal);
			mayorADiez.calculoDeError(promedioTotal);
			System.out.println(mayorADiez.expresion());
		}
		 
			
		
		 

	}

}
