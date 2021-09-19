package Ejercicio1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		calcularRectangulo(scan);
		
		System.out.println("-----------");
		
		calcularCuadrado(scan);
		
		System.out.println("-----------");
		
		calcularCirculo(scan);
	
	}
	
	
	public static void calcularRectangulo(Scanner scan) {
		System.out.println("---Rectangulo---");
		System.out.println("Ingrese el valor de la base");
		Double base = scan.nextDouble();
		System.out.println("Ingrese el valor de la altura");
		Double altura = scan.nextDouble();
		
		Figura rectangulo = new Rectangulo(base, altura);

		System.out.println("El area del rectangulo es: "+ rectangulo.calcularArea() + " .El perimetro es: "+ rectangulo.calcularPerimetro());
	}
	
	public static void calcularCuadrado(Scanner scan) {
		System.out.println("---Cuadrado---");
		System.out.println("Ingrese el valor de un lado");
		Double lado = scan.nextDouble();
		
		Figura cuadrado = new Cuadrado(lado);
		
		System.out.println("El area del cuadrado es: "+ cuadrado.calcularArea() + " .El perimetro es: "+ cuadrado.calcularPerimetro());
	}
	
	public static void calcularCirculo(Scanner scan) {
		System.out.println("---Circulo---");
		System.out.println("Ingrese el valor del radio");
		Double radio = scan.nextDouble();
		
		Figura circulo = new Circulo(radio);
		
		System.out.println("El area del circulo es: "+ circulo.calcularArea() + " .El perimetro es: "+ circulo.calcularPerimetro());
	}

}
