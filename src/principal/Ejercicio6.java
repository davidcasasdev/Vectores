package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

/**
 * 6. Dado un array de enteros de tamaño N, se debe buscar 
 * el primer elemento del array mayor que un número A, y a 
 * partir de él inclusive, visualizar todos los valores de 
 * los siguientes hasta el último elemento del array.
 * 
 * [1,8,5,7,2,3,4]
 * 7
 * 7 2 3 4 
 * 
 * 9
 * 
 * @author David
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Cuantos elementos quieres?");
		int num=teclado.nextInt();
		
		System.out.printf("Introduce el vector");
		int vector[] = new int[num];
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(vector);
		
		System.out.printf("Introduce un número:" );
		int valor = teclado.nextInt();
		
		System.out.println("El vector desde el valor "+valor+ " es ");
		FuncionesVectores.mostrarDesde(vector, valor);
		

	}

}
