package shapes;
// might be broken
public class Rhombus implements Shape
{
	private int b;
	private int a;
	private int side;

	public Rhombus(int b, int a, int side) 
	{
		this.b = b;
		this.a = a;
		this.side = side;
	}
		
	public double calculateArea() 
	{
		// To be written by student
		return (0.5 * (b * a));
	}

	public double calculatePerimeter() 
	{
		// To be written by student
		return (4 * side);
	}

	public String toString() 
	{
		return "Rhombus- \n"  + "   A: " + a + "   B: " + b + "   Side: " + side 
		+ "   Area: " + this.calculateArea() + "   Perimeter: " + this.calculatePerimeter();
	}
		
}

	

