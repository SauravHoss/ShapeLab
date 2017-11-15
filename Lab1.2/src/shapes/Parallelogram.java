package shapes;
// also broken, need seperate constructor//  PERIMETER IS FUKT
public class Parallelogram implements Shape
{
	private int base;
	private int height;
	

	public Parallelogram(int base, int height) 
	{
		this.base = base;
		this.height = height;
	}
	
	public double calculateArea() 
	{
		// To be written by student
		return (base * height);
	}

	public double calculatePerimeter() 
	{
		// To be written by student
		return (2 * (base + height * Math.pow(2, 0.5)));
	}

	public String toString() 
	{
		return "Parallelogram- \n"  + "   Height: " + height + "   Base: " + base + "   Side: " + 
				 "   Area: " + this.calculateArea() + "   Perimeter: " + this.calculatePerimeter();
	}
	
}
