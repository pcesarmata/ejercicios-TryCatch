/**
 * 
 */
package net.tecgurus;

/**
 * @author Cesar
 *
 */
public class TryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numero;
//		String cadena = "1";
		String cadena = "Hola Mundo";
		try {
			numero = Integer.parseInt(cadena);
			System.out.println(numero);
		} catch (NumberFormatException error) {
			System.out.println("No es un número es una cadena " + error);
		}
		;
	}
}