
public class Carta {
	private String palo;
	int valor;
	
	public Carta () {
		this.palo = "Oros";
		this.valor = 1;
	}
	
	public Carta(String palo, int valor) {
		this.palo = palo;
		this.valor = valor;
	}
	
	public String toString() {
		if (valor == 1) {
			return "AS de " + palo;
		}else if (valor == 10) {
			return "Sota de " + palo;
		}else if (valor == 11) {
			return "Caballo de " + palo;
		}else if (valor == 12) {
			return "Rey de " + palo;
		}else if (valor == 2) {
			return "Dos de " + palo;
		}else if (valor == 3) {
			return "Tres de " + palo;
		}else if (valor == 4) {
			return "Cuatro de " + palo;
		}else if (valor == 5) {
			return "Cinco de " + palo;
		}else if (valor == 6) {
			return "Seis de "  + palo;
		}else if (valor == 7) {
			return "Siete de "  + palo;
		}else if (valor == 8) {
			return "Ocho de "  + palo;
		}else {
			return "Nueve de "  + palo;
		}
	}
}
