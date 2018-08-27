class M20a 
{
	static class Node
	{
		int value;
		Node left;
		Node right;
		Node(int value)
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
				System.out.println("inserted "+value + "to the left of "+ node.value);
				node.left = new Node(value);
			}
		}
		else
		{
			if(node.right != null)
			{
				insert(node.right, value);
			}
			else
			{
				System.out.println("inserted "+value + "to the right of "+ node.value);
				node.right = new Node(value);
			}
		}
	}
	public static void printInorder(Node node)
	{
		if(node != null)
		{
			printInorder(node.left);
			System.out.print(node.value+" ");
			printInorder(node.right);
		}
	}
	public static void main(String[] args) 
	{
		Node root = new Node(5);
		insert(root,1);
		insert(root,6);
		insert(root,4);
		insert(root,8);
		insert(root,3);
		insert(root,7);
		printInorder(root);
		System.out.println("Hello World!");
	}
}
