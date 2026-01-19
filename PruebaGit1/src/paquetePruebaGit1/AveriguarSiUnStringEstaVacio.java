package paquetePruebaGit1;

public class AveriguarSiUnStringEstaVacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String holaMundo="";
		boolean comprobacionContenidoString= checkContenidoString(holaMundo);
		mostrarResultadoComprobacionString(comprobacionContenidoString);
	}
	public static boolean checkContenidoString(String cadenaCaracteres) {
		if (cadenaCaracteres.equals("")) {
			return false;
		}else {
			return true;
		}
	}
	public static void mostrarResultadoComprobacionString(boolean comprobacion) {
		if (comprobacion==true) {
			System.out.println("el string tiene contenido");
		}else {
			System.out.println("el string esta vacio");
		}
	}

}
