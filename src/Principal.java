import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		int vidas = 7;
		int contador = 0;
		boolean booleana = true;
		char[] letras = { 'v', 'i', 'e', 'r', 'n', 'e', 's' };
		char[] espacios = {'_', '_','_', '_','_', '_','_'};
		int tamanio = letras.length;
		char[] respuesta = new char[tamanio];
		System.out.println(respuesta);
		Scanner escaner = new Scanner(System.in);

		System.out.println("------------------------");
		System.out.println("-                      -");
		System.out.println("-                      -");
		System.out.println("-                      o");
		System.out.println("-                      -");
		System.out.println("-                      -");
		System.out.println("-                   --------");
		System.out.println("-                      -");
		System.out.println("-                      -");
		System.out.println("-                      -");
		System.out.println("-                     - -");
		System.out.println("-                    -   -");
		System.out.println("-------             -     -");

		System.out.println("Vidas: " + vidas);
		System.out.println("Escriba una letra: ");
		char letra = escaner.next().charAt(0);

		System.out.println("_ _ _ _ _ _ _");

		for (int i = 0; i <= letras.length; i++) {

			if (letra == letras[i]) {
				System.out.println("Escriba una letra: ");
				letra = escaner.next().charAt(0);
				System.out.println(letras[i] + " _ _ _ _ _ _");
				espacios[i] = letra;
				System.out.println(espacios);

			}
			
			while (letra != letras[i]) {
				
				System.out.println("Fallaste!");
				vidas--;
				System.out.println("Vidas: " + vidas);

			} 

			
				if (vidas == 0) {
					System.out.println("Game over!");
					escaner.close();
				} if(espacios == respuesta) {
					System.out.println("Bien hecho");
				}

			
		}
	}

}
