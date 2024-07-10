public class Node <E>{
	private E element;	// an element stored at this node
	private Node <E> parent = null;	// a reference to the parent node, if any
	private Node <E> left = null;	// a reference to the left child, if any
	private Node <E> right = null;	// a reference to the right child, if any
	public Node (E e) {
		element = e;
	}
	public Node (E e, Node <E> above, Node<E> leftChild, Node<E> rightChild) {
		element = e;
		parent = above;
		left = leftChild;
		right = rightChild;
	}
	public E getElement() {
		return element;
	}
	public Node<E> getParent() {
		return parent;
	}
	public Node<E> getLeft() {
		return left;
	}
	public Node<E> getRight() {
		return right;
	}
	public void setElement(E e) {
		element = e;
	}
	public void setParent(Node<E> parentPosition) {
		parent = parentPosition;
	}
	public void setLeft(Node<E> leftChild) {
		left = leftChild;
	}
	public void setRight(Node<E> rightChild) {
		right = rightChild;
	}
}
