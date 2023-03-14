package modelo;

import java.util.ArrayList;
import java.util.Random;

import EntradaSalida.MyInput;

public class JuegoAhorcadoIngles extends JuegoConVidas implements Jugable {
	// palabra a adivinar tiene la palabra que debo adivinar y el diccionario de
	// donde voy a sacar las palabras aleatorias.
	private ArrayList<Character> palabraAdivinar = new ArrayList<Character>();
	private ArrayList<Character> guiones = new ArrayList<Character>();
	private ArrayList<String> diccionario;

	// constructor
	public JuegoAhorcadoIngles(int vidas, ArrayList<String> diccionario) {
		super(vidas);
		this.diccionario = diccionario;
	}

	@Override
	public void muestraNombre() {
		MyInput.imprimir("Juego del ahorcado.");

	}

	@Override
	public void muestraInfo() {
		MyInput.imprimir("Este juego consiste en adivinar una palabra en inglés.");
		muestraVidas();
	}

	public boolean existeCaracter(Character caracter) {
		int contador = 0;
		for (int i = 0; i < palabraAdivinar.size(); i++) {
			if (palabraAdivinar.get(i).equals(caracter)) {
				contador++;
				guiones.set(i, caracter);
			}
		}
		return contador > 0;
	}
	public void mostrarArray(ArrayList<Character> lista) {
		for (Character auxiliar : lista)
			System.out.print(auxiliar);
		MyInput.imprimir("");
	}

	// Se puede refactorizar
	public void reiniciaPartida() {
		super.reiniciaPartida();
		palabraAdivinar.clear();
		guiones.clear();
		int indice =  new Random(System.currentTimeMillis()).nextInt(diccionario.size());
		String palAdivinar = diccionario.get(indice);
		for (int i = 0; i < palAdivinar.length(); i++) {
			palabraAdivinar.add(palAdivinar.charAt(i));
			guiones.add('-');
		}
		mostrarArray(guiones);
	}

	@Override
	public boolean validaFormato(String cad) {
		Character car = cad.charAt(0);
		if ((cad.length() == 1) && (Character.isLetter(car)) && (Character.isLowerCase(car))) {
			return true;
		} else {
			MyInput.imprimir("El formato no es correcto. Inténtelo de nuevo.");
			return false;
		}
	}

	public boolean juega(String caracter) {
		Character c = caracter.charAt(0);
		if (existeCaracter(c)) {
			mostrarArray(guiones);
			if (guiones.equals(palabraAdivinar)) {
				MyInput.imprimir("Has acertado");
				actualizaRecord();
				return false;
			} else {
				return true;
			}
		} else {
			MyInput.imprimir("Este caracter no se encuentra en la palabra.");
			return quitaVida();
		}
	}

}
