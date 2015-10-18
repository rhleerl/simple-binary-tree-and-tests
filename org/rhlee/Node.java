package org.rhlee;

public class Node {
	public Node leftNode;
	public Node rightNode;
	public int value;

	public Node(int value, Node leftNode, Node rightNode) {
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public Node(int value) {
		this(value, null, null);
	}
}