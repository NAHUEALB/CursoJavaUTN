package Ejercicio3;

public class Gato extends Animal implements Carnivoro{

	@Override
	public void hablar() {
		System.out.println("MIAU");
	}
	
	@Override
	public void comerCarne() {
		System.out.println("Comiendo carne...");	
	}
	
}
