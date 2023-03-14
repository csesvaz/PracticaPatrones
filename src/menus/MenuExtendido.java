package menus;
import EntradaSalida.MyInput;
import modelo.JuegosReunidos;
public class MenuExtendido extends Menu {
	// Constructor
	
public MenuExtendido(JuegosReunidos juegos) {
			super(juegos);
		}
public void mostrarOpciones() {
	super.mostrarOpciones();
	MyInput.imprimir("     4.Introduce 4 si quieres jugar a Ahorcado en inglés");
}

public boolean chequearOpcion(int opcion) {
	return super.chequearOpcion(opcion)||opcion==4;
}
}