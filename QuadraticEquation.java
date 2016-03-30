package Exercise9_10;

public class QuadraticEquation {
	private double a, b, c;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double getA() { //a's getter
		return a;
	}
	
	public double getB() { //b's getter
		return b;
	}
	
	public double getC() { //c's getter
		return c;
	}
	
	public double getDiscriminant() {
		return Math.pow(b, 2)-4*a*c;
	}
	
	public double getRoot1() {
		if (this.getDiscriminant()>=0)
			return (-b+Math.sqrt(this.getDiscriminant()))/(2*a);
		else return 0;
	}
	
	public double getRoot2() {
		if (this.getDiscriminant()>=0)
			return (-b-Math.sqrt(this.getDiscriminant()))/(2*a);
		else return 0;
	}
	
}
