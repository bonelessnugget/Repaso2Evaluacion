
public class Programa {
	public static void main(String[] args) {
		Fraccion fraccion = new Fraccion(50,13);
		System.out.println(fraccion);
		fraccion.invertir();
		System.out.println(fraccion.simplificar());

	}
}
