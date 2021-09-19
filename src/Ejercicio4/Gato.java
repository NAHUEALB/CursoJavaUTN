package Ejercicio4;

public class Gato extends Carnivoro{

	@Override
	public void hablar() {
		System.out.println("MIAU");
	}
	
	@Override
	public void comerCarne() {
		System.out.println("Comiendo carne...");	
	}

	@Override
	public void comer() {
		comerCarne();
	}
	

	
	
}
