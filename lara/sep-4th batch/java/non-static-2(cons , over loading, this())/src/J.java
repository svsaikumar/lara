class J 
{
	int x = 10;


	J()
	{
		System.out.println("J():" + x);
		x = 20;//compiler replaces this line as "this.x" as constructer is also a non-static definitin block
	}

	public static void main(String[] args) 
	{
		J j1 = new J();
		System.out.println("main:" + j1.x);
	}
}
//constructers is  also non-static definition  blocks
//every non-static member loads to the memory while object is created