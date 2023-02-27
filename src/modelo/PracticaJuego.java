package modelo;

import EntradaSalida.MyInput;
import menus.Menu;
import menus.MenuExtendido;

public class PracticaJuego {

	public static void main(String[] args) {
		JuegosReunidos juegosReunidos = MyInput.deserialize("datos.dat");
		if (juegosReunidos == null) {
			juegosReunidos = new JuegosReunidosExtendido(MyInput.leeFichero("diccionario.txt"));
		}
		Menu menu = new MenuExtendido(juegosReunidos);
		menu.ejecuta();
		MyInput.serialize(juegosReunidos, "datos.dat");
	}
}