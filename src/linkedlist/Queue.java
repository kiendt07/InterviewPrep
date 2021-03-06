package linkedlist;

public class Queue {
	private Node head;
	private Node tail;

	public Queue() {
		head = null;
		tail = null;
	}

	private class Node {
		Node next = null;
		Object data;
	}

	public void enqueue(Object data) {
		Node node = new Node();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			tail.next = node;
		}
		tail = node;
	}

	public Node dequeue() {
		try {
			Node ret = head;
			head = head.next;
			return ret;
		} catch (NullPointerException ex) {
			System.out.println("Nothing to dequeue");
			return null;
		}
	}

	public Node find(Object data) {
		Node tmp = this.head;
		while (tmp != null && tmp.data != data) {
			tmp = tmp.next;
		}
		return tmp;
	}

	public void clear() {
		this.head = null;
		this.tail = null;
	}

	public void printQueue() {
		Node tmp = this.head;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
}
