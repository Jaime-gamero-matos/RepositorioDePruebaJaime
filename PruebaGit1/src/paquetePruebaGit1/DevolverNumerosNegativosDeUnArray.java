package paquetePruebaGit1;

import java.util.Iterator;

public class DevolverNumerosNegativosDeUnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {3,4,5,1,2,-4,-2,-1};
		System.out.println("hay "+ contarNegativosArray(array)+ " numeros negativos en el array");
	}
	public static int contarNegativosArray(int [] array) {
		int contador=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]<0) {
				contador++;
			}
		}
		return contador;
	}
}
