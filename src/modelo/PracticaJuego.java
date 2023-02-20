package modelo;

import menus.Menu;

public class PracticaJuego {

	public static void main(String[] args) {
		JuegosReunidos juegosReunidos= new JuegosReunidos();
		Menu menu= new Menu(juegosReunidos);
		menu.ejecuta();
		
	}
}