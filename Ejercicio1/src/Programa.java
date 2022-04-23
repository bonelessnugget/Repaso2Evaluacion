import java.util.Random;

public class Programa {

	public static void main(String[] args) {
		int[] numeros = new int[3];
		int[] cuadrados = new int[3];
		int[] cubos = new int[3];
		Random r = new Random();
		for (int i = 0; i<numeros.length; i++) {
			numeros[i] = r.nextInt(100);
			System.out.print(" " + numeros[i]);
		}
		System.out.println();
		for (int i = 0; i<cuadrados.length; i++) {
			cuadrados[i] = (int) Math.pow(numeros[i], 2);
			System.out.print(" " + cuadrados[i]);
		}
		System.out.println();
		for (int i = 0; i<cubos.length; i++) {
			cubos[i] = (int) Math.pow(numeros[i], 3);
			System.out.print(" " + cubos[i]);
		}
	}

}
