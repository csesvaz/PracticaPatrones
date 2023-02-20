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
	}