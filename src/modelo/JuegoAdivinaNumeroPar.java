package modelo;

import java.util.Random;

public class JuegoAdivinaNumeroPar extends JuegoAdivinaNumero {

	public JuegoAdivinaNumeroPar(int vidas) {
		super(vidas);
		
	}
	public boolean validaNumero(int numero) {
		boolean marca=false;
		if (super.validaNumero(numero)) {
			if ((numero%2==0)) {
				marca=true;
			} else {
				System.out.println("El número indicado es impar.");
			}
		}
		return marca;
	}
	public int numeroAleatorio() {
		Random r=new Random(System.currentTimeMillis());
		return 2*r.nextInt(5)+2;
	}
	@Override
	public void muestraNombre() {
		System.out.println("Juego Adivina Número Par");
		
	}
	@Override
	public void muestraInfo() {
		System.out.println("Este juego consiste en adivinar una número entero entre 0 y 10, que sea par.");
		muestraVidasIniciales();
	}
	}