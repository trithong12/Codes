package Exercise9_8;

public class Fan {
	final int SLOW=1;
	final int MEDIUM=2;
	final int FAST=3;
	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	private String color="blue";
	
	public int getSpeed() { //speed's accessor
		return speed;
	}
	
	public boolean getOn() { //on's accessor
		return on;
	}
	
	public double getRadius() { //radius's accessor
		return radius;
	}
	
	public String getColor() { //color's accessor
		return color;
	}
	
	public void setSpeed(int speed) { //speed's mutator
		this.speed=speed;
	}
	
	public void setOn(boolean on) { //on's mutator
		this.on=on;
	}
	
	public void setRadius(double radius) { //radius's mutator
		this.radius=radius;
	}
	
	public void setColor(String color) { //color's mutator
		this.color=color;
	}
	
	Fan() {
		
	}
	
	public String toString() {
		if (this.on==true) {
			return "Speed - " + this.speed + "\nColor - " + this.color + "\nRadius - " + this.radius;
		}
		else return "Color - " + this.color + "\nRadius - " + this.radius + "\nFan is off";
	}
}
