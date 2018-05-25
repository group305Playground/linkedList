/**
 * 
 */
package com.group305.Main;

import com.group305.LinkedList.*;

/**
 * @author marcus02
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
		LinkedList x = new LinkedList();
		
		x.addToHead("World");
		x.addToHead("Hello");
		System.out.println(x.toString());
		
		x.clear();
		System.out.println(x.toString());
		x.addToHead("World");
		x.addToHead("Hello");
		System.out.println(x.toString());
		
	}

}
