package modelo;

public class JuegoAdivinaNumeroImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaNumeroImpar(int vidas, int numeroAdivinar) {
		super(vidas, numeroAdivinar);
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
