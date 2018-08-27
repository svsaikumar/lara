class FactoryPatternDemo 
{
	public static void main(String[] args) 
	{



		Shape shape1 = ShapeFactory.getShape("circle");
		shape1.draw();
		System.out.println("===========");
		Shape shape2 = ShapeFactory.getShape("square");
		shape2.draw();
		System.out.println("===========");
		Shape shape3 = ShapeFactory.getShape("rectangle");
		shape3.draw();
		System.out.println("===========");
	}
}
