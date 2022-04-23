import java.util.Random;

/**
 * 
 * @author yszee
 *
 */
public class FichaDomino {
	int[] ficha = new int[2];
	/**
	 * @param lado1 Primer lado de la fihcha
	 * @param lado2 Segundo lado de la ficha
	 */
	public FichaDomino(int lado1, int lado2) {
		if ( lado1 < 0 || lado1 > 6 || lado2 < 0 || lado2 > 6) {
			throw new IllegalArgumentException();
		}
			ficha[0] = lado1;
			ficha[1] = lado2;
	}
	
	public FichaDomino() {
		ficha[0] = 0;
		ficha[1] = 0;
	}
	
	public FichaDomino(int lado1) {
		if ( lado1 < 0 || lado1 > 6) {
			throw new IllegalArgumentException();
		}
			ficha[0] = lado1;
			ficha[1] = 0;
	}
	
	public String toString() {
		String v0 =ficha[0] == 0 ? " " : ""+ficha[0];
		String v1 = ficha[1] ==0 ? " " : ""+ficha[1];
		return "[" + ficha[0] + "|" + v1 + "]";
		
	}
}
