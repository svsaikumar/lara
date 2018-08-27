public class P1
{
	static class Node
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
				insert(node.left, value);
			}
			else
			{
				System.out.println("inserted " + value +"to the left of "+ node.value);
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
				System.out.println("inserted " + value +"to the right of "+ node.value);
				node.right = new Node(value);
			}
		}
	}
	public static void printInOrder(Node node)
	{
		if(node != null)
		{
			printInOrder(node.left);
			System.out.println("traversed value"+node.value);
			printInOrder(node.right);
		}
	}
	public static void main(String[] args) 
	{
		Node root = new Node(5);
		insert(root,1);
		insert(root,10);
		insert(root,5);
		insert(root,2);
		printInOrder(root);
		System.out.println("Hello World!");
	}
}
