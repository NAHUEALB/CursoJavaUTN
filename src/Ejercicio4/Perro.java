package Ejercicio4;

public class Perro extends Carnivoro{

	private String nombre;
	
	
	@Override
	public void hablar() {
		
		System.out.println("GUAU");	
	}

	@Override
	public void comerCarne() {
		System.out.println("Comiendo carne...");
		
	}
	
	@Override
	public void comer() {
		comerCarne();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
