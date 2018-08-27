import java.util.HashSet;
class M35 
{
	public static void main(String[] args) 
	{


		HashSet set= new HashSet();
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.size());
		System.out.println(set);
	}
}
//set
//not allow duplicates
//we can add duplicates(no CTE or RTE)-duplicates will not store inside the set
//
//using hashcode() method and equals() method 'set' identifies duplicates
//the main classes under 'set' are 'Hashset','Linkedhashset' and 'Treeset' 

//add() method return type in HashSet class is "boolean"
//here we didn't get any CTE or RTE if we supply duplicates, simply they are not added into the set and returns false
//in every wrapper hashocode() and equals() are overrided checking the content rather than the address(memory location)
//"HashSet" is able to identify the duplicates as hashocode() and equals() got overrided