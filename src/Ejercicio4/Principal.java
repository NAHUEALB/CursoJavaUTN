package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Animal gato = new Gato();
		Animal perro = new Perro();
		Animal vaca = new Vaca();
		
		
		List<Animal> animales = new ArrayList<Animal>();
		
		animales.add(perro);
		animales.add(gato);
		animales.add(vaca);
		
		for(Animal animal: animales) {
			hablarAnimal(animal);
			comerAnimal(animal);
		}
		
	}
	
	public static void hablarAnimal(Animal a) {
		a.hablar();
	}
	
	public static void comerAnimal(Animal a) {
		a.comer();
	}
	
}
