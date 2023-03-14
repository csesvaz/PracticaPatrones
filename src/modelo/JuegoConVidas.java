package modelo;
import java.io.Serializable;

import EntradaSalida.MyInput;
//Lo hemos hecho serializable con el interfaz ( Es un interfaz vacio
//para que el sistema sepa que un objeto puede ser serialiazado
public abstract class JuegoConVidas implements Serializable {

	private int vidas;// vidas que tiene el jugador.
	private int vidasIniciales;// vidas iniciales.
	private int record = 0;// Guarda el record.

	// Constructor.
	public JuegoConVidas(int vidas) {
		vidasIniciales = vidas;
		this.vidas = vidas;
	}
	// Visualiza por pantalla el número de vidas iniciales de la partida actual.
	// Estos dos métodos muestraVidasIniciales y mestraVidasRestrantes se pueden agrupar en muestraVidas.
	public void muestraVidas() {
		MyInput.imprimir("Vidas iniciales: " + vidasIniciales+ " y las vidas actuales: " + vidas);
	}

	// Resta una vida en caso de tener más de 1, si se tiene 0 marca el fin del
	// juego.
	public boolean quitaVida() {
		if (--vidas != 0) {
			muestraVidas();
			return true;
		} else {

			MyInput.imprimir("Juego terminado.");
			return false;
		}
	}

	public void reiniciaPartida() {
		vidas = vidasIniciales;
	}

	public int actualizaRecord() {
		if (record == vidas) {
			MyInput.imprimir("Se ha alcanzado el record.");
		} else if (vidas > record) {
			record = vidas;
			MyInput.imprimir("Se ha batido el record, el record actual es de " + record);
		}
		return 0;
	}
}