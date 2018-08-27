package pack4;
class G
{
	public static void main(String[] args) 
	{

		F f1 = new F();
		//System.out.println(f1.j);
		System.out.println(f1.k);
	}
}
//inside F class j and k are available(as they are protected and public)
//protected and public members are inheriting to every subclass(eventhough it is different package)
//protected and public are inheriting to every subclass
//if inherited member is public we can also use it anywhere