
package collection_framework.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(1);
        numbers.addLast(100);
        System.out.println("Initial ArrayList: " + numbers);

        // Remove elements
        numbers.removeFirst();
        System.out.println("After removing first element: " + numbers);
        numbers.remove(1);
        System.out.println("After removing element at index 1: " + numbers);
        numbers.removeLast();
        System.out.println("After removing last element: " + numbers);

        // Get element
        System.out.println("Element at index 1: " + numbers.get(1));

        // Set element
        numbers.set(0, 100);
        System.out.println("After setting element at index 0: " + numbers);

        // Check if element exists
        System.out.println("Does ArrayList contain 100? " + numbers.contains(100));

        // Get size
        System.out.println("Size of ArrayList: " + numbers.size());

        // Add all elements from another ArrayList
        ArrayList<Integer> oldList = new ArrayList<>();
        oldList.add(1);
        oldList.add(2);
        oldList.add(3);
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(4);
        newList.add(5);
        newList.add(6);
        oldList.addAll(newList);
        System.out.println("After adding all elements from newList: " + oldList);

        // Iterate using for loop
        for (int i = 0; i < oldList.size(); i++) {
            System.out.println("For loop: " + oldList.get(i));
        }

        // Iterate using for-each loop
        for (Integer value : oldList) {
            System.out.println("For-each loop: " + value);
        }
    }
}
       
