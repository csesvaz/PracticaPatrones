package modelo;

import java.util.Random;

import EntradaSalida.MyInput;

public class JuegoAdivinaNumero extends JuegoConVidas implements Jugable {
	// numeroAdivinar representa el atributo propio de la cadena JuegoAdivinaNumero
	private int numeroAdivinar;

	// Constructor
	public JuegoAdivinaNumero(int vidas) {
		super(vidas);
	}

	// metodos (polimorfismo)
	public boolean validaNumero(int numero) {
		if ((numero >= 0) && (numero <= 10)) {
			return true;
		} else {
			MyInput.imprimir("Número fuera de rango");
		}
		return false;
	}

	@Override
	public boolean validaFormato(String cad) {
		int numero;
		try {
			numero = Integer.parseInt(cad);
		} catch (NumberFormatException nfe) {
			MyInput.imprimir("El formato no es correcto. Inténtelo de nuevo.");
			return false;
		}
		return true;
	}

	// Este método da las reglas para jugar un paso en el juego AdivinaNumero, esto
	// es una repetición.
	@Override
	public boolean juega(String numero) {
		Integer numeroIntento;
		numeroIntento = Integer.parseInt(numero);
		if (validaNumero(numeroIntento)) {
			if (numeroIntento == numeroAdivinar) {
				MyInput.imprimir("Acertaste!!, Enhorabuena");
				actualizaRecord();
				return false;
			} else {
				if (numeroAdivinar > numeroIntento) {
					MyInput.imprimir("Su numero es menor que el número a adivinar.");
				} else {
					MyInput.imprimir("Su numero es mayor que el número a adivinar.");
				}
				return quitaVida();
			}
		} else {
			return true;
		}
	}

	// Método que genera un número aleatorio.
	public int numeroAleatorio() {
		return new Random(System.currentTimeMillis()).nextInt(11);
	}

	// reescribimos reinicia partida
	public void reiniciaPartida() {
		super.reiniciaPartida();
		numeroAdivinar = numeroAleatorio();
	}

	@Override
	public void muestraNombre() {
		MyInput.imprimir("Juego Adivina Número");

	}

	@Override
	public void muestraInfo() {
		MyInput.imprimir("Este juego consiste en adivinar una número entero entre 0 y 10.");
		muestraVidas();
	}
}
