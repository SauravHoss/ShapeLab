package shapes;
// also broken, need seperate constructor// CURRENTLY WORKS ON REGULAR PARALLELOGRAMS ONLY// PERIMETER IS FUKT
public class Parallelogram implements Shape
{
	private int base;
	private int height;
	private double pyg;

	public Parallelogram(int base, int height, int side) 
	{
		this.base = base;
		this.height = height;
		this.pyg = height * Math.pow(2, 0.5);
	}
	
	public double calculateArea() 
	{
		// To be written by student
		return (base * height);
	}

	public double calculatePerimeter() 
	{
		// To be written by student
		return (2 * (base + pyg));
	}

	public String toString() 
	{
		return "Parallelogram- \n"  + "   Height: " + height + "   Base: " + base + "   Side: " + pyg 
				+ "   Area: " + this.calculateArea() + "   Perimeter: " + this.calculatePerimeter();
	}
	
}
