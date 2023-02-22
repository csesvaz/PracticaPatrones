package modelo;

import java.util.ArrayList;

public class JuegosReunidosExtendido extends JuegosReunidos {

	public JuegosReunidosExtendido(ArrayList<String>diccionario) {
		super();
		agregarJuego(new JuegoAhorcadoIngles(5,diccionario));
	}
}