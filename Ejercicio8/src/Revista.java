
public class Revista extends Publicacion{
	private int numeroRevista;
	public Revista(int ISBN, String titulo, int anoPublicacion, int numeroRevista) {
		super(ISBN, titulo, anoPublicacion);
		this.numeroRevista = numeroRevista;
	}
	
	
	public String toString() {
		return super.toString() + " Numero revista: " + numeroRevista;
	}
	
}
