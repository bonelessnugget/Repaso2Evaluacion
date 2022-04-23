import java.util.Random;

/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
almacene en un vector. El programa debe ser capaz de pasar todos los números pares a las
primeras posiciones del vector (del 0 en adelante) y todos los números impares a las celdas
restantes. Utiliza vectores auxiliares si es necesario.
 * @author yszee
 *
 */
public class Programa {

	public static void main(String[] args) {
		Random r = new Random();
		int[] numeros = new int[20];
		int izda = 0;
		int derecha = numeros.length-1;
		for (int i = 0; i<numeros.length; i++) {
			numeros[i] = r.nextInt(100);
		}
		for (int original : numeros) {
			System.out.print(" "+original);
		}
		System.out.println();
		for (int i = 0; i<numeros.length; i++) {
			while ( numeros[izda]%2==0) {
				izda++;
			}
			while (numeros[derecha]%2 == 0) {
				derecha--;
			}
			if (izda<derecha) {
				int temp = numeros[izda];
				numeros[izda]=numeros[derecha];
				numeros[derecha] = temp;
			}
		}
		for (int numero : numeros) {
			System.out.print(" " + numero);
		}
		// Dos variables una por la derecha otra por la izquierda
		
	}

}
