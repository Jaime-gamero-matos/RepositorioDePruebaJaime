package paquetePruebaGit1;

public class ContarVocalesDeUnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="hOlaa";
		System.out.println(contarVocalesString(palabra));
	}
	public static int contarVocalesString(String cadena) {
		int contadorVocales=0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)=='a' || cadena.charAt(i)=='A' ||cadena.charAt(i)=='e' || cadena.charAt(i)=='E' || cadena.charAt(i)=='i' ||cadena.charAt(i)=='I' || cadena.charAt(i)=='o' || cadena.charAt(i)=='O' || cadena.charAt(i)=='u' ||cadena.charAt(i)=='U') {
				contadorVocales++;
			}
		}
		return contadorVocales;
	}
}
