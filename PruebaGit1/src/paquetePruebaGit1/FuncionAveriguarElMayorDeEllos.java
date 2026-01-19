package paquetePruebaGit1;

public class FuncionAveriguarElMayorDeEllos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=2;
		int num2=2;
		int numeroMayor= averiguarMayor(num1, num2);
		System.out.println("el mayor de los dos numeros es "+ numeroMayor);
	}
	public static int averiguarMayor(int num1, int num2) {
		if (num1>num2) {
			return num1;
		} else {
			return num2;
		}
	}

}
