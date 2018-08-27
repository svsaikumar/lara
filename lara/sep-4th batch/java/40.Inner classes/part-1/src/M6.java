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
	Employee(String name, Job[] jobs)
	{
		this.name = name;
		this.jobs = jobs;
	}
	
	Iterator getIterator()
	{
		Iterator it = new Iterator(jobs);
		return it;
	}
	static class Iterator
	{
		private Job[] jobs;
		private static int index;
		Iterator(Job[] jobs)
		{
			this.jobs = jobs;
		}
		boolean hasNext()
		{
			return index < jobs.length;
		}
		Job nextJob()
		{
			return jobs[index ++];
		}
	}//ending iterator
}//ending employee

class M6
{
	public static void main(String[] args) 
	{
		Job j1 = new Job("software", 50000);
		Job j2 = new Job("hardware", 25000);
		Job j3 = new Job("hr", 15000);
		Job[] jobs = {j1, j2, j3};
		Employee e1 = new Employee("vijay", jobs);
		Job job;
		Employee.Iterator obj = e1.getIterator();
		while(obj.hasNext())
		{
			job = obj.nextJob();
			System.out.println(job.title + ":" + job.salary);
		}
		System.out.println("=================");
		obj = e1.getIterator();

		while(obj.hasNext())
		{
			job = obj.nextJob();
			System.out.println(job.title + ":" + job.salary);
		}
		System.out.println("=================");
	}
}
//for inner calsses also class file will be generated(for every class, class file will generate)
//we can declare inner class as static,private, protected,public default
//Job, employee, M6 classes are member of java file so they can't be private , protected and static
//outer classes can't be static
//static key word should be used only for members of class
//inner classes can have any access level
//if we want to develop any static members inside inner class, then that class should be static
//inner class can be static or non static-static inner classes and non-static inner classs
//static inner class can be using any where in the currrent class(methods, cons, SIB, IIB...etc)
//static members are considered as univsersal members
//non static inner class can be used in any non-static, if we want to use it in static, we have to use throuogh a reference variable
//if we want ot develop any static members in inner class, then that inner class should be declared as static
//inside the body of non static inner class, we can't develop 
//non static inner class can't be used in static members directly
//static inner class can be used any where in the current class
//any class can be used anywhere if the usage is data type usage(derived data type purpose)(it can be static or non static)