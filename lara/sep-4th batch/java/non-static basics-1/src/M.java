class M
{
	void test()
	{
	}

	static 
	{
		M ref = new M();
		ref.test = 20;
	}
}
//while loading a class only statatic memnbers are loding but not  non static
//while object is creating then non static memnbers are loading
//non-static members can't be used witout a reference variable