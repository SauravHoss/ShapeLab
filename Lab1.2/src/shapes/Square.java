package shapes;

public class Square extends Rectangle 
{
	private int side;

	public Square(int side) 
	{
		super(side, side);
		this.side = side;
	}
	
	public double calculateareaperi() 
	{
		return(Math.pow(side, 2));
	}

	public double calculateArea() 
	{
		// To be written by student
		return (Math.pow(side, 2));
	}

	public double calculatePerimeter() 
	{
		// To be written by student
		return (side * 4);
	}
	
	@Override
	public String toString() 
	{
		// To be written by student
		return  "Square- \n" + "   Side Length: " + side + "   Area: " + calculateArea() + "   Perimeter: " + calculatePerimeter();
	}

}
