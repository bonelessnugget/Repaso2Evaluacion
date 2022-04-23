
public class Libro extends Publicacion implements Prestable{
	boolean prestado;
	public Libro(int ISBN, String titulo, int anoPublicacion) {
		super(ISBN, titulo, anoPublicacion);
		prestado = false;
	}
	@Override
	public void presta() {
		prestado = true;
		
	}
	@Override
	public void devuelve() {
		prestado = false;
		
	}
	@Override
	public boolean estaPrestado() {
		return prestado;
	}
	
	public String toString() {
		if(prestado == true) {
			return super.toString() + " El libro está prestado";
		}else {
			return super.toString() + " El libro no está prestado";
		}
	}
}
