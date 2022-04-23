
public class Ameba {
	int peso;
	public Ameba() {
		peso = 3;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	public int comer(int pesoComida) {
		fagocitar();
		peso+=pesoComida;
		return peso;
	}
	/**
	 * 
	 * @param otraAmeba La otra ameba.
	 * @return Si devuelve 0, no se la ha comido, si devuelve otro valor si.
	 */
	public int comer(Ameba otraAmeba) {
		if (otraAmeba.peso < peso) {
			fagocitar();
			peso+= otraAmeba.peso;
			return peso;
		}else {
			System.out.println("La otra ameba es demasiado grande");
		}
		return 0;
	}
	public void fagocitar() {
		peso--;
	}
	
	public String toString() {
		return "La ameba pesa: " + peso + " microgramos";
	}

}
