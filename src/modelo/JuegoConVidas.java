package modelo;

public abstract class JuegoConVidas {

	private int vidas;// vidas que tiene el jugador.
	private int vidasIniciales;// vidas iniciales.
	private int record = 0;// Guarda el record.
	
	//Constructor.
	public JuegoConVidas(int vidas) {
		vidasIniciales = vidas;
		this.vidas = vidas;
	}
	//Visualiza por pantalla el número de vidas iniciales de la partida actual.
	
	public void muestraVidasIniciales() {
		System.out.println("Vidas iniciales: "+ vidasIniciales);
	}
	//Visualiza por pantalla el número de vidas actuales de la partida.
	private void muestraVidasRestantes() {
		System.out.println("Vidas actuales: "+ vidas);
	}
	//Resta una vida en caso de tener más de 1, si se tiene 0 marca el fin del juego.
	public boolean quitaVida() {
		if (--vidas!=0) {
			muestraVidasRestantes();
			return true;
		} else {
			
			System.out.println("Juego terminado.");
		return false;
		}
	}
	public void reiniciaPartida() {
		vidas=vidasIniciales;
	}
	public int actualizaRecord() {
		if (record==vidas) {
			System.out.println("Se ha alcanzado el record.");
		}else if(vidas>record) {
			record=vidas;
			System.out.println("Se ha batido el record, el record actual es de " + record);
		}
		return 0;
	}
}
