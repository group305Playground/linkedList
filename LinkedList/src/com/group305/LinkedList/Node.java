package com.group305.LinkedList;

public class Node {
	private Node next;
	private Object data;
	
	public Node(Object data) {
		this.data = data;
		this.next = null;
	}
	
	/* Get and Set for data */
	public Object getData() { return this.data; }	
	public void setData(Object data) { this.data = data; }
	
	/* Get and set for next pointer */
	public Node getNext() { return this.next; }
	public void setNext(Node next) { this.next = next; }
}
