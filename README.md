
---

# Collection Framework in Java

This repository contains examples and demonstrations of the **Collection Framework** in Java, particularly focusing on the `Collection` interface and its child interfaces like `List`. The examples use `ArrayList` to showcase various operations such as adding, removing, and manipulating data.

## Collection Framework Overview

The **Collection Framework** in Java provides a unified architecture to represent and manipulate a group of objects as a single entity. It includes interfaces and classes that are essential for working with collections.

### Collection Interface

- **Collection** is the root interface of the Collection Framework. It defines several methods that are applicable to any collection.
- **Note**: There is no concrete class that directly implements the `Collection` interface.

#### Important Methods of Collection Interface:
- `boolean add(Object o)` – Adds the object to the collection.
- `boolean addAll(Collection c)` – Adds all the objects from a given collection.
- `boolean contains(Object o)` – Checks if the collection contains a particular object.
- `boolean containsAll(Collection c)` – Checks if the collection contains all elements from a given collection.
- `boolean remove(Object o)` – Removes the specified object from the collection.
- `boolean removeAll(Collection c)` – Removes all the elements that exist in a given collection.
- `boolean retainAll(Collection c)` – Retains only the elements that exist in the specified collection.
- `int size()` – Returns the number of elements in the collection.
- `boolean isEmpty()` – Checks if the collection is empty.
- `Iterator iterator()` – Returns an iterator over the elements in the collection.
- `void clear()` – Removes all elements from the collection.
- `Object[] toArray()` – Converts the collection to an array.

---

### List Interface

- **List** is a child interface of the `Collection` interface.
- A **List** allows duplicates and maintains the insertion order, meaning elements can be accessed using their index.
  
#### Important Methods of List Interface:
- `add(int index, Object o)` – Adds the object at the specified index.
- `boolean addAll(int index, Collection c)` – Adds a collection of objects at the specified index.
- `Object get(int index)` – Returns the object at the specified index.
- `Object remove(int index)` – Removes the object at the specified index.
- `Object set(int index, Object new)` – Replaces the object at the specified index with a new object.
- `int indexOf(Object o)` – Returns the index of the first occurrence of the specified object.
- `int lastIndexOf(Object o)` – Returns the index of the last occurrence of the specified object.
- `ListIterator listIterator()` – Returns a list iterator over the elements in the list.

---

## ArrayList Class

- **ArrayList** is a resizable or growable array in Java.
- It allows duplicate elements and maintains the insertion order.
- Heterogeneous objects are allowed except in certain cases (like `TreeSet` or `TreeMap`).
- Null insertion is allowed.

### Constructors of ArrayList:
- `ArrayList()` – Creates an empty array list with a default initial capacity of 10.
- `ArrayList(int initialCapacity)` – Creates an array list with the specified initial capacity.
- `ArrayList(Collection c)` – Creates an array list containing the elements of the specified collection.

### Example Code:
Here are some code examples that demonstrate how to use `ArrayList`.

### Example 1: Basic Operations with ArrayList

```java
package collections;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add("welcome");
        al.add(10.5);
        al.add('A');
        al.add(true);

        System.out.println(al); // [100, welcome, 10.5, A, true]

        // Size of ArrayList
        System.out.println("Size: " + al.size());

        // Removing an element
        al.remove(1);
        System.out.println("After removal: " + al);

        // Adding at specific index
        al.add(1, "Shiva");
        System.out.println("After adding: " + al);

        // Retrieving a value
        System.out.println("Value at index 3: " + al.get(3));

        // Replacing a value
        al.set(1, "Akira");
        System.out.println(al);

        // Searching for a value
        System.out.println(al.contains("Akira")); // true

        // Checking if the list is empty
        System.out.println(al.isEmpty()); // false

        // Iterating using for loop
        for (int i = 0; i < al.size(); i++) {
            System.out.print(" " + al.get(i));
        }

        // Iterating using for-each loop
        for (Object e : al) {
            System.out.print(" " + e);
        }
    }
}
```

