class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//morethan one task running simultaneiusly at a time is multi-tasking
/* there are 2 types of multitasking
	-multi processing 
	-multi threading


			multi processing
				-multiple processors executing simultaneously to produce multi tasking
				-every process is independent
				-processors executing only one process at a time
				-processor switching from one process to another process is very fast
				-multi processing is a heavy weight process

			multi threading
				-in one process executing multiple threads simultaneously
				-under one process executing multiple blocks simultaneously
				-multi-threading is light weight process
				-in java there are 2 ways of creating multiple threads
						-by extending thread class
						-by implementing runnable interface