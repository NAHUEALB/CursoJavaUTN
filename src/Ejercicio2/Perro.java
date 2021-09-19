package Ejercicio2;

public class Perro extends Animal{

	private String nombre;
	
	@Override
	public void hablar() {
		System.out.println("GUAU");	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
