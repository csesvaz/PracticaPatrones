package modelo;

import java.util.ArrayList;
import java.util.Random;

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
		System.out.println("Juego del ahorcado.");

	}

	@Override
	public void muestraInfo() {
		System.out.println("Este juego consiste en adivinar una palabra en inglés.");
		muestraVidasIniciales();
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
			System.out.println(auxiliar);
		System.err.println();
	}

	// Se puede refactorizar
	public void reiniciaPartida() {
		super.reiniciaPartida();
		palabraAdivinar.clear();
		guiones.clear();
		Random r = new Random(System.currentTimeMillis());
		int indice = r.nextInt(diccionario.size());
		String palAdivinar = diccionario.get(indice);
		for (int i = 0; i < palAdivinar.length(); i++) {
			palabraAdivinar.add(palAdivinar.charAt(i));
			guiones.add('-');
		}
		mostrarArray(guiones);
	}

	public boolean juega(String caracter) {
		Character c= caracter.charAt(0);
		if (existeCaracter(c)) {
			mostrarArray(guiones);
			if (guiones.equals(palabraAdivinar)) {
				System.out.println("Has acertado");
				actualizaRecord();
					return false;
			} else {
				return true;
			}}else{
				System.out.println("Este carcter no se encuentra en la palabra.");
				return quitaVida();
			}
		}
			
	}
