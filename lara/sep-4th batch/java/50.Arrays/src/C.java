class C
{
	public static void main(String[] args) 
	{
		int[] x = new int[9];


		x[0] = 20;
		x[3] = 50;
		x[7] = 90;
		x[5] = 40;
		System.out.println(x.length);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[5]);
		System.out.println(x[8]);
	}
}
//for the accomodations which we didn't initilaze with any values contains default values based on the type of the array
//we can modify any accomodation
//every accomdation has a unique ID starting from '0'