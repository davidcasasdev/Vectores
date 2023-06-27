package funciones;

import java.util.Scanner;

public class FuncionesVectores {

	
	public static int[] pedirVector(int num) {
		int[] vector = new int[num];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=teclado.nextInt();
		}
		return vector;
	}
	
	public static int[] pedirVector() {
		return pedirVector(10);
	}
	
	/* no se puede sobrecargar si sólo cambia en el parametro de devolución
	public static double[] pedirVectorDouble(int num) {
		double[] vector = new double[num];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=teclado.nextDouble();
		}
		return vector;
	}*/
	
	public static void pedirVector(int [] vector) {
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=teclado.nextInt();
		}
	}
	public static void pedirVector(double[] vector) {
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=teclado.nextDouble();
		}
		
	}
	
	public static void mostrarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%d ",vector[i]);
		}
		System.out.println();
	}
	
	public static void mostrarVector(double vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%.2f ",vector[i]);
		}
		System.out.println();
	}
	
	
	public static int cuentaPositivos(int vector[]) {
		int contador=0;
		for (int i=0;i<vector.length;i++) {
			if (vector[i]>0) contador++;
		}
		return contador;
	}

	/**
	 * Función que calcula la media de los elementos de un vector
	 * @param vector double[] con los datos cuya media se quiere calcular
	 * @return double con la media de los elementos del vector
	 */
	public static double media(double[] vector) {
		double suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma = suma+vector[i];
		}
		return suma/vector.length;
	}

	public static void mostrarMenoresQue(int[] vector, int a) {
		for (int i = 0; i < vector.length; i++) {
			if(vector[i]<a) {
				System.out.printf("%d ",vector[i]);
			}
		}
	}

	public static void mostrarEnIntervalo(int[] vector, int a, int b) {
		for (int i = 0; i < vector.length; i++) {
			if(vector[i]>=Math.min(a,b) && vector[i]<Math.max(a,b)) {
				System.out.printf("%d ",vector[i]);
			}
		}
		
	}

	public static void rotarIzq(int[] vector) {
		int aux=vector[0];
		
//		for (int i=0; i<vector.length-1;i++) {
//			vector[i]=vector[i+1];
//		}
		for (int i=1; i<vector.length;i++) {
			vector[i-1]=vector[i];
		}
		vector[vector.length-1]=aux;
	}

	public static void rotarIzq(int[] vector, int veces) {
		for (int i=0;i<veces;i++) {
			rotarIzq(vector);
		}
	}

	public static void rotarDcha(int [] vector) {
		int aux=vector[vector.length-1];
		for (int i=vector.length-1;i>0;i--) {
			vector[i]=vector[i-1];
		}
		vector[0]=aux;
	}

	
}
