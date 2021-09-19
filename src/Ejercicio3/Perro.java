package Ejercicio3;

public class Perro extends Animal implements Carnivoro{

	private String nombre;
	
	@Override
	public void hablar() {
		System.out.println("GUAU");	
	}

	@Override
	public void comerCarne() {
		System.out.println("Comiendo carne...");
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
