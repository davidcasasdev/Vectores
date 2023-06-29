package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio11 {

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
		
		int[] vSuma= FuncionesVectores.suma(vector1, vector2);
		System.out.println("El vector suma es ");
		FuncionesVectores.mostrarVector(vSuma);
		
	}

}
