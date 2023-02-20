package modelo;

import EntradaSalida.MyInput;

public class PracticaJuego {

	public static void main(String[] args) {
		JuegoConVidas juego1 = new JuegoAdivinaNumeroImpar(5, 7);
		JuegoConVidas juego2 = new JuegoAdivinaNumeroPar(5, 8);
		JuegoConVidas juego3 = new JuegoAdivinaNumero(5, 8);
		jugar(juego1);
		jugar(juego2);
		jugar(juego3);
	}
	public static void jugar(JuegoConVidas juego) {
		String numeroIntento;
		juego.reiniciaPartida();
		do {
			System.out.println("Introduce un numero entero de 1 a 10.");
			numeroIntento=MyInput.readString();
		} while (juego.juega(numeroIntento));
	}
}