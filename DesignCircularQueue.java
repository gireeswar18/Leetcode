package leetcode;

public class DesignCircularQueue {

	public static void main(String[] args) {

	}

}

class MyCircularDeque {
	
	int maxSize;
	Node head;
	Node tail;
	int size;
	
	class Node {
		int val;
		Node next;
		Node prev;
		
		public Node() {
			
		}
		
		public Node(int val) {
			this.val = val;
		}
		
		
		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	public MyCircularDeque(int k) {

		head = null;
		tail = null;
		maxSize = k;
		size = 0;

	}

	public boolean insertFront(int value) {

		if (size == maxSize) return false;
		
		Node node = new Node(value);
		
		if (head == null) {
			head = node;
			tail = node;
		}
		else {
			node.next = head;
			head.prev = node;
			head = node;
		}
		
		size++;
		return true;

	}

	public boolean insertLast(int value) {
		
		if (size == maxSize) return false;
		
		Node node = new Node(value);
		
		if (head == null) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		
		size++;
		return true;
	}

	public boolean deleteFront() {

		if (size == 0) return false;

		if (head == tail) {
			head = null;
			tail = null;
		}
		else {
			Node temp = head;
			head.next.prev = null;
			head = head.next;
			temp.next = null;
		}
		size--;
		return true;

	}

	public boolean deleteLast() {
		
		if (size == 0) return false;

		if (head == tail) {
			head = null;
			tail = null;
		}
		else {
			Node temp = tail;
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		
		size--;
		return true;

	}

	public int getFront() {
		
		if (size == 0) return -1;

		return head.val;
	}

	public int getRear() {
		if (size == 0) return -1;

		return tail.val;
	}

	public boolean isEmpty() {
		
		return size == 0;
		
	}

	public boolean isFull() {
		
		return size == maxSize;
	}
}