class M50
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer(500);
		sb.append("abc");
		sb.append("abc");
		sb.append("abc");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}
//here buffer size is 500 initially
//we can specify initial buffer size