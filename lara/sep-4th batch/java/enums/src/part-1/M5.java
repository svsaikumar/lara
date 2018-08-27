//package pack1;
class M5
{
	public static void main(String[] args)
	{
		Day[] days = Day.values();
		for (Day day : days)
		{
			System.out.println(day +";"+ day.ordinal());
		}
	}
}

// all the constant into one array
// ordinal is a another buliting method
// in case of enum constant order is maintain


// output : MON;0
//			TUE;1
//			WED;2
//			THR;3
//			FRI;4
//			SAT;5
//			SUN;6
