package funciones;

import java.util.Scanner;

/**
 * 11. Dados dos vectores, calcular la suma de ambos. 
 * [1, 4, -3]
 * [2 ,0, -1]
 * [3, 4 -4]
 * @author David
 *
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Cuantos elementos quieres?");
		int num=teclado.nextInt();
		
		System.out.printf("Introduce el vector 1");
		int vector1[] = new int[num];
		FuncionesVectores.pedirVector(vector1);

		System.out.printf("Cuantos elementos quieres para el segundo?");
		int num2=teclado.nextInt();
		System.out.printf("Introduce el vector 2");
		int vector2[] = new int[num2];
		FuncionesVectores.pedirVector(vector2);
		
		System.out.println("El vector 1 es ");
		FuncionesVectores.mostrarVector(vector1);
		System.out.println("El vector 2 es ");
		FuncionesVectores.mostrarVector(vector2);
		
		int resultado [] = FuncionesVectores.sumar(vector1,vector2);
		
		if (resultado==null) {
			System.out.println("No se pueden sumar");
			System.exit(0);
		}
		System.out.println("Tu vector sumado es");			
		FuncionesVectores.mostrarVector(resultado);

	}

}
