package org.rhlee;

import org.junit.*;
import static org.junit.Assert.*;

public class BinaryTreeTest {

	@Test
	public void should_have_left_and_right_child() {
		BinaryTree bt = new BinaryTree(new Node(4));
		Node leftChild = new Node(3);
		Node rightChild = new Node(7);
		bt.addNode(leftChild);
		bt.addNode(rightChild);

		assertSame(leftChild, bt.rootNode.leftNode);
		assertSame(rightChild, bt.rootNode.rightNode);
	}

	@Test
	public void should_insert_seven_children_in_order() {
		BinaryTree bt = new BinaryTree(new Node(4));
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);

		//insertions
		bt.addNode(two);
		bt.addNode(six);

		bt.addNode(one);
		bt.addNode(three);
		bt.addNode(five);
		bt.addNode(seven);


		assertSame(two, bt.rootNode.leftNode);
		assertSame(six, bt.rootNode.rightNode);

		assertSame(one, bt.rootNode.leftNode.leftNode);
		assertSame(three, bt.rootNode.leftNode.rightNode);
		assertSame(five, bt.rootNode.rightNode.leftNode);
		assertSame(seven, bt.rootNode.rightNode.rightNode);
	}

}