package ejercicio;

import java.util.Scanner;

/**
 * @author Enrique
 *
 */
public class ejer01 {

	static int[] vector = new int[5];
	
	public static void main(String[] args) {
		// TODO - leer 5 numeros enteros y almacenarlos en un arreglo
		// TODO - presentar en pantalla los 5 numeros en el orden ingresado y en orden inverso
		// TODO - presentar en pantalla los numeros mayores a 50

		System.out.println("Ingrese numeros");
		lectura();
		System.out.println("Numeros ingresados");
		muestra();
		System.out.println("Numeros al reves");
		muestraReves();
		System.out.println("Numeros mayores");
		muestraMayores();
	}
	
	private static void lectura() {
		Scanner teclado = new Scanner(System.in);
		int ptr;
		for (ptr=0; ptr < 5; ptr++)
		{
			vector[ptr] = teclado.nextInt();
		}
		teclado.close();
	}
	
	private static void muestra() {
		for(int ptr=0; ptr<5; ptr++)
			System.out.println(vector[ptr]);
	}

	private static void muestraReves() {
		for(int ptr=4; ptr>=0; ptr--)
			System.out.println(vector[ptr]);
	}

	private static void muestraMayores() {
		for(int ptr=0; ptr<5; ptr++)
			if (vector[ptr] > 50)
				System.out.println(vector[ptr]);
	}
	
}
