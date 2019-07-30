//Andre Barajas 
//Alex Philayvanh
//Anthony Diaz
//Brandon Mitchell
//Cecs 328
//Summer 2018
//This program is used to implement and test a Binary Search Tree Data Str.

//This class is a Node that carries references to no more than two other nodes( left chile and right C)
public class Node {
	String fName;
	String lName;
	Node leftC;
	Node rightC;

	public Node(String data) {
		this.fName = data;
	}

	public void displayNode() {
		System.out.print('(');
		System.out.print(fName);
		System.out.print(", ");
		System.out.print(lName);
		System.out.print(") ");
	}// End displayNode function

	public Node find(String data) {
		if (this.fName == data)
			return this;
		if ((int) data.charAt(0) < (int) this.fName.charAt(0) && leftC != null)
			return leftC.find(data);
		if (rightC != null)
			return rightC.find(data);
		return null;
	}

	public void insert(String data) {
		if ((int) data.charAt(0) >= (int) this.fName.charAt(0)) {
			if (this.rightC == null)
				this.rightC = new Node(data);
			else
				this.rightC.insert(data);
		} else {
			if (this.leftC == null)
				this.leftC = new Node(data);
			else 
				this.leftC.insert(data);

		}
	}

	public int height() {
		int hLeftSub = 0;
		int hRightSub = 0;
		if (this.leftC != null) {
			hLeftSub = this.leftC.height();
		}
		if (this.rightC != null) {
			hRightSub = this.rightC.height();
		}
		return Math.max(hLeftSub, hRightSub) + 1;
	}

   // Prints value of object from displayNode() function.
   @Override
   public String toString() {
      return this.fName;
   }

}// End Node class