//Campeonato de automovilismo

package com.ipartek.examen;

import java.util.Scanner;

public class Ejericio2 {

	public static void main(String[] args) {
		int puntos;
		Scanner sc = new Scanner(System.in);
		boolean ganador = false;

		System.out.println("¿Cuántos puntos has obtenido?");
		puntos = sc.nextInt();

		ganadorCampeonato(puntos, ganador);
		sc.close();
	}

	public static void ganadorCampeonato(int puntos, boolean ganador) {
		if (puntos >= 70) {
			ganador = true;
			System.out.println("Puedes ganar el campeonato.");
		} else {
			// if(puntos < 70) {
			// ganador = false;
			System.out.println("Ponte las pilas si quieres ganar!");
		}
	}
}

//}
