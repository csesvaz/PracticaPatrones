package modelo;

import java.util.Random;

public class JuegoAdivinaNumeroPar extends JuegoAdivinaNumero {

	public JuegoAdivinaNumeroPar(int vidas) {
		super(vidas);
		
	}
	//Quito la marca boolean marca=false;
	public boolean validaNumero(int numero) {
		
		if (super.validaNumero(numero)) {
			if ((numero%2==0)) {
				return true;
			} else {
				System.out.println("El número indicado es impar.");
			}
		}
		return false;
	}
	//No es necesario crear variable
	public int numeroAleatorio() {
		
		return 2*(new Random(System.currentTimeMillis()).nextInt(5)+2);
	}
	@Override
	public void muestraNombre() {
		System.out.println("Juego Adivina Número Par");
		
	}
	@Override
	public void muestraInfo() {
		System.out.println("Este juego consiste en adivinar una número entero entre 0 y 10, que sea par.");
		muestraVidas();
	}
	}