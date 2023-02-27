package menus;

import EntradaSalida.MyInput;
import modelo.JuegosReunidos;
import modelo.Jugable;

public class Menu {
	private JuegosReunidos juegos;

	// Constructor
	public Menu(JuegosReunidos juegos) {
		this.juegos = juegos;
	}

	public void jugar(Jugable juego) {
		String intento;
		juego.reiniciaPartida();
		juego.muestraNombre();
		juego.muestraInfo();
		do {
			System.out.println("Introduce tu respuesta");
			do {
				intento = MyInput.readString();
			}while(!juego.validaFormato(intento));
		} while (juego.juega(intento));
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

	public int eligeOpciones() {
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
			jugar(juegos.recuperarJuego(eligeOpciones()));
			System.out.println("¿Quieres seguir jugando?. En caso afirmativo introduzca \"s\"");
			respuesta = MyInput.readString();
		} while (respuesta.equals("s"));
	}
}
