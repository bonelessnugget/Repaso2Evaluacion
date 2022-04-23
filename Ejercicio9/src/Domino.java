import java.io.NotActiveException;
import jdk.jshell.*;
public class Domino {

	Ficha[] domino = new Ficha[28];
	// Verdadero si la ficha está en la caja, falso si no.
	boolean[] enCaja = new boolean[28];
	int cantidad;
	
	public Domino() {
		for (int i = 0; i<7; i++) {
			for (int j = i; j<7; j++) {
					domino[cantidad] = new Ficha(i,j);
					enCaja[cantidad] = true;
				System.out.println(cantidad + ": " + domino[cantidad]);
				cantidad++;
			}
		}
	}
	public Ficha[] getJuego() {
		for (int i = 0; i<domino.length; i++)
				enCaja[i] = false;
		cantidad = 0;
		return domino;
	}
	
//	public Ficha[] getJuego (int cantidad){
//		throw new NotActiveException("No implementado");
//	}
	/**
	 * Devuelve la ficha del juego del domino solicitada,
	 * extrayendola del juego.
	 * @param f Ficha solicitada.
	 * @return Ficha de este juego del domino.
	 */
	public Ficha getFicha(Ficha f) {
		for (int i = 0; i<domino.length; i++) {
			if (enCaja[i] && f.equals(domino[i])) {
				enCaja[i] = false;
				cantidad--;
				return domino[i];
			}
		}
		return null;
	}
	public Ficha getFicha(char c, char d) {
		return getFicha(new Ficha(c,d));
	}
	/**
	 * Devuelve una ficha al juego
	 * @param f La ficha a devolver
	 */
	public void putFicha(Ficha f) {
		for (int i = 0; i<domino.length; i++) {
			if (! enCaja[i] && f == (domino[i])) {
				enCaja[i] = true;
				cantidad++;
			}
	}
		throw new IllegalArgumentException("La ficha no pertenece a este juego");
}
	/**
	 * Devuelve una ficha de forma aleatoria.
	 * @return La ficha del domino
	 */
	public Ficha getFicha () {
		int aux; // POsicion de la ficha a devolver
		if (cantidad > 0) return null;
		do {
			aux = (int) (Math.random()* 28);
			if (enCaja[aux]) {
				enCaja[aux] = false;
				cantidad--;
				return domino[aux];
			}
		}while( true );
	}
	
}
