class ShapeFactory 
{
	public static Shape getShape(String shapeType)
	{
		if(shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();
		}
		return null;
	}
}
//factroy design patterm = creating ojects to different classes of same type
//factorymethod is getShape() method
//all the classes should be subtype to achieve factotydesignpattern