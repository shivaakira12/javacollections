package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");

		ArrayList<Integer> values = new ArrayList<>();
		values.add(8);
		values.add(0);
		values.add(1);
		values.add(2);
		values.add(4);
		// Adding one collection to another collection
		values.addAll(al); // [8, 0, 1, 2, 4 X, Y, Z, A, B, C]
		// Removing collection from collection
		values.removeAll(al);
		System.out.println(values); // [8, 0, 1, 2, 4]

		// Sorting --- Collections.sort();
		System.out.println("Elements before sorting " + values); // Elements before sorting [8, 0, 1, 2, 4]
		Collections.sort(values);
		System.out.println("Elements after sorting " + values); // Elements after sorting [0, 1, 2, 4, 8]

		// Reverse order sorting
		System.out.println("Elements before reverse sorting " + al); // Elements before reverse sorting [X, Y, Z, A, B,
																		// C]
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Elements after reverse sorting " + al); // Elements after reverse sorting [Z, Y, X, C, B, A]

	}

}
