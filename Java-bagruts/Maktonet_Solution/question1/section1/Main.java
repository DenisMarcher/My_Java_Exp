package tests.exams.internal._2022_03_29.question1.section1;

import java.util.ArrayList;

import utilities.adt.moe.BinNode;

public class Main {
	private static BinNode<Integer> createFalsyExample() {
		BinNode<Integer> result = new BinNode<Integer>(6);
		
		BinNode<Integer> tempNode = new BinNode<Integer>(9);
		result.setLeft(tempNode);
		tempNode.setRight(new BinNode<Integer>(15));
		
		tempNode = new BinNode<Integer>(8);
		result.setRight(tempNode);
		tempNode.setLeft(new BinNode<Integer>(1));
		
		return result;
	}
	private static BinNode<Integer> createTruthyExample() {
		BinNode<Integer> result = new BinNode<Integer>(6);
		
		BinNode<Integer> tempNode = new BinNode<Integer>(9);
		result.setLeft(tempNode);
		tempNode.setRight(new BinNode<Integer>(15));
		
		tempNode = new BinNode<Integer>(11);
		result.setRight(tempNode);
		tempNode.setLeft(new BinNode<Integer>(1));
		
		return result;
	}
	private static ArrayList<BinNode<Integer>> createData() {
		ArrayList<BinNode<Integer>> result = new ArrayList<BinNode<Integer>>();
		
		result.add(null);
		result.add(new BinNode<Integer>(null));
		result.add(createTruthyExample());
		result.add(createFalsyExample());
		
		return result;
	}
	private static void testSolution() {
		ArrayList<BinNode<Integer>> trees = createData();
		
		for (BinNode<Integer> tree : trees) {
			System.out.println(String.format("For tree %s, the tree is%s nice.", 
					tree, isNice(tree) ? "" : "n't"));
		}
	}
	public static boolean isNice(BinNode<Integer> tree) {
		boolean result = false;
		BinNode<Integer> leftChild, rightChild;
		
		if (tree == null) {
			result = true;
		} else if (tree.hasLeft() && tree.hasRight()) {
			// The node has 2 child nodes.
			leftChild = tree.getLeft();
			rightChild = tree.getRight();
			result = (leftChild.getValue() < rightChild.getValue()) && isNice(leftChild) && isNice(rightChild);
		} else if (tree.hasLeft()) {
			// The node has only a left child.
			leftChild = tree.getLeft();
			result = (leftChild.getValue() < tree.getValue()) && isNice(leftChild);
		} else if (tree.hasRight()) {
			// The node has only a right child.
			rightChild = tree.getRight();
			result = (tree.getValue() < rightChild.getValue()) && isNice(rightChild);
		} else {
			// The node (sub-tree) has no child nodes.
			result = true;
		}
		
		return result;
	}
	public static void main(String[] args) {
		testSolution();
	}
}