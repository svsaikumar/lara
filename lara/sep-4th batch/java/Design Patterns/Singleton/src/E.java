










class E
{
	private static E obj = null;
	private E()
	{

	}
	public static E getObject()
	{
		if(obj == null)
		{
			//2 threads
			synchronized(E.class)
			{
				if(obj == null)
				{	
					obj = new E();
				}
			}
		}	
		return obj;
	}
}
//if block executed only for first time ,second time onwards if block is not executing
//2 steps verfication