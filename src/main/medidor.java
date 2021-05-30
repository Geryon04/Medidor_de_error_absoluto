package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class medidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese las instancias o oprima 0 para terminar");
		List<Double> listado = new ArrayList<Double>();
		double instancia = entrada.nextDouble();
		
		
		while(instancia != 0) {
			listado.add(instancia);
			System.out.println("ingrese otra instancia o 0 para terminar");
			instancia = entrada.nextDouble();
		}
		
		if(listado.size() == 1) {		 
			 System.out.println("ingrese la resolucion de la herramienta");
			 Double resolucion = entrada.nextDouble();
			 unicaMedicion unico = new unicaMedicion(listado , resolucion);
			 unico.expresion();
		}
		else if(listado.size() < 10 && listado.size() > 1) {
			medicionMenorADiez menorADiez = new medicionMenorADiez(listado);
			menorADiez.expresion();
		}
		else {
			medicionMayorADiez mayorADiez = new medicionMayorADiez(listado);
			mayorADiez.expresion();
		}
		 
			
		
		 

	}

}
