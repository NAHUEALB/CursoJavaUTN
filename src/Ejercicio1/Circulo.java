package Ejercicio1;

public class Circulo implements Figura{
	
	private Double radio;

	public Circulo(Double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return  3.14 * Math.pow(radio, 2);
	}

	@Override
	public double calcularPerimetro() {
		return 3.14 * radio * 2;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

}
