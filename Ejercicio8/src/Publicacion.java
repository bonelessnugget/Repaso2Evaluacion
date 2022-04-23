
public class Publicacion {
private int ISBN;
private String titulo;
private int anoPublicacion;

	public Publicacion(int ISBN, String titulo, int anoPublicacion) {
		if (anoPublicacion <= 2022) {
			this.anoPublicacion = anoPublicacion;
		}
		this.titulo = titulo;
		this.ISBN = ISBN;
	}
	
	public String toString() {
		return "ISBN: " + ISBN + " Titulo: " + titulo + " Año de Publicación: " + anoPublicacion;
	}
}
