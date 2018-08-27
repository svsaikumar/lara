public class ColorFactory extends AbstractFactory
{
	public Shape getShape(String shapeType)
	{
		return null;
	}

	public Color getColor(String colorType)
	{
		if(colorType.equalsIgnoreCase("RED"))
		{
			return new Red();
		}
		else if(colorType.equalsIgnoreCase("GREEN"))
		{
			return new Green();
		}
		else if(colorType.equalsIgnoreCase("BLUE"))
		{
			return new Blue();
		}
		return null;
	}
}
//ColorFactory is a subclss to Abstrctfactory