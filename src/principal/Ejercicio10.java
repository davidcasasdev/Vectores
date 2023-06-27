package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

/**
 * 10. Dados dos array de enteros de tamaños N y M respectivamente,
 *  concatenarlos en un nuevo array de tamaño N+M, es decir si los 
 *  arrays de entrada son por ejemplo: 
 *  5 -1 -3 15 4 
 *  y 
 *  3 4 2
	el array concatenado resultado deberá ser: 
	5 -1 -3 15 4 3 4 2.
 * @author David
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Cuantos elementos quieres?");
		int num=teclado.nextInt();
		
		System.out.printf("Introduce el vector 1");
		int vector1[] = new int[num];
		FuncionesVectores.pedirVector(vector1);

		System.out.printf("Cuantos elementos quieres para el vector2 ?");
		int num2=teclado.nextInt();
		System.out.printf("Introduce el vector 2");
		int vector2[] = new int[num2];
		FuncionesVectores.pedirVector(vector2);
		
		System.out.println("El vector 1 es ");
		FuncionesVectores.mostrarVector(vector1);
		System.out.println("El vector 2 es ");
		FuncionesVectores.mostrarVector(vector2);
		
		int resultado [] = FuncionesVectores.concatenar(vector1,vector2);
		
		System.out.println("Tu vector concatenado es");
		FuncionesVectores.mostrarVector(resultado);

	}

}
