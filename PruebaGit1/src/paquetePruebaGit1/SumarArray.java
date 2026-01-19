package paquetePruebaGit1;

public class SumarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {2,4,4};
		System.out.println("el resultado de la suma de el array es "+ sumarNumerosArray(array));
	}
	public static int sumarNumerosArray(int [] array) {
		int suma=0;
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		return suma;
	}
}
