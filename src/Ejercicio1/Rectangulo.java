package Ejercicio1;

public class Rectangulo implements Figura {
	
	private Double base;
	private Double altura;
	

	public Rectangulo(Double base, Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base*altura;
	}

	@Override
	public double calcularPerimetro() {
		return base*2+altura*2;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	
}
