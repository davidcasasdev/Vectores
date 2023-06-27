package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

/**
 * 1. Rellenar un array de tamaño N con valores enteros 
 * dados por el usuario a través del teclado. 
 * @author David
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num=0;
		do {
			System.out.println("Cuantos elementos quieres (debe ser mayor que 0)?");
			num = teclado.nextInt();
		} while (num<=0);
		
		int numeros[] = new int[num];
		System.out.println("Introduce el vector:");
		FuncionesVectores.pedirVector(numeros);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(numeros);
	}
}
