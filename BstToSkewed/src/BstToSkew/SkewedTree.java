package BstToSkew;

public class SkewedTree {
	int value;
	SkewedTree left;
	SkewedTree right;
	
	
	static SkewedTree newNode(int data) {
		SkewedTree temp = new SkewedTree();
		temp.value = data;
		temp.right = null;
		temp.left = null;
		
		return temp;				
	}
	public SkewedTree insert(SkewedTree root, int value) {
		if(root == null) {
			return newNode(value);
		}
		if(value<root.value) {
			root.left = insert(root.left , value);
			
		}else {
			root.right = insert(root.right , value);
			
		}
		return root;
	}
	
	void printInorder(SkewedTree node)
    {
        if (node == null)
            return;
 
        // First recur on left child
        printInorder(node.left);
 
        // Then print the data of node
        System.out.print(node.value + " ");
 
        // Now recur on right child
        printInorder(node.right);
    }
 
	
	
	public static void main(String[]args) {
		SkewedTree root = null;
		SkewedTree n = new SkewedTree();
		
		root = n.insert(root,44);
		
		root = n.insert(root,67);
		
		root = n.insert(root,29);
		
		root = n.insert(root,76);
		
		root = n.insert(root,55);
		
		root = n.insert(root,31);
		
		root = n.insert(root,10);
		
		root = n.insert(root,15);
		n.printInorder(root);
		
		
		
		
		
	}
	

}
