package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {

		/*
		 * Declaring the Array List Represent the Integer Wrapper class
		 */
		ArrayList al = new ArrayList();
		ArrayList<Integer> integerValues = new ArrayList<Integer>();
		ArrayList<String> stringValues = new ArrayList<String>();
		/*
		 * Adding the heterogeneous data into the arraylist
		 */
		al.add(100);
		al.add("welcome");
		al.add(10.5);
		al.add('A');
		al.add(true);
		System.out.println(al); // [100, welcome, 10.5, A, true]

		// finding the size of the ArrayList
		System.out.println("Size of ArrayList al is = " + al.size());// Size of ArrayList al is = 5
		// removing the value based on the index
		System.out.println("Removing the 100 from ArrayList = " + al.remove(1));// Removing the 100 from ArrayList =
																				// welcome
		// ArrayList after removing the 1st index
		System.out.println("After removing 1st index from arraylist " + al);// After removing 1st index from arraylist
																			// [100, 10.5, A, true]
		// inserting new element at particular index let say 1st index
		al.add(1, "Shiva");
		System.out.println("After adding 1st index into arraylist " + al);// After adding 1st index into arraylist [100,
																			// Shiva, 10.5, A, true]
		// retrieve specific index
		System.out.println("value at index 3 = " + al.get(3));// value at index 3 = A

		// change element/replace
		al.set(1, "Akira");
		System.out.println(al);// [100, Akira, 10.5, A, true]

		// search - contains() - return true/false
		System.out.println(al.contains("Shiva"));// false
		System.out.println(al.contains("Akira"));// true

		// isEmpty
		System.out.println(al.isEmpty());// false

		/*
		 * Different ways to iterate the ArrayList
		 */

		// 1) For loop
		System.out.println("Reading the elements using for-loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.print(" " + al.get(i));// 100 Akira 10.5 A true
		}
		System.out.println();
		// 2) For-each loop
		System.out.println("Reading the elements using for-each-loop");
		for (Object e : al) {
			System.out.print(" " + e);// 100 Akira 10.5 A true
		}
		// 3) Iterator method
		System.out.println();
		System.out.println("Reading the elements using iterator method");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.print(" " + it.next()); // 100 Akira 10.5 A true
		}

	}

}
