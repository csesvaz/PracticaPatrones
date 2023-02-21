package modelo;

public class JuegosReunidos {
	// Array de Juegos
	private Jugable[] juegos = new Jugable[3];

	// constructors
	public JuegosReunidos() {
		juegos[0] = new JuegoAdivinaNumero(5, 7);
		juegos[1] = new JuegoAdivinaNumeroPar(5, 6);
		juegos[2] = new JuegoAdivinaNumeroImpar(5, 3);
	}

	public Jugable recuperarJuego(int opcion) {
		return juegos[opcion - 1];
	}

	
	
	
}
