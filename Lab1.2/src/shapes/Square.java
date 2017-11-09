package shapes;

public class Square extends Rectangle {

	int side;

	public Square(int side) 
	{
		super(side, side);
		this.side = side;
	}
	
	public double calculateareaperi() 
	{
		return(Math.pow(side, 2));
	}

	
	@Override
	public String toString() {
		// To be written by student
		return "Side Length: " + side;
	}

}
