package modelo;

public class JuegoAdivinaNumero extends JuegoConVidas implements Jugable {
	//numeroAdivinar representa el atributo propio de la cadena JuegoAdivinaNumero
		private int numeroAdivinar;
	//Constructor
		public JuegoAdivinaNumero(int vidas, int numeroAdivinar) {
			super(vidas);
			this.numeroAdivinar = numeroAdivinar;
		}
	//metodos (polimorfismo)
		public boolean validaNumero(int numero) {
			boolean marca=false;
			if ((numero>=0)&&(numero<=10)) {
				marca=true;
			}else {
				System.out.println("Número fuera de rango");
			}
			return marca;
		}
		// Este método da las reglas para jugar un paso en el juego AdivinaNumero, esto es una repetición.
		@Override
		public boolean juega(String numero) {
			Integer numeroIntento;
				numeroIntento=Integer.parseInt(numero);
				if (validaNumero(numeroIntento)) {
					if (numeroIntento==numeroAdivinar) {
						System.out.println("Acertaste!!, Enhorabuena");
						actualizaRecord();
						return false;
					}else{
						if (numeroAdivinar>numeroIntento) {
							System.out.println("Su numero es menor que el número a adivinar.");
						} else {
							System.out.println("Su numero es mayor que el número a adivinar.");
						}
						return quitaVida();
					}
				} else {
					return true;
		}
				}
		@Override
		public void muestraNombre() {
			System.out.println("Juego Adivina Número");
			
		}
		@Override
		public void muestraInfo() {
			System.out.println("Este juego consiste en adivinar una número entero entre 0 y 10.");
			muestraVidasIniciales();
		}
	}

