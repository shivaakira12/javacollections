package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		// Declaring the LinkedList
		LinkedList ll = new LinkedList();
		// Add elements into LinkedList
		ll.add(null);
		ll.add("Shiva");
		ll.add('M');
		ll.add(100);
		ll.add(true);
		System.out.println(ll);// [null, Shiva, M, 100, true]

		/*
		 * 1) Null Insertion is allowed,2) Homongenous data got added,3) Insertion order
		 * is preserved
		 */

		// find size of LinkedList
		System.out.println(ll.size());// 5

		// remove
		ll.remove(); // if we are not specifing the index by default it will remove the 0th index.
		ll.remove(2); // removes the value present at second index
		System.out.println(ll);// [Shiva, M, true]

		// retrieving the values/object
		System.out.println(ll.get(1));// M

		// change value at specified index
		ll.set(1, 'F');
		System.out.println(ll);// [Shiva, F, true]

		// contains()
		System.out.println(ll.contains('M'));// false
		System.out.println(ll.contains('F'));// true
		
		//isEmpty()
		System.out.println(ll.isEmpty());//false
		
		// Reading the values using loops
		// ==> Normal For Loop
		for(int i =0;i<ll.size();i++) {
			System.out.println(ll.get(i));//Shiva F true
		}
		// ==> For Each loop
		for(Object e : ll) {
			System.out.println(e);//Shiva F true
		}
		//==> Iterator method
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());//Shiva F true
		}

	}
}
