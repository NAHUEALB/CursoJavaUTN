package EjercicioMoto;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int speed;
		int rta = 0;
		
		Bike bikeOne = new Bike(0,"rojo");
		
		System.out.println("Se inicia la carrera");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese la velocidad de la primera moto");
		speed = scan.nextInt();
		bikeOne.setSpeed(speed);
		
		System.out.println("---MENU---");
		while(rta != 4) {
			System.out.println("1-- Ver datos de la moto");
			System.out.println("2-- Acelerar la moto");
			System.out.println("3-- Frenar la moto");
			System.out.println("4-- exit");
			rta = scan.nextInt();
			optionMenu(rta, bikeOne);
			
		}
		
				
	}
	
	public static void optionMenu(int rta, Bike bikeOne) {
		switch(rta) {
			case 1:{				
						System.out.println(bikeOne.toString());
						break;
			}  
			case 2: {
						if(bikeOne.getSpeed() < 10) {
							bikeOne.acelerar();					
						}else {
							System.out.println("La moto no puede ir a mas de 10km/h");
						}
						break;
			}
			case 3:{
						if(bikeOne.getSpeed() >= 0) {
							bikeOne.frenar();	
						}else {
							System.out.println("La moto ya esta frenada");
						}
						break;
			}
			case 4: {
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
