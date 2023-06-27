package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

/**
 * 3. Dado un array de reales del tamaño N, visualizar por 
 * pantalla todos los elementos del mismo cuyo valor pertenezca 
 * al intervalo [a,b). 
 * @author David
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Cuantos elementos quieres?");
		int num=teclado.nextInt();
		
		System.out.printf("Introduce el vector");
		int vector[] = new int[num];
		FuncionesVectores.pedirVector(vector);
		
		System.out.printf("Introduce valor inferior: ");
		int a = teclado.nextInt();
		
		System.out.printf("Introduce valor superior: ");
		int b = teclado.nextInt();
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(vector);
		
		System.out.println("Los numeros menores que "+a+ " son");
		FuncionesVectores.mostrarEnIntervalo(vector,a,b);
		

	}

}
