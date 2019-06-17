//Ejercicio de los boxeadores
package com.ipartek.examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		String nombreBoxeador;
		int edadBoeador;
		float alturaBoxeador;
		int pesoBoxeador;
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Introduzca el nombre del boxeador: ");
		nombreBoxeador = scan.next();
		System.out.println("Introduzca la edad de dicho boxeador: ");
		edadBoeador = scan.nextInt();
		System.out.println("Introduzca la altura del boxeador: ");
		alturaBoxeador = scan.nextFloat();
		System.out.println("Introduzca el peso del boxeador: ");
		pesoBoxeador = scan.nextInt();
		
		System.out.println("Nombre: " + nombreBoxeador);
		System.out.println("Edad: " + edadBoeador);
		System.out.println("Altura: " + alturaBoxeador);
		System.out.println("Peso: " + pesoBoxeador);
		
		if(pesoBoxeador > 90 ) {
			System.out.println("Este boeador corresponde a la categoría PESO PESADO debido a su peso.");
		} if (pesoBoxeador >= 65 && pesoBoxeador <= 90) {
			System.out.println("Este boeador corresponde a la categoría PESO MEDIANO debido a su peso.");
		} if (pesoBoxeador >= 58 && pesoBoxeador <= 64) {
			System.out.println("Este boeador corresponde a la categoría PESO LIGERO debido a su peso.");
		} if(pesoBoxeador >= 57 && pesoBoxeador <= 52) {
			System.out.println("Este boeador corresponde a la categoría PESO PLUMA debido a su peso.");
		} if(pesoBoxeador < 52) {
			System.out.println("Este boeador corresponde a la categoría PESO MOSCA debido a su peso.");
		}
		
		scan.close();
		
	}

}
