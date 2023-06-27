package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

/**
 * 8. Dado un array de enteros de tamaño N, decir si es 
 * capicúa o no, es decir, si por ejemplo el array es:
 *  5 2 1 2 5
 *  el resultado debe ser “verdad”(se debe tener en cuenta 
 *  que el tamaño el array puede ser par o impar).
 * @author David
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Cuantos elementos quieres?");
		int num=teclado.nextInt();
		
		System.out.printf("Introduce el vector 1");
		int vector1[] = new int[num];
		FuncionesVectores.pedirVector(vector1);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(vector1);
		
		if (FuncionesVectores.esCapicua(vector1)) {
			System.out.println("El vector es capicua");
		} else {
			System.out.println("El vector NO es capicua");
		}

	}

}
