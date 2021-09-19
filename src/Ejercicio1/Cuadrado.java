package Ejercicio1;

public class Cuadrado implements Figura{

	private double lado;
	
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public double calcularPerimetro() {
		return lado*4;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	

}
