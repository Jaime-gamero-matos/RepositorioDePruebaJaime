package paquetePruebaGit1;

public class ContarNumerosParesDeLaCuentaDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=26;
		System.out.println("los pares que hay en el numero "+numero+ " son un total de "+contarParesDeUnaCuenta(numero));
	}
	public static int contarParesDeUnaCuenta(int numero) {
		int contador=0;
		if (verificarSiEsPositivo(numero)==true) {
			for (int i = 1; i < numero+1; i++) {
				if (i%2==0) {
					contador++;
				}
			}
		}
		return contador;
	}
	public static boolean verificarSiEsPositivo(int numero) {
		if (numero>0) {
			return true;
		}else {
			return false;
		}
	}

}
	 
