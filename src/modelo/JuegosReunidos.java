package modelo;

import EntradaSalida.MyInput;

public class JuegosReunidos {
	// Array de Juegos
	private Jugable[] juegos = new Jugable[3];

	// constructors
	public JuegosReunidos() {
		juegos[0] = new JuegoAdivinaNumero(5, 7);
		juegos[1] = new JuegoAdivinaNumeroPar(5, 3);
		juegos[2] = new JuegoAdivinaNumeroImpar(5, 6);
	}

	public Jugable recuperarJuego(int opcion) {
		return juegos[opcion - 1];
	}

	public void jugar(Jugable juego) {
		String numeroIntento;
		juego.reiniciaPartida();
		juego.muestraNombre();
		juego.muestraInfo();
		do {
			System.out.println("Introduce un numero entero de 1 a 10.");
			numeroIntento = MyInput.readString();
		} while (juego.juega(numeroIntento));
	}

	public void mostrarOpciones() {
		System.out.println("¿A que quieres jugar?");
		System.out.println("     1.Introduce 1 si quieres jugar a Adivinar un Número");
		System.out.println("     2.Introduce 2 si quieres jugar a Adivinar un NúmeroPar");
		System.out.println("     3.Introduce 3 si quieres jugar a Adivinar un NúmeroImpar");
	}

	public boolean chequearOpcion(int opcion) {
		if (opcion == 1 || opcion == 2 || opcion == 3) {
			return true;
		} else {
			return false;
		}
	}

	public int eligeOpcion() {
		int opcion;
		boolean marca = true;
		do {
			mostrarOpciones();
			opcion = MyInput.readInt();
			if (chequearOpcion(opcion)) {
				marca = false;
			} else {
				System.out.println("La opcion introducida no es correcta, inténtelo de nuevo.");
			}
		} while (marca);

		return opcion;
	}

	public void ejecuta() {
		String respuesta;
		do {
			jugar(juegos.recuperarJuego(eligeOpcion()));
			System.out.println("¿Quieres seguir jugando?. En caso afirmativo introduzca \"s\"");
		} while (chequearOpcion(0));
	}
}