### Example 2: Sorting and Collection Operations

```java
package collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        // Sorting
        Collections.sort(al);
        System.out.println("Sorted: " + al);

        // Reverse Sorting
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Reverse Sorted: " + al);
    }
}
```

### Example 3: Converting Arrays to ArrayList

```java
package collections;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        String[] arr = {"Dog", "Cat", "Elephant"};
        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
        System.out.println(al); // [Dog, Cat, Elephant]
    }
}
LinkedList Class
LinkedList is a doubly linked list that implements the List and Deque interfaces.
It is best suited for scenarios where insertion and deletion from the middle of the list are frequent.
LinkedList allows null insertion, heterogeneous objects, and duplicates. However, it is not suited for random access operations (like retrieving data using an index) because of its internal structure.
Important Methods of LinkedList:
void addFirst(Object o) – Inserts the element at the beginning of the list.
void addLast(Object o) – Inserts the element at the end of the list.
Object getFirst() – Retrieves the first element of the list.
Object getLast() – Retrieves the last element of the list.
Object removeFirst() – Removes the first element of the list.
Object removeLast() – Removes the last element of the list.
Example Code:
Here are some code examples that demonstrate how to use LinkedList.

Example 1: Basic Operations with LinkedList
java
Copy code
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
        System.out.println(ll); // [null, Shiva, M, 100, true]

        // Finding the size of LinkedList
        System.out.println(ll.size()); // 5

        // Remove elements from LinkedList
        ll.remove(); // Removes the 0th index
        ll.remove(2); // Removes the element at index 2
        System.out.println(ll); // [Shiva, M, true]

        // Retrieving elements
        System.out.println(ll.get(1)); // M

        // Replacing an element at a specific index
        ll.set(1, 'F');
        System.out.println(ll); // [Shiva, F, true]

        // Checking if a specific element exists
        System.out.println(ll.contains('M')); // false
        System.out.println(ll.contains('F')); // true

        // Checking if LinkedList is empty
        System.out.println(ll.isEmpty()); // false

        // Iterating through the list using a for loop
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i)); // Shiva F true
        }

        // Iterating using a for-each loop
        for (Object e : ll) {
            System.out.println(e); // Shiva F true
        }

        // Iterating using an iterator
        Iterator itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()); // Shiva F true
        }
    }
}
Example 2: Sorting and Collection Operations with LinkedList
java
Copy code
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

        // Adding one collection to another
        birds.addAll(animals);
        System.out.println(birds); // [Sparrow, Crow, Pigeon, Wolf, Lion, Elephant, Donkey]

        // Sorting the collection
        Collections.sort(birds);
        System.out.println(birds); // [Crow, Donkey, Elephant, Lion, Pigeon, Sparrow, Wolf]

        // Reverse sorting
        Collections.sort(birds, Collections.reverseOrder());
        System.out.println(birds); // [Wolf, Sparrow, Pigeon, Lion, Elephant, Donkey, Crow]
    }
}
Example 3: LinkedList as a Stack and Queue
java
Copy code
package linkedList;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList<String> brands = new LinkedList<>();
        brands.add("PUMA");
        brands.add("ADIDAS");
        brands.add("DECATHLON");
        brands.add("JOCKEY");

        // Adding elements at the first and last positions
        brands.addFirst("NIKE");
        brands.addLast("CROCS");
        System.out.println("Newly Added Brands: " + brands); // [NIKE, PUMA, ADIDAS, DECATHLON, JOCKEY, CROCS]

        // Removing the first and last elements
        brands.removeFirst();
        brands.removeLast();
        System.out.println("After Removal: " + brands); // [PUMA, ADIDAS, DECATHLON, JOCKEY]

        // Getting the first and last elements
        System.out.println("First and Last: " + brands.getFirst() + " " + brands.getLast()); // PUMA JOCKEY
    }
}
```

Feel free to use and modify the examples in this repository for learning purposes!

