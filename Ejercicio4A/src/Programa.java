import java.util.Random;
import java.util.Scanner;

/**
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas.
En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales (mesa llena).
Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está
preparado para colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que
son un grupo de 6, el programa dará el mensaje “Lo siento, no admitimos grupos de 6, solo
grupos de 4 personas como máximo”. Para el grupo que llega, se busca siempre la primera
mesa libre (con 0 personas). Si no quedan mesas libres, se indica con el mensaje “Lo
siento, no quedan mesas libres”. Una mesa puede quedar libre porque sus comensales han
finalizado.
Escribe un programa interactivo en el que puedas ir ocupando/liberando 10 mesas (de la 1
a la 10), hasta que decidas finalizar. El programa debe mostrar el estado de las mesas cada
vez que éste cambia.
 * @author yszee
 *
 */
public class Programa {
	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		Mesa[] mesas = new Mesa[10];
		boolean terminar = false;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Que quieres hacer: ");
			System.out.println("1. Nuevos clientes.");
			System.out.println("2. Ver estado mesa.");
			System.out.println("3. Cobrar cuenta mesa.");
			System.out.println("4. Terminar.");
			int opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1: {
				System.out.println("Introduce el numero de mesa y los comensales");
				int numMesa = teclado.nextInt();
				int numComensales = teclado.nextInt();
				mesas[numMesa] = new Mesa(numComensales);
				break;
			}
			
			case 2: {
				System.out.println("Introduce el numero de mesa: ");
				int numMesa = teclado.nextInt();
				System.out.println(mesas[numMesa]);
				break;
			}
			
			case 3: {
				System.out.println("Introduce el numero de mesa: ");
				int numMesa = teclado.nextInt();
				mesas[numMesa] = null;
				break;
			}
			
			case 4: {
				terminar = true;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}while(terminar != true);
	}
}

