package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

/**
 * 4. Dado un array de enteros de tamaño N, rotar sus valores una 
 * posición a la derecha, es decir, si tenemos un array como el 
 * siguiente: 
 * 5 -1 -3 15 4
 * el resultado deberá ser el array rotado a la derecha: 
 * 5 -1 -3 15 4.
 * @author David
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Cuantos elementos quieres?");
		int num=teclado.nextInt();
		
		System.out.printf("Introduce el vector");
		int vector[] = new int[num];
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(vector);
		
		System.out.println("Rotando vector a la derecha....");
		FuncionesVectores.rotarDcha(vector);
		
		System.out.println("Tu vector rotado es ");
		FuncionesVectores.mostrarVector(vector);
  
	}

}
