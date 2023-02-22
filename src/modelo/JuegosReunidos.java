package modelo;
import java.util.ArrayList;

public class JuegosReunidos {
	// Array de Juegos
	//private Jugable[] juegos = new Jugable[3];
	//Lo modificamos a Arraylist
	private ArrayList<Jugable> juegos = new ArrayList<Jugable>();
	// constructors
	public JuegosReunidos() {
		juegos.add(new JuegoAdivinaNumero(5));
		juegos.add(new JuegoAdivinaNumeroPar(5));
		juegos.add(new JuegoAdivinaNumeroImpar(5));
	}

	public Jugable recuperarJuego(int opcion) {
		return juegos.get(opcion - 1);
	}
	public void agregarJuego(Jugable juego) {
		juegos.add(juego);
	}
}