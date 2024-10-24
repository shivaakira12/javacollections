package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();
		animals.add("Wolf");
		animals.add("Lion");
		animals.add("Elephant");
		animals.add("Donkey");
		LinkedList<String> birds = new LinkedList<>();
		birds.add(0, "Sparrow");
		birds.add("Crow");
		birds.add("Pigeon");
		// Adding one collection into another collection
		birds.addAll(animals);
		System.out.println(birds);// [Sparrow, Crow, Pigeon, Wolf, Lion, Elephant, Donkey]
		// Sorting the Collection
		Collections.sort(birds);
		System.out.println(birds);// [Crow, Donkey, Elephant, Lion, Pigeon, Sparrow, Wolf]
		// reverse the collection
		Collections.sort(birds, Collections.reverseOrder());
		System.out.println(birds);// [Wolf, Sparrow, Pigeon, Lion, Elephant, Donkey, Crow]
	}
}
