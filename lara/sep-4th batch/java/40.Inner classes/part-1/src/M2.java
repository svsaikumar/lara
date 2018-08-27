class Job
{
	String title;
	double salary;
	Job(String title, double salary)
	{
		this.title = title;
		this.salary = salary;
	}
}
class Employee
{
	String name;
	Job[] jobs;
	private int index;
	Employee(String name, Job[] jobs)
	{
		this.name = name;
		this.jobs = jobs;
	}
	

	boolean hasNext()
	{
		if(index == jobs.length)
		{
			index = 0;
			return false;
		}
		return true;
	}
	Job nextJob()
	{
		return jobs[index ++];
	}
}
class M2
{
	public static void main(String[] args) 
	{
		Job j1 = new Job("software", 50000);
		Job j2 = new Job("hardware", 25000);
		Job j3 = new Job("hr", 15000);
		Job[] jobs = {j1, j2, j3};
		Employee e1 = new Employee("vijay", jobs);
		Job job;
		while(e1.hasNext())
		{
			job = e1.nextJob();
			System.out.println(job.title + ":" + job.salary);
		}
		System.out.println("=================");

		while(e1.hasNext())
		{
			job = e1.nextJob();
			System.out.println(job.title + ":" + job.salary);
		}
		System.out.println("=================");
	
	}
}
