//Andre Barajas 
//Alex Philayvanh
//Anthony Diaz
//Brandon Mitchell
//Cecs 328
//Summer 2018
//This program is used to implement and test a Binary Search Tree Data Str.

public class BsTreeApp {
	public static void main(String[] args) {
		BsearchTree tree1 = new BsearchTree();

		// Problem 1b: Test each method
		System.out.println("inserting Apple...");
		tree1.insert("Apple");
		System.out.println("inserting Banana...");
		tree1.insert("Banana");
		System.out.println("inserting Carrot...");
		tree1.insert("Carrot");
		System.out.println("inserting Pineapple...");
		tree1.insert("Pineapple");
		System.out.println("inserting Orange...");
		tree1.insert("Orange");

		
		tree1.displayTree();
      
      System.out.println("\nFinding 'Apple':   " + tree1.find("Apple"));
      System.out.println("Finding 'Banana':  " + tree1.find("Banana"));
      System.out.println("Finding 'Carrot': " + tree1.find("Carrot"));
      System.out.println("Finding 'Pineapple':   " + tree1.find("Pineapple"));
      System.out.println("Finding 'Orange':   " + tree1.find("Orange"));

      System.out.println("\nLargest subtree at Node containing 'Apple':       " + tree1.subTree( tree1.find("Apple") ));
      System.out.println("Largest subtree at Node containing 'Banana':      " + tree1.subTree( tree1.find("Banana") ));
      System.out.println("Largest subtree at Node containing 'Carrot':      " + tree1.subTree( tree1.find("Carrot") ));
      System.out.println("Largest subtree at Node containing 'Pineapple':   " + tree1.subTree( tree1.find("Pineapple") ));
      System.out.println("Largest subtree at Node containing 'Orange':      " + tree1.subTree( tree1.find("Orange") ));
		
		System.out.println("\nTree height: " + tree1.height());
		System.out.println("Tree size: " + tree1.size());
		System.out.println("Minimum: " + tree1.minimum());
		System.out.println("Maximum: " + tree1.maximum());
		System.out.println("Find Banana: " + tree1.find("Banana")); //current find function returns a node, should we change it to return a boolean or the value itself for testing purposes? 
		//System.out.println("First Binary SubTree: " + subTree()); //must implement subTree() first.
		System.out.println("Deleting Banana...");
		tree1.deleteKey("Banana");
		
		//display final BST
		tree1.displayTree();
		
		
		
		// Problem 2 construct a BST from the following nodes: {"Joe", "Sarah", "Nate",
		// "Amy", "Bob", "Paul"}
		BsearchTree tree2 = new BsearchTree();
		System.out.println();
		System.out.println();
		System.out.println("PROBLEM 2");
		System.out.println("inserting Joe...");
		tree2.insert("Joe");
		System.out.println("inserting Sarah...");
		tree2.insert("Sarah");
		System.out.println("inserting Nate...");
		tree2.insert("Nate");
		System.out.println("inserting Amy...");
		tree2.insert("Amy");
		tree2.displayTree();
		System.out.println("inserting Bob...");
		tree2.insert("Bob");
		tree2.displayTree();
		System.out.println("inserting Paul...");
		tree2.insert("Paul");
		tree2.displayTree();
      
      System.out.println("\nFinding 'Bob':   " + tree2.find("Bob"));
      System.out.println("Finding 'Paul':  " + tree2.find("Paul"));
      System.out.println("Finding 'Sarah': " + tree2.find("Sarah"));
      System.out.println("Finding 'Bob':   " + tree2.find("Joe"));
      
      System.out.println("\nLargest subtree at Node containing 'Joe':   " + tree2.subTree( tree2.find("Joe") ));
      System.out.println("Largest subtree at Node containing 'Sarah': " + tree2.subTree( tree2.find("Sarah") ));
      System.out.println("Largest subtree at Node containing 'Nate':  " + tree2.subTree( tree2.find("Nate") ));
      System.out.println("Largest subtree at Node containing 'Amy':   " + tree2.subTree( tree2.find("Amy") ));
      System.out.println("Largest subtree at Node containing 'Bob':   " + tree2.subTree( tree2.find("Bob") ));
      System.out.println("Largest subtree at Node containing 'Paul':  " + tree2.subTree( tree2.find("Paul") ));

	}
}// End application