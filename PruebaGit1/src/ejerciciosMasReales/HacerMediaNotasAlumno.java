package ejerciciosMasReales;

import java.util.Arrays;
import java.util.Scanner;

public class HacerMediaNotasAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static double hacerMediaDeUn
	
	public static double operacionMediaNotasAlumno(int [] notasAlumno) {
		int sumaArray=0;
		double media=0;
		for (int i = 0; i < notasAlumno.length; i++) {
			sumaArray=sumaArray+notasAlumno[i];
		}
		media=sumaArray/notasAlumno.length;
		return media;
	}
	public static int [] recibirArrayDeNotas(int [] arrayDeNotas) {
		Scanner leer=new Scanner(System.in);
		int contador=0;
		boolean bandera=false;
		while (bandera==false) {
			System.out.println("dame una nota de un examen");
			arrayDeNotas[contador]= leer.nextInt();
			if (arrayDeNotas[contador]<0 || arrayDeNotas[contador]>10) {
				System.out.println("nota fuera de los valores esperados");
			}else {
				contador++;
			}
			if (contador==arrayDeNotas.length) {
				bandera=true;
			}
		}
		leer.close();
		return arrayDeNotas;
	}
}
