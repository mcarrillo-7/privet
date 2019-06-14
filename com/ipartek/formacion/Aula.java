package com.ipartek.formacion;

public class Aula {

	public static void main(String[] args) {

		// declarar array con nombre alumnos

		String[] Alumnos = { "Mounir", "Andoni", "Asier", "JonC", 
							"Arkaitz", "Aritz", "Manuel", "Eduardo", 
							"Eder I", "Eder S", "Gaizka", "Borja", 
							  "Verónica", "Jon A", "José Luis"};

		// generar numero aleatorio

		int numero = (int) (Math.random() * Alumnos.length);

		System.out.println("Voluntario " + Alumnos[numero]);

		// mostrar voluntario para leer

		for (int i = 0; i < Alumnos.length; i++) {

			if (numero == i) {// Si el numero es igual que el numero del array

				System.out.println(i + " " + Alumnos[i]);

			} else {

				System.out.println("---" + Alumnos[i]);
			}

		} // end for
	}

}
