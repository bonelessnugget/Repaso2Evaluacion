import java.util.Random;

public class Baraja{
	private Carta[] oros = new Carta[12];
	private Carta[] copas = new Carta[12];
	private Carta[] espadas = new Carta[12];
	private Carta[] bastos = new Carta[12];
	private Carta[] baraja = new Carta[48];
	public Baraja() {
		int valorOros = 1;
		int valorCopas = 1;
		int valorEspadas = 1;
		int valorBastos = 1;
		for (int i = 0; i<baraja.length; i++) {
			if (i<12) {
				baraja[i] = new Carta("Oros", valorOros);
				valorOros++;
			}
			if (i >= 12 && i <= 24) {	
				baraja[i] = new Carta("Copas", valorCopas);
				valorCopas++;
			}
			if (i >= 24 && i<=36) {
				baraja[i] = new Carta("Espadas", valorEspadas);
				valorEspadas++;
			}
			if (i >= 36 && i<=48) {
				baraja[i] = new Carta("Bastos", valorBastos);
				valorBastos++;
			}
		}
	}
	public void cartasAleatorias() {
		Random r = new Random();
		int valorFinal = 0;
		for (int i = 0; i<10; i++) {
			System.out.println("Carta: " + i + " " +baraja[r.nextInt(48)]);
			valorFinal += baraja[r.nextInt(48)].valor;
		}
		System.out.println("La suma total es: "+valorFinal);
	}
}
