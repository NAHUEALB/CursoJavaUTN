package Ejercicio4;

public class Vaca extends Herviboro{

	@Override
	public void hablar() {
		System.out.println("MU");
	}
	
	@Override
	public void comerHierba() {
		System.out.println("Comiendo hierba...");
		
	}

	@Override
	public void comer() {
		comerHierba();
	}
	

}
