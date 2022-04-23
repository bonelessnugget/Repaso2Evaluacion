
public class Fraccion {
	private int numerador;
	private int denominador;
	
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void invertir() {
		System.out.println("Antes de invertir: " + numerador + "/" + denominador);
		int aux;
		aux = numerador;
		numerador = denominador;
		denominador = aux;
		System.out.println("Una vez invertida: " + numerador + "/" + denominador);
	}
	
	int mcd() {
		if (denominador == 0)
			return numerador;
		int r;
		while (denominador != 0) {
			r = numerador % denominador;
			numerador = denominador;
			denominador = r;
		}
		return numerador;
	}
	
	public Fraccion simplificar() {
		int dividir = mcd();
		numerador/=dividir;
		denominador/=dividir;
		return this;
	}
	
	public String toString() {
		return numerador + "/" + denominador;
	}
}
