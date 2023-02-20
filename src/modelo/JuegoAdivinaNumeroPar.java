package modelo;

public class JuegoAdivinaNumeroPar extends JuegoAdivinaNumero {

	public JuegoAdivinaNumeroPar(int vidas, int numeroAdivinar) {
		super(vidas, numeroAdivinar);
		
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