package modelo;

import java.util.Random;

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
				System.out.println("El número indicado es par.");
			}
		}
		return marca;
	}
	public int numeroAleatorio() {
		Random r=new Random(System.currentTimeMillis());
		return 2*r.nextInt(5)+1;
	}
	@Override
	public void muestraNombre() {
		System.out.println("Juego Adivina Número Impar");
		
	}
	@Override
	public void muestraInfo() {
		System.out.println("Este juego consiste en adivinar una número entero entre 0 y 10, que sea impar.");
		muestraVidasIniciales();
	}
}