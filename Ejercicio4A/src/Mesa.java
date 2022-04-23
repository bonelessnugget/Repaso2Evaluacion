import java.util.Random;

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
public class Mesa {
	private int comensales;
	private boolean ocupada;
	private int tiempo;
	private Random r = new Random();
	public Mesa(int comensales) throws InterruptedException {
		if (comensales > 0 && comensales <= 4) {
			this.comensales = comensales;
			ocupada = true;
			tiempo = r.nextInt(1000);
			tiempoEnMesa();
		}
		else {
			ocupada = false;
			if (comensales > 4)
				System.out.println("Lo siento, no adminitmos grupos de 6, solo de 4"
						+ " personas como máximo");
			else if (comensales == 0)
				System.out.println("La mesa está libre.");
		}	
	}
	
	public void tiempoEnMesa() throws InterruptedException {
		int i = 0;
		while (i != tiempo) {
			i++;
			Thread.sleep(1000);
		}
		if (i == tiempo)
			ocupada = false;
			System.out.println("La mesa " + " ha quedado libre");
	}
	public String toString() {
		if (ocupada) {
			return "Numero mesa: " +   " Comensales: " + comensales + " Estado: Ocupada";
		}else
			return "Numero mesa: " +   " Comensales: " + comensales + " Estado: Libre";
		
	}
}
