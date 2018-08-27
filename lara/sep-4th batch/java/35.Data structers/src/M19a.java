class Node
{
	int value;
	Node leftChild;
	Node rightChild;
	Node(int value)
	{
		this.value = value;
	}
}
class Tree
{
	Node root;
	void add(int value)
	{
		Node newNode = new Node(value);
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			Node focusNode = root;
			Node parent;
			while(true)
			{
				parent = focusNode;	
				if(value < focusNode.value)
				{
					focusNode = focusNode.leftChild;
					if(focusNode == null)
					{

						parent.leftChild = newNode;
						return;
					}
				}
				else
				{
					focusNode = focusNode.rightChild;
					if(focusNode == null)
					{

						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	void inorder(Node focusNode)
	{
		if(focusNode != null)
		{
			inorder(focusNode.leftChild);
			System.out.print(focusNode.value+" ");
			inorder(focusNode.rightChild);
		}
	}
	
}
class M19a 
{
	public static void main(String[] args) 
	{
		Tree tree = new Tree();
		tree.add(50);
		tree.add(25);
		tree.add(15);
		tree.add(35);
		tree.add(60);
		tree.add(70);
		tree.inorder(tree.root);
		System.out.println("Hello World!");
	}
}
