package org.rhlee;

import org.junit.*;
import static org.junit.Assert.*;

public class BinaryTreeUtilTest {

	@Test 
	public void should_recursively_add_nodes_to_binary_tree() {
		BinaryTree bt = new BinaryTree(new Node(13));
		Node leftChild = new Node(7);
		Node rightChild = new Node(20);
		Node rightLeftChild = new Node(15);

		BinaryTreeUtil.addNodeRecursive(bt.rootNode, leftChild);
		BinaryTreeUtil.addNodeRecursive(bt.rootNode, rightChild);
		BinaryTreeUtil.addNodeRecursive(bt.rootNode, rightLeftChild);

		assertSame(leftChild, bt.rootNode.leftNode);
		assertSame(rightChild, bt.rootNode.rightNode);
		assertSame(rightLeftChild, bt.rootNode.rightNode.leftNode);
	}
}