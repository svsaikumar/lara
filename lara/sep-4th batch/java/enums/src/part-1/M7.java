//package pack1;
class M7
{
	public static void main(String[] args)
	{
		Calendar.Month[] months = Calendar.Month.values();
		for (Calendar.Month month : months)
		{
			System.out.println(month+";"+month.ordinal());
		}
	}
}

/* output : JAN;0
FEB;1
MAR;2
APR;3
MAY;4
JUN;5
JUL;6
AUG;7
SEP;8
OCT;9
NOV;10
DEC;11
*/
