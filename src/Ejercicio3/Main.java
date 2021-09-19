package Ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		Carnivoro perro = new Perro();
		Carnivoro gato = new Gato();
		//No podria hacer que la misma instancia pueda hablar y comer de esta manera? 
		//Con esta definicion, deberia crear 2 perros 1 que hable y otro coma. Como se soluciona?
		
		perro.comerCarne();
		gato.comerCarne();
		
		Herviboro vaca = new Vaca();
		
		vaca.comerHierba();
		
	}

}
