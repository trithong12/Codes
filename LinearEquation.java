package Exercise9_11;

public class LinearEquation {
	private double a, b, c, d, e, f;
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
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
	
	public double getD() { //d's getter
		return d;
	}
	
	public double getE() { //e's getter
		return e;
	}
	
	public double getF() { //f's getter
		return f;
	}
	
	public boolean isSolvable() { //is solvable or not
		if (a*d-b*c!=0) return true;
		else return false;
	}
	
	public double getX() { //get x
		return (e*d-b*f)/(a*d-b*c);
	}
	
	public double getY() { //get y
		return (a*f-e*c)/(a*d-b*c);
	}
}
