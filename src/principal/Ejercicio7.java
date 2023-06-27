package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

/**
 * 7. Dados dos arrays de reales de tamaño N, suponiendo 
 *  que modelan dos vectores de un espacio N-dimensional, 
 *  decir si son paralelos o no. Son paralelos si todos 
 *  sus valores son proporcionales
 *  
 *  [2, 6, -8]
 *  [1, 3, -4]
 *  2/1=6/3=-8/-4=2
 * @author David
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Cuantos elementos quieres?");
		int num=teclado.nextInt();
		
		System.out.printf("Introduce el vector 1");
		int vector1[] = new int[num];
		FuncionesVectores.pedirVector(vector1);

		
		System.out.printf("Introduce el vector 2");
		int vector2[] = new int[num];
		FuncionesVectores.pedirVector(vector2);
		
		System.out.println("El vector 1 es ");
		FuncionesVectores.mostrarVector(vector1);
		System.out.println("El vector 2 es ");
		FuncionesVectores.mostrarVector(vector2);
		
		if (FuncionesVectores.sonParalelos(vector1, vector2)) {
			System.out.println("Los vectores son paralelos");
		} else {
			System.out.println("Los vectores NO son paralelos");
		}

	}

}
