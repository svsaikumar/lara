class A 
{
	void test1()
	{
	}
	void test2() throws ClassNotFoundException
	{
	}
	void test3() throws NullPointerException
	{
	}
	void test4() throws CloneNotSupportedException
	{
	} 
	void test5() throws java.io.IOException
	{
	} 
	void test6() throws Exception
	{
	} 
}
//any method can be overrided without a "throws" in subclass
//any method can be overrided in subclass by choosing throws unchecked
//compiler worriying only with checked
//test1 can't  be overrided in the subclass by choosing throws checked
//test2 can be overrided in the subclass by choosing throws class not found exception(unchecked) or any subclass to class not found exception
//while overriding test3 we can't go for checked
//while overriding test4 we can go for throws clone not supperted exception we ant go for anyotehr checked exceptions
//while overriding test5 we can go for either IO exception or subclass to IO
//while overriding test6 we can go for any exception
//every checked exception is a subclass to exception
/*				throwable(semi-checked)
					|
				exception(semi-checked)
				    |
			CNSE(Clone),CNSF,IO exception,InterruptedE,Parse ex.,SQL(all are full cheched)
					|
				File not found ecxeption(all are full cheched)

*/