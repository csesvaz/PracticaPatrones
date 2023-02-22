package modelo;

import EntradaSalida.MyInput;
import menus.MenuExtendido;

public class PracticaJuego {

	public static void main(String[] args) {
		JuegosReunidosExtendido juegosReunidos= new JuegosReunidosExtendido(MyInput.leeFichero("diccionario.txt"));
		MenuExtendido menu= new MenuExtendido(juegosReunidos);
		menu.ejecuta();
	}
}