/**
 * Representación de una ficha del domino.
 * Una ficha de domino tiene dos lados con valores del 1 al 6 o el blanco. 
 * Vamo a representar dichos valores con los caracteres ' ' (blanco), junto 
 * con del '1' al '6'.
 * @author yszee
 *
 */
public class Ficha {
	protected char c1, c2;
	// Comprueba que el caracter es valido para la ficha.
	private boolean valido(char x) {
		if (x >= '1' && x <= '6')
			return true;
		else
			return x == ' ';
	}
	/**
	 * Crea una ficha de domino con valores blanco o del 1 al 6.
	 * @param c Uno de los lados
	 * @param d El otro lado
	 */
	public Ficha(char c, char d) {
		if (! (valido(c) && valido(d))) {
			throw new IllegalArgumentException("Carácter no válido");
		}
		c1 = c; c2 = d;
	}
	/**
	 * Crea una ficha de domino con valores o del 0 al 6, el 0 representa al
	 * blanco.
	 * @param x Uno de los lados
	 * @param y El otro lado
	 */
	public Ficha(int x, int y) {
		this(x == 0 ? ' ' : (char)('0' + x ),
			 y == 0 ? ' ' : (char) ('0' + y));
	}
	
	public boolean equals (Ficha f) {
		return c1 == f.c1 && c2 == f.c2 
		     || c2 == f.c1 && c1 == f.c2;
	}
	
	public String toString() {
		return "[" + c1 + "|" + c2 + "]";
	}
}
