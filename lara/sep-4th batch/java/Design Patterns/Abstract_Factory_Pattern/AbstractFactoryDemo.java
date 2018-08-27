public class AbstractFactoryDemo 
{
	public static void main(String[] args) 
	{
		AbstractFactory factory1 = FactoryProducer.getFactory("shape");
		Shape s1 = factory1.getShape("circle");
		s1.draw();
		System.out.println("----------");



		AbstractFactory factory2 = FactoryProducer.getFactory("color");
		Color c1 = factory2.getColor("red");
		c1.fill();
		System.out.println("----------");
	}
}
//factory produces elements
//abstractfactory produces factory