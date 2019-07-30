//Andre Barajas 
//Alex Philayvanh
//Anthony Diaz
//Brandon Mitchell
//Cecs 328
//Summer 2018
//This program is used to implement and test a Binary Search Tree Data Str.

import java.util.Stack;

// This class will construct the tree data structure and provide functionality for it.
public class BsearchTree 
{
	private Node root;

	public BsearchTree() {
		root = null;
	}

	// Default Const.
	// Recursive implementation with big o of logn run time.

	public Node find(String key) {
		if (root != null)
			return root.find(key);
		return null;
	}
	
		// Function to insert string objects.
	public void insert(String data) {
		if (root == null)
			this.root = new Node(data);
		else
			root.insert(data);
	}

	public int height() {
		if (root != null) {
			return root.height();
		} else {
			return 0;
		}

	}

	public int size() {
		return (size(root));
	}

	private int size(Node node) {
		if (node == null) {
			return (0);
		} else {
			return (size(node.leftC) + 1 + size(node.rightC));
		}
	}

	public String minimum() {
		Node current = root;

		/* loop down to find the leftmost leaf */
		while (current.leftC != null) {
			current = current.leftC;
		}
		return (current.fName);
	}

	public String maximum() {
		Node current = root;

		/* loop down to find the rightmost leaf */
		while (current.rightC != null) {
			current = current.rightC;
		}
		return (current.fName);
	}

	public void deleteKey(String key) {
		root = deleteRec(root, key);
	}



	/* A recursive function to insert a new key in BST */
	Node deleteRec(Node root, String fName) {
		/* Base Case: If the tree is empty */
		if (root == null) {
			return root;
		}
		/* Otherwise, recur down the tree */
		if (fName.compareTo(root.fName) == -1) // if (fName < root.fName)
			root.leftC = deleteRec(root.leftC, fName);

		else if (fName.compareTo(root.fName) == 1) // else if (fName > root.fName)
			root.rightC = deleteRec(root.rightC, fName);

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
			// node with only one child or no child
			if (root.leftC == null)
				return root.rightC;
			else if (root.rightC == null)
				return root.leftC;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.fName = minimum(); //root.rightC parameter was in here

			// Delete the inorder successor
			root.rightC = deleteRec(root.rightC, root.fName);
		}

		return root;
	}

	// Function to display a current state of the tree in a diagram format
	public void displayTree() {
		Stack higherStack = new Stack();
		higherStack.push(root);
		int space = 32;
		boolean isRowEmpty = false;

		System.out.println("\t\t********Current Binary Search Tree********");
		while (isRowEmpty == false) {
			Stack lowerStack = new Stack();
			isRowEmpty = true;

			for (int j = 0; j < space; j++)
				System.out.print(' ');

			while (higherStack.isEmpty() == false) {
				Node temp = (Node) higherStack.pop();
				if (temp != null) {
					System.out.print(temp.fName);
					lowerStack.push(temp.leftC);
					lowerStack.push(temp.rightC);

					if (temp.leftC != null || temp.rightC != null)
						isRowEmpty = false;
				} else {
					System.out.print("--");
					lowerStack.push(null);
					lowerStack.push(null);
				}
				for (int j = 0; j < space * 2 - 2; j++)
					System.out.print(' ');
			} // end while globalStack not empty

			System.out.println();
			space /= 2;
			while (lowerStack.isEmpty() == false)
				higherStack.push(lowerStack.pop());
		}

		System.out.println("*****************************************************");
	} // end displayTree Function
   
   public int subTree(Node current) {
      if (current == null)
         return 0;
      else {
         // 
         int lTree = subTree(current.leftC);
         int rTree = subTree(current.rightC);
         
         //Use the larger one
         if (lTree > rTree)
            return lTree + 1;
         else
            return rTree + 1;
      }
   }
}
// end BsearchTree class