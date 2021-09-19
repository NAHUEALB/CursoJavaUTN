package Ejercicio3;

public class Vaca extends Animal implements Herviboro{

	@Override
	public void hablar() {
		System.out.println("MU");
	}
	
	@Override
	public void comerHierba() {
		System.out.println("Comiendo hierba...");
		
	}
	

}
