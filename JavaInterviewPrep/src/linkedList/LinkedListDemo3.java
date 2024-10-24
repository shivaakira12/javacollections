package linkedList;

import java.util.LinkedList;

public class LinkedListDemo3 {
	public static void main(String[] args) {
		/*
		 * Linked List regarding of Stack and Queue
		 */
		LinkedList<String> brands = new LinkedList<>();
		brands.add("PUMA");
		brands.add("ADIDAS");
		brands.add("DECLATHON");
		brands.add("JOCKEY");
		System.out.println("Added Brands" + brands);
		// Adding the new elements at first and last position
		brands.addFirst("NIKE");
		brands.addLast("CROCS");
		System.out.println("Newly Added Brands" + brands);// Newly Added Brands[NIKE, PUMA, ADIDAS, DECLATHON, JOCKEY,
															// CROCS]
		// removing the first and last position elements
		brands.removeFirst();
		brands.removeLast();
		System.out.println("After Removed First and Last Positions" + brands);// [PUMA, ADIDAS, DECLATHON, JOCKEY]
		// getting the first and last elements
		System.out.println("First and Lsat element access " + brands.getFirst() + " " + brands.getLast());// PUMA JOCKEY
	}
}
