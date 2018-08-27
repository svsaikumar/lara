package pack1;
enum Education
{
	BSC(3),MSC(2),MCA(3),ME(2);
	// for that constant we have to provide constractor
	int years;
	Education(int years)
	{
		System.out.println(this+":"+years);
		this.years=years;
		// inside a enum not only constant we can develop atribute,constarctor,methods
	}
	int getYears()
	{
		return years;
	}
}
// every enum should have a constactor ,, if we not providig a constarctor complier prioviding a constractor with no arg
//every constat take  one argument (or)require argument constactor
