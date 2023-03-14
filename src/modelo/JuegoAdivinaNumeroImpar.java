package modelo;

import java.util.Random;

import EntradaSalida.MyInput;

public class JuegoAdivinaNumeroImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaNumeroImpar(int vidas) {
		super(vidas);
	}
	public boolean validaNumero(int numero) {
		boolean marca=false;
		if (super.validaNumero(numero)) {
			if ((numero%2==1)) {
				marca=true;
			} else {
				MyInput.imprimir("El número indicado es par.");
			}
		}
		return marca;
	}
	//Se puede eliminar la variable
	public int numeroAleatorio() {
		return 2*(new Random(System.currentTimeMillis()).nextInt(5)+1);
	}
	@Override
	public void muestraNombre() {
		MyInput.imprimir("Juego Adivina Número Impar");
		
	}
	@Override
	public void muestraInfo() {
		MyInput.imprimir("Este juego consiste en adivinar una número entero entre 0 y 10, que sea impar.");
		muestraVidas();
	}
}