package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

/**
 * 9. Dado un array de enteros de tamaño N, copiarlo a otro array de 
 * igual tamaño pero de forma inversa, es decir, si por ejemplo el array
 * de entrada es: 
 * 5 -1 -3 15 4
 * el resultado debe ser un nuevo array cuyos valores son: 
 * 4 15 -3 -1 5.
 * @author David
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Cuantos elementos quieres?");
		int num=teclado.nextInt();
		
		System.out.printf("Introduce el vector 1");
		int vector1[] = new int[num];
		FuncionesVectores.pedirVector(vector1);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(vector1);
		
		int resultado [] = FuncionesVectores.inversa(vector1);
		
		System.out.println("Tu vector invertido es ");
		FuncionesVectores.mostrarVector(resultado);

	}

}
