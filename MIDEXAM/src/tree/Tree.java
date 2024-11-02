package tree;

/** Binary trees with nodes labelled by integers */
public class Tree {
	private int root;
	private Tree left, right;

	/** Creates a new instance of Tree: a branch */
	public Tree(int root, Tree left, Tree right) {
		this.root = root;
		this.left = left;
		this.right = right;
	}

	/**
	 * Creates a new instance of Tree: a leaf (a special case
	 * of the above) */
	public Tree(int root) {
		this.root = root;
		this.left = null;
		this.right = null;
	}

	/** Sample method: Mirror myself */
	public void mirror() {
		if (left != null) { // Left branch, please mirror yourself
			left.mirror();  // This works by delegation
		}
		if (right != null) { // Right branch, please mirror yourself
			right.mirror();  // This works by delegation
		}
		Tree originalLeft = left; // Swap the branches, mirror myself
		left = right;
		right = originalLeft;
	}
	
	/**
	 * Converts a tree to an expression-tree string representation
	 */
	@Override
	public String toString() {
		String sleft, sright;

		// Convert the left and right branches to strings,
		// delegating the task to them if they exist.
		if (left == null) {
			sleft = "empty";
		} else {
			sleft = left.toString(); // Please do your job, Mr. Left Subtree.
		}
		if (right == null) {
			sright = "empty";
		} else {
			sright = right.toString(); // Please do your job, Mrs. Right Subtree.
		}
		// Now I do my own job:
		String s = "branch(" + root + "," + sleft + "," + sright + ")";
		return s;
	}

	/**
	 * Converts a tree to an expression-tree string representation (advanced)
	 */
	public String toStringAdv() {
		return this.toStringFrom(0);
	}
	public String toStringFrom(int depth) {
		int step = 4; // Depth step (number of spaces printed)

		// Delegate task to Mr. Left Subtree, if necessary:
		String sleft;
		if (left != null) {
			sleft = left.toStringFrom(depth + step);
		} 
		else {
			sleft = "";
		}
		// Delegate task to Mrs. Right Subtree, if necessary:
		String sright;
		if (right != null) {
			sright = right.toStringFrom(depth + step);
		} 
		else {
			sright = "";
		}
		// My own task now:
		String s = sright + spaces(depth) + root + "\n" + sleft;
		return s;
	}
	private String spaces(int n) {
		String s = "";
		for (int i = 0; i < n; i++) {
			s = s + " ";
		}
		return s;
	}

	// 2
	public void triple() {
		
		//  multiple by 3
		this.root *= 3;
		// check if not leaf
		if (this.left != null){
			this.left.triple();
		}
		// check if not leaf
		if (this.right != null){
			this.right.triple();
		}

		}

	
	// 3
	public void printDepthFirst() {
		// print root
		System.out.print(this.root + " ");
		
		// if leaf in left, recursivly call again
		if (this.left != null){
			this.left.printDepthFirst();
		}
		// if leaf in right, recursivly call again
		if (this.right != null){
			this.right.printDepthFirst();
		}

	}

	// 4
	public Tree createFreshCopy() {
		// Create a new Tree node with the same value as the current node
		Tree newNode = new Tree(this.root);
		
		// if leaf in left, recursivly call again
		if (this.left != null){
			newNode.left = left.createFreshCopy();
		}
		
		// if leaf in right, recursivly call again
		if (this.right != null){
			newNode.right = right.createFreshCopy();
		}

		// return new tree
		return newNode;
	}
		


	// 5
	public int saveDepthFirst(int a[], int whereToStart) {
		// initialize postion start
		int next = whereToStart;
		
		// Save the value of the current node (root) into the arra
		a[next] = this.root;
		
		// if leaf in left, recursively save its values and update the position
		if (this.left != null){
			next = left.saveDepthFirst(a, next + 1);
		}
		// if leaf in right, recursively save its values and update the position
		if (this.right != null){
			next = right.saveDepthFirst(a, next + 1);
		}
		// return next position
		return  next;

	}
	
	// 6
	public Tree find(int n) {
		// Check if the current node is a leaf or if it matches the target value
		if ((this.left == null && this.right == null) | this.root == n){
			return this; //return node if it match
		}
		// if the target value is greater than the current node value, search in the right subtree
		else if (this.root < n){
			return this.right.find(n);
		}
		// if the target value is less than the current node , search in the left subtree
		else{
			return this.left.find(n);
		}
	}
	
	// 7 
	public Tree insert(int n) {
		// if the value already exists, return the current node
		if (this.root == n){
			return this;
		}
		
		// if the new value is greater than the current node value
		if (this.root < n){

			// if there is no right child, create a new node and add it
			if (this.right == null){
				Tree add = new Tree(n);
				this.right = add;
			}
			// if there is a right child, recursively insert into the right subtree
			else{
			this.right = this.right.insert(n);
			// this.right.insert(n);
			}
		}
		 // if the new value is less than the current node value
		else{
			 // if there is no left child, create a new node and add it
			if (this.left == null){
				Tree add = new Tree(n);
				this.left = add;
			}
			// if there is a left child, recursively insert into the left subtree
			else{
			this.left= this.left.insert(n);
			// this.left.insert(n);
			}
		}
		 // Return the current node
		return this;
	}
}

