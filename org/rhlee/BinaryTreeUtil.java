package org.rhlee;

public class BinaryTreeUtil {
	public static void addNodeRecursive(Node treeNode, Node nodeToAdd) {
		if(treeNode.value > nodeToAdd.value) {
			if(treeNode.leftNode != null) {
				addNodeRecursive(treeNode.leftNode, nodeToAdd);
			}
			else {
				treeNode.leftNode = nodeToAdd;
			}
		}
		else if(treeNode.value < nodeToAdd.value) {
			if(treeNode.rightNode != null) {
				addNodeRecursive(treeNode.rightNode, nodeToAdd);
			}
			else {
				treeNode.rightNode = nodeToAdd;
			}
		}
	}
}