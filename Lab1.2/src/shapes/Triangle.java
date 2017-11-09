package shapes;

public class Triangle implements Shape

{
	private int base;
	private int height;

	public Triangle(int base, int height) 
	{
		this.base = base;
		this.height = height;
	}


	public double calculateArea() 
	{
		// To be written by student
		return (0.5 * (base * height));
	}


	public double calculatePerimeter() 
	{
		// To be written by student
		return ((2 * base) + (2 * height));
	}


	public String toString() 
	{
		return "Triangle- " + "Height: " + height + "Base: " + base + " Area: " + this.calculateArea() + " Perimeter: "
		+ this.calculatePerimeter();
	}

}
