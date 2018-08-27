//package pack1;
class M10
{
	public static void main(String[] args)
	{


		System.out.println("main begin");
		Education e1=Education.BSC;
		System.out.println(e1);
		System.out.println(e1.years);
		System.out.println(e1.getYears());
		 Education e2  = new Education(BSC);
	/* output : main begin
BSC:3
MSC:2
MCA:3
ME:2
BSC
3
3
main end  */
		System.out.println("main end");
	}
}

// class is a enum 
// output : main begin
//			BSC:3
//			MSC:2
//			MCA:3
//			ME:2
//			BSC
//			main end
