package unico;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Implementar un método al que se le pasen dos números enteros y muestre todos
		 * los números comprendidos entre ellos.
		 */

		int n1;
		int n2;

		n1 = Util.leerInt("Introduzca el primer número entero: ");
		n2 = Util.leerInt("Introduzca el segundo número: ");

		numerosComprendidos(n1, n2);
	}

	static void numerosComprendidos(int n1, int n2) {
		if (n1 > n2) {
			for (int i = n2; i <= n1; i++) {
				Util.escribirL(" " + i);
			}
		} else {
			for (int i = n1; i <= n2; i++) {
				Util.escribirL(" " + i);
			}

		}

	}

}
