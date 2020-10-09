/*
 * Name: Christine Fryling 	
 * Instructor: Hayhurst
 * Date: November 21 2017
 * Assignment: Project 4 (Binary Search Trees)
 * Purpose: This project adds, removes, and searches a Binary Search Tree of nodes.
 */
package project4;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {

	// BinaryTree<E> tree;

	public BinarySearchTree() {
		super();
	}

	public BinarySearchTree(E root) {
		super(root);
	}

	public BinarySearchTree(E root, BinarySearchTree<E> left, BinarySearchTree<E> right) {
		super(root, left, right);
	}

	/**
	 * Inserts item where it belongs in the tree.
	 *
	 * @param item
	 *            The item to be inserted
	 * @return true If the item is inserted, false if the item was already in the
	 *         tree.
	 */
	public boolean add(E item) {
		return add(item, root);
	}

	public boolean add(E item, Node<E> root) {
		if (root == null) {
			root = new Node<E>(item);
			return true;
		} else if (item.equals(root.data)) {
			System.out.println("Item is already in tree.");
			return false;
		} else if (item.compareTo(root.data) > 0) {
			if (isLeaf(root)) {
				root.right = new Node<E>(item);
				return true;
			} else {
				return add(item, root.right);
			}
		} else {
			if (isLeaf(root)) {
				root.left = new Node<E>(item);
				return true;
			} else {
				return add(item, root.left);
			}
		}
	}

	/**
	 * Finds if the tree contains a certain item.
	 *
	 * @param target
	 *            the item we are searching for
	 * @return true or false, if the target is there or not
	 */
	public boolean contains(E target) {
		if (target == null) // if target is null
		{
			System.out.println("The target is null.");
			return false;
		}

		return postOrderTraverse().contains(target);
	}

	// TODO: Fill in the following block comment.
	/**
	 * Removes an item from the tree
	 *
	 * @param target
	 *            the item to be removed
	 * @return true or false depending if the item was removed
	 */
	public boolean remove(E target) {
		return remove(target, root);
	}

	public boolean remove(E target, Node<E> root) {
		if (root == null) {
			System.out.println("The tree is empty.");
			return false;
		} else if (target.compareTo(root.data) < 0) {
			return remove(target, root.left);
		} else if (target.compareTo(root.data) > 0) {
			return remove(target, root.right);
		} else if (target.equals(root.data)) {
			// if no kids
			if (isLeaf(root)) {
				root = null;
				return true;
			}
			// if one child
			else if (root.left != null && root.right == null) {
				root = root.right;
				root.right = null;
				return true;
			} else if (root.left == null && root.right != null) {
				root = root.left;
				root.left = null;
				return true;
			}
			// if 2 children
			else {
				root = root.left;
				root.left = null;
				return true;
			}
		} else {
			return false;
		}
	}

}
