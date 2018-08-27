package pack1;
class M11
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		Education e1=Education.MCA;
		System.out.println(e1);
		System.out.println("main end");
	}
}
// while loading enum constant into the memory corresponding constractor is excuting
// Education loading into the memory ,, every static constant is enum by default
// every enum can considered as a object

// output : main begin
//			BSC:3
//			MSC:2
//			MCA:3
//			ME:2
//			MCA
//			main end
