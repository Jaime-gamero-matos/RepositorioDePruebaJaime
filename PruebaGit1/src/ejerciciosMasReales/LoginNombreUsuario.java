package ejerciciosMasReales;

public class LoginNombreUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreUsuario="manueeeeeee";
		resultadoLogeo(verificacionCondicionesNombreUsuario(nombreUsuario));
	}
	public static boolean verificacionCondicionesNombreUsuario(String nombreUsuario) {
		int contadorPalabras=0;
		int contadorEspacios=0;
		for (int i = 0; i < nombreUsuario.length(); i++) {
			contadorPalabras++;
			if (nombreUsuario.charAt(i)==' ' ) {
				contadorEspacios++;
			}
		}
		if (contadorPalabras>=5 && contadorPalabras<=15 && contadorEspacios==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void resultadoLogeo(boolean resultado) {
		if (resultado==true) {
			System.out.println("El logeo es valido");
		}else {
			System.out.println("El logeo es invalido");
		}
	}
}
