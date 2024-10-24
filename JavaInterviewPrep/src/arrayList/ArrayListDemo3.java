package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		String arr[] = { "Dog", "Cat", "Elephant" };
		for (String animals : arr) {
			System.out.println(animals);
		}
		//Converting the arrays into array list
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al); //[Dog, Cat, Elephant]
	}

}
