
public class BinaryTree {
	
	Node root;
	
	public void inOrder(Node focusNode)
	{
		if(focusNode != null)
		{
			inOrder(focusNode.leftChild);
			System.out.println(focusNode);
			inOrder(focusNode.rightChild);
			
		}
	}
	
	public void postOrder(Node focusNode)
	{
		if(focusNode != null)
		{
			postOrder(focusNode.leftChild);
			postOrder(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
	
	public void preOrder(Node focusNode)
	{
		if(focusNode != null)
		{
			System.out.println(focusNode);
			preOrder(focusNode.leftChild);
			preOrder(focusNode.rightChild);
			
		}
	}
	
	
	public void addNode(int key, String name)
	{
		Node newNode = new Node(key,name);
		
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
				if(key < focusNode.Key)
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

	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.addNode(50, "root");
		tree.addNode(25, "vp");
		tree.addNode(15, "o.m");
		tree.addNode(30, "sales");
		tree.addNode(75, "s.m");
		tree.addNode(85, "s.m2");
		
		tree.inOrder(tree.root);
		System.out.println("");
		tree.preOrder(tree.root);
		System.out.println("");
		tree.postOrder(tree.root);
	}
	
	class Node
	{
		int Key;
		String name;
		Node leftChild;
		Node rightChild;
		
		Node(int Key, String name)
		{
			this.Key = Key;
			this.name = name;
		}
		
		public String toString()
		{
			return name + " has a key " + Key;
		}
	}

}
