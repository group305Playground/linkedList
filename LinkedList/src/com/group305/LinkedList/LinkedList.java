/**
 * 
 */
package com.group305.LinkedList;



/**
 * @author marcus02
 *
 */
public class LinkedList {
	
	private Node head;
	private int length;
	
	public LinkedList() {
		// Create the head to initialize the list.
		this.setHead(null);
		this.setLength(0);
	}

	public boolean isEmpty() {
		if(this.head != null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void addToHead(Object data) {
		Node temp = head;
		head = new Node(data);
		head.setNext(temp);		
	}
	
	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	
}
