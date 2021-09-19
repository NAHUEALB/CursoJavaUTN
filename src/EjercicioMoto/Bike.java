package EjercicioMoto;

public class Bike {
	
	private int speed;
	private String color;
	
	public Bike() {	}
	
	public Bike(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", color=" + color + "]";
	}
		
	public void acelerar() {
		this.speed++;
	}
	public void frenar() {
		this.speed--;
	}
	
}
