
public class Programa {
public static void main(String[] args) {
	Libro libro = new Libro(157, "Paco", 4);
	Revista revista = new Revista(3753894,"asdasd", 2, 1);
	libro.presta();
	libro.devuelve();
	if (!libro.estaPrestado()) {
		System.out.println("Prueba");
	}
	System.out.println(libro);
	System.out.println(revista);
	
}
}
