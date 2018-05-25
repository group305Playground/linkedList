/**
 * 
 */
package com.group305.LinkedList;

import java.util.*;



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

	public void clear() {
		this.head = null;
	}
	
	public boolean isEmpty() {
		if(this.head != null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void addToHead(Object data) {
		Node temp = this.head;
		head = new Node(data);
		head.setNext(temp);		
		this.length++;
	}
	
	public void addToTail(Object data) {
		Node temp = this.head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}		
		temp.setNext(new Node(data));
		this.length++;
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
	
	public String toString() {
		String output = "";
		
		Node temp = this.head;
		if(!this.isEmpty()) {
			while(temp.getNext() != null) {				
				output += '[' + temp.getData().toString() + ']' + "->";
				temp = temp.getNext();
			}		
			output += '[' + temp.getData().toString() + ']';
		} else {
			output = "[]";
		}

		
		return output;
	}	
}
