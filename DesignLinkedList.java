package leetcode;

public class DesignLinkedList {
	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList();
		l.addAtHead(1);
		l.addAtTail(3);
		l.addAtIndex(1, 2);
		System.out.println(l.get(1));
		l.deleteAtIndex(1);
		System.out.println(l.get(1));
	}
}

class MyLinkedList {

    Node head;
    Node tail;
    int size;

    class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        Node temp = head;

        while (temp != null && index-- > 0) {
            temp = temp.next;
        }

        return temp == null ? -1 : temp.val;
    }

    public Node getNode(int index) {
        Node temp = head;

        while (temp != null && index-- > 0) {
            temp = temp.next;
        }

        return temp;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            print();
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
        print();
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (tail == null) {
            head = node;
            tail = node;
            size++;
            print();
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
        print();
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;

        if (index == 0 || index < 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        Node node = new Node(val);

        Node old = getNode(index);
        node.prev = old.prev;
        node.next = old;
        old.prev.next = node;
        old.prev = node;
        size++;
        print();
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) return;

        if (index == 0 && size == 1) {
            head = null;
            tail = null;
            size--;
            print();
            return;
        }

        Node old = getNode(index);
        if (old == head) {
            head = head.next;
            head.prev = null;
        }
        else if (old == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        else {
            old.prev.next = old.next;
            old.next.prev = old.prev;
        }
        size--;
        print();
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
}

