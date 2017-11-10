package shapes;

public class Parallelogram implements Shape
{
	private int base;
	private int height;
	private int side;

	public Parallelogram(int base, int height, int side) 
	{
		this.base = base;
		this.height = height;
		this.side = side;
	}
	
	public double calculateArea() 
	{
		// To be written by student
		return (base * height);
	}

	public double calculatePerimeter() 
	{
		// To be written by student
		return (2 * (base + side));
	}

	public String toString() 
	{
		return "Parallelogram- \n"  + "   Height: " + height + "   Base: " + base + "   Side: " + side 
				+ "   Area: " + this.calculateArea() + "   Perimeter: " + this.calculatePerimeter();
	}
	
}
