class K //class K extends Object//compiler will provide
{		//if any class doesn't have extensds then compiper will keep "extends Object" by default
		//"Object class" is one of the built in class 
	K()//k class constructer not available in L as initializlers do not involve in inheritance
	{
		//super(); by default compiler will create super()
		System.out.println("K()");
	}
}
class L extends K
{

	L()
	{
		//super(); by default compiler will create super()
		System.out.println("L()");
	}
	public static void main(String[] args) 
	{
		L obj1 = new L();
		System.out.println("===========");
		K obj2 = new K();
		System.out.println("===========");
	}
}
//while obj is creating to K , L constructer is not loading into the memory
//super class  cons is not inherititng to subclass
//intializers are for only particular class, not sub class
//initializers are not involving in inheritance
//the blocks which we are using for initialization purpose ,can't be involved in inheritance
//super class intializers are not inheriting to sub class
//super class cons are not inheriting to sub class
//super class IIB are not inheriting to sub class
//sub class cons giving call to super class constructer
//in every cons ,the first statement should be this() or super().if not, then compiler will create default super() with no args
/*	this();"this" stands for current class
	this(12);
	this(1,2);
	this(1,2, "abc");


	super();//"super" stands for super calss
	super(10);
	super(1,2);
	super(5, "abc");
	*/

//every class should have a min.one constructer and that constucter first statement should be this() or super().
//if not , then compiler will create a default no arg constructer
//every should have a extends class
//"Object class" is the super most class for every class
//every class is a subclass to Object class