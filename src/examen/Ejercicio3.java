//10 numeros en un array, mostrar los multiplos de 7 y mostrar la media aritmética

package com.ipartek.examen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero;
		int multiplo = 7;
		float media = 0.0f;
		int[] datos = null;
		
		DecimalFormat dformat = new DecimalFormat("##.##");
		Scanner escrito = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		numero = escrito.nextInt();
		for (int j = 0; j < datos.length; j++) {
			datos[j] = numero;
			media = media + datos[j];
			
			for (int i = 0; i < 7; i++) {
				System.out.println(esMultiplo(datos[j], multiplo));
				System.out.println(dformat(media));
			}
		}
		escrito.close();

	}
	
	private static char[] dformat(float media) {

		DecimalFormat dformat = new DecimalFormat("##.##");
		return null;

	}

	public static boolean esMultiplo(int numero, int multiplo) {
		if(numero%3==0) {
			return true;
		} else {
			return false;
		}
	}

}
