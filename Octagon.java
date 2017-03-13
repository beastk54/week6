package week6;
/*
 * Brandon Kavanaugh 
 * Ex13_11
 */
public class Octagon extends GeometricObject implements Comparable, Cloneable{
	private double side;
	
	public Octagon(double s) {
        super();
        side=s;
    }
	public double getArea(){
		return ((2+4/(Math.sqrt(2)))*side*side);
	}
	public double getPerimeter(){
		return (side*8);
	}
	public int compareTo(Octagon o1) {
		if(o1.getArea()==this.getArea())
		{
			return 0;
		}
		else 
		{
			return -1;
		}
	}

}
