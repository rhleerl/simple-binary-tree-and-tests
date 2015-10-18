package org.rhlee;

public class BinaryTree {
	public Node rootNode;
	
	public BinaryTree(Node rootNode) {
		this.rootNode = rootNode;
	}

	public BinaryTree() {
		this(null);
	}

	public void addNode(Node node) {
		if(rootNode == null) {
			rootNode = node;
			return;
		}

		Node traversalNode = rootNode;

		while(traversalNode.value < node.value || traversalNode.value > node.value) {
			if(traversalNode.value < node.value) {
				if(traversalNode.rightNode != null) {
					traversalNode = traversalNode.rightNode;
				}
				else {
					traversalNode.rightNode = node;
					return;
				}
			}

			if(traversalNode.value > node.value) {
				if(traversalNode.leftNode != null) {
					traversalNode = traversalNode.leftNode;
				}
				else {
					traversalNode.leftNode = node;
					return;
				}
			}
		}

	}

	public static void printBinaryTreeNaturalOrder(Node node) {
		if(node.leftNode != null) {
			printBinaryTreeNaturalOrder(node.leftNode);
		}

		System.out.println(node.value);

		if(node.rightNode != null) {
			printBinaryTreeNaturalOrder(node.rightNode);
		}
	}

	public static void main(String [] args) {
		BinaryTree bt = new BinaryTree(new Node(10));

		// bt.addNode(new Node(12));
		// bt.addNode(new Node(11));
		// bt.addNode(new Node(7));
		// bt.addNode(new Node(8));
		// bt.addNode(new Node(11));

		// BinaryTree.addNodeRecursive(bt.rootNode, new Node(9));
		// BinaryTree.addNodeRecursive(bt.rootNode, new Node(13));

		// BinaryTree.printBinaryTreeNaturalOrder(bt.rootNode);

		// for(int i = 0; i < 1000000; i++) {
		// 	//bt.addNode(new Node(i));

			
			// added 0 nodes.
			// added 10000 nodes.
			// added 20000 nodes.
			// added 30000 nodes.
			// Exception in thread "main" java.lang.StackOverflowError
			
		// 	bt.addNodeRecursive(bt.rootNode, new Node(i));

		// 	if(i % 10000 == 0) {
		// 		System.out.println("added " + i + " nodes.");
		// 	}
		// }
	}
}