//Ejercicio de los trenes


package com.ipartek.examen;

import java.util.Scanner;

import com.ipartek.examen.Tren;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Tren tren1 = new Tren();
		System.out.println("Escribe el tipo de tren: ");
		String tipo = scan.nextLine();
		tren1.setTipo(tipo);
		System.out.println("Escribe la referencia del tren: ");
		int referencia = scan.nextInt();
		tren1.setReferencia(referencia);
		System.out.println("Escribe la cantidad de asientos ocupados del tren: ");
		int asientosOcupados = scan.nextInt();
		tren1.setAsientosOcupados(asientosOcupados);
		System.out.println("Escribe el año del tren: ");
		int anios = scan.nextInt();
		tren1.setAniosActivo(anios);
		
		scan.close();
		
		System.out.println("Tipo de tren: " + tipo);
		System.out.println("Referencia: " + referencia);
		System.out.println("El tren dispone de " + asientosOcupados + " asientos ocupados.");
		System.out.println("El tren tiene " + anios + "años.");
		
		trenLLeno(asientosOcupados);
		demasiadoViejo(anios);

	}

	public static boolean trenLLeno(int asientosOcupados) {
		
		if(asientosOcupados > 400) {
			System.out.println("Se ha sobrepasado el aforo permitido.");
			return true;
			
		}else {
			
			System.out.println("Hay aforo disponible");
			return false;
		}
		

	}
	
	public static boolean demasiadoViejo(int anios) {
		if (anios > 40) {
			System.out.println("FUERA DE CIRCULACIÓN");
			return true;
		}
		else {
			System.out.println("EN CIRCULACIÓN");
			return false;
		}
		
	}

}
