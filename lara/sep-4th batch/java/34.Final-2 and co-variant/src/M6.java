class A
{
	final A()
	{
	}
}
class M6
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//constructer can't be final because they are not inheriting to subclass then what is the use of declaring cons as final
//constructer should not be static because--
//constructers are for initializing object members which are non static.wo can't declare caons as static
//constructer can't be abstract because constructer is not implementing anywhere as it not inheriting to subclass
//cons should not be final as already they are not inheriting to subclass then we achieve nothing by declaring cons as final

//for avoiding overriding we use final
