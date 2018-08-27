public class M20 
{
	static class Node//static na,,,,so we can use in main method starightaway...
	{
		Node left;
		Node right;
		int value;
		public Node(int value)
		{
			this.value = value;
		}
	}
	public static void insert(Node node, int value)
	{
		if(value < node.value)
		{
			if(node.left != null)
			{
				insert(node.left,value);
			}
			else
			{
				System.out.println("Inserted " + value + " to the left of "+node.value);
				node.left = new Node(value);
			}
		}
		else if(value > node.value)
		{
			if(node.right != null)
			{
				insert(node.right, value);
			}
			else
			{
				System.out.println("Inserted " + value + " to the right of "+node.value);
				node.right = new Node(value);
			}
		}

	}
	public static void printInOrder(Node node)
	{
		if(node != null)
		{
			printInOrder(node.left);
			System.out.println("traversed "+node.value);
			printInOrder(node.right);
		}
	}
	public static void main(String[] args) 
	{
		Node root = new Node(5);
		insert(root,1);
		insert(root,8);
		insert(root,6);
		insert(root,3);
		insert(root,9);
		printInOrder(root);
	}
}
/*Inserted 1to the left of 5
Inserted 8to the right of 5
Inserted 6to the left of 8
Inserted 3to the right of 1
Inserted 9to the right of 8
traversed 1
traversed 3
traversed 5
traversed 6
traversed 8
traversed 9

Output completed (0 sec consumed) - Normal Termination*/