package Ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int rta = 0;
		Scanner scan = new Scanner(System.in);
		

		while(rta != 4) {
			System.out.println("1-- Hablar como Perro");
			System.out.println("2-- Hablar como Gato");
			System.out.println("3-- Hablar como Vaca");
			System.out.println("4-- exit");
			rta = scan.nextInt();
			optionMenu(rta);
		}
		
	}
	
	
	public static void hablarAnimal(Animal a) {
		a.hablar();
	}
	
	
	public static void optionMenu(int rta){
		switch(rta) {
			case 1:{
				hablarAnimal(new Perro());
				break;
			}
			case 2:{
				hablarAnimal(new Gato());
				break;
			}
			case 3:{
				hablarAnimal(new Vaca());
				break;
			}
			case 4:{
				System.out.println("Hasta la proxima ! ");
				break;
			}
			default:{
				System.out.println("Elija una opcion del menu.");
				break;
			}
		}
	}
}
