package pack1;
class K
{
	public static void main(String[] args) 
	{
		int assert =10;
		System.out.println(assert);
	}
}
/*
E:\yamini\assert-ded\src>javac -d ../classes pack1/K.java
pack1\K.java:6: error: as of release 1.4, 'assert' is a keyword, and may not be
used as an identifier
                int assert =10;
                    ^
  (use -source 1.3 or lower to use 'assert' as an identifier)
pack1\K.java:7: error: as of release 1.4, 'assert' is a keyword, and may not be
used as an identifier
                System.out.println(assert);
                                   ^
  (use -source 1.3 or lower to use 'assert' as an identifier)
2 errors
E:\yamini\assert-ded\src>java -cp ../classes -ea pack1.K
10
*/
