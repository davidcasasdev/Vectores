package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

/**
 * 2. Dado un array de enteros de tamaño N, visualizar por
 *  pantalla todos los elementos del mismo cuyo valor sea menor 
 *  que un número A. 
 *  [ 3, -5, 7, 8, 2]
 *  4
 *  3 -5 2
 * @author David
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Cuantos elementos queires?");
		int num=teclado.nextInt();
		
		System.out.printf("Introduce el vector");
		int vector[] = new int[num];
		FuncionesVectores.pedirVector(vector);
		
		System.out.printf("Introduce un número: ");
		int a = teclado.nextInt();
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(vector);
		
		System.out.println("Los numeros menores que "+a+ " son");
		FuncionesVectores.mostrarMenoresQue(vector,a);
		
		
		

	}

}
