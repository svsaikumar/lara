public class ShapeFactory extends AbstractFactory
{
	public Shape getShape(String shapeType)
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
	public Color getColor(String colorType)
	{
		return null;
	}
}
//shapeFactory is subclass to abstractfactory