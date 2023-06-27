package funciones;

import java.util.Iterator;
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

	public static void mostrarDesde(int vector[], int num) {
//		int pos=-1;
//		for (int i = 0; i < vector.length && pos==-1; i++) {
//			if (vector[i]==num) {
//				pos=i;
//			}
//		}
		for ( int i=encuentraValor(vector,num); i<vector.length;i++) {
			System.out.printf("%d ",vector[i]);
		}
	}
	
	public static int encuentraValor(int vector[], int num) {
		int pos=vector.length;
		for (int i = 0; i < vector.length && pos==vector.length; i++) {
			if (vector[i]==num) {
				pos=i;
			}
		}
		return pos;
	}
	
	/**
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static boolean sonParalelos( int v1[], int v2[]) {
		
		double factor =v1[0]/(double)v2[0];
			
		boolean paralelos=true;
		if (v1.length!=v2.length) {
			return false;
		}
		for (int i=0; i<v1.length && Double.isNaN(factor); i++) {
			factor=v1[i]/(double)v2[i];
		}
		if (Double.isNaN(factor)) return true;
		
		for (int i = 1; i < v1.length && paralelos; i++) {
			if (v1[i]/(double)v2[i]!=factor && 
					!Double.isNaN(v1[i]/(double)v2[i])) {
				paralelos=false;
			}
		}
		return paralelos;
	}
	
	
	public static boolean esCapicua(int vector[]) {
		boolean capicua=true;
//		for (int i = 0; i < vector.length/2 && capicua; i++) {
//			if (vector[i]!=vector[vector.length-1-i]) {
//				capicua=false;
//			}
//		}
		for (int i=0, j=vector.length-1 ; i<j && capicua; i++, j--) {
			if (vector[i]!=vector[j]) {
				capicua=false;
			}
		}

		return capicua;
		
	}
	
	public static int[] inversa(int vector[]) {
		int inv[] = new int[vector.length];
		
		for (int i=0, j=vector.length-1 ; i<vector.length; i++, j--) {
			inv[j]=vector[i];
		}
		return inv;
	}

	public static int[] concatenar(int[] vector1, int[] vector2) {
		int res[] = new int[vector1.length+vector2.length];
		
		for ( int i= 0; i < vector1.length; i++) {
			res[i]=vector1[i];
		}
		for (int i = 0; i < vector2.length; i++) {
			res[i+vector1.length]=vector2[i];
		}
		
		
		return res;
	}

	public static int[] sumar(int[] vector1, int[] vector2) {
		if (vector1.length!=vector2.length) {
			return null;
		}
		int res [] = new int[vector1.length];
		for (int i = 0; i < res.length; i++) {
			res[i]=vector1[i]+vector2[i];
		}
		return res;
	}

	
	
}
