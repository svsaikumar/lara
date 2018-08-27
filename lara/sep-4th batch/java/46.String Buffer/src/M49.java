

class M49
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
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
//trimToSize() = removing empty accomodations