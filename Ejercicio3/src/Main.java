import java.util.Random;

/**
 * Escribe un programa que rellene un vector de 100 elementos con números enteros
aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación, el programa
mostrará el mínimo y el máximo de los cien.
 * @author yszee
 *
 */
public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		int[] vector = new int[10];
		int maximo = vector[0];
		int minimo = vector[0];
		for (int i = 0; i<vector.length; i++) {
			vector[i]= (int) (Math.random() * 500);
			System.out.print(" " + vector[i]);
		}
		for (int i = 0; i<vector.length; i++) {
			if (vector[i] > maximo) {
				maximo = vector[i];
			}
			if (vector[i]<minimo) {
				minimo = vector[i];
			}
				
		}
		
		for (int v : vector) {
			System.out.print(" " + v);
		}
		System.out.println();
		System.out.println("Maximo: " + maximo);
		System.out.println("Minimo: " + minimo);

	}

}
