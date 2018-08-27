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
	void insert(int value)
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
class M19c 
{
	public static void main(String[] args) 
	{
		Tree tree = new Tree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(10);
		tree.insert(60);
		tree.insert(20);
		tree.inorder(tree.root);
		System.out.println("Hello World!");
	}
}
