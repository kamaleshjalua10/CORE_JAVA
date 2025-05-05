
    import java.util.LinkedList;

    public class rotate_ll {
    // Function to rotate the list to the right by k places
    public static void rotateRight(LinkedList<Integer> list, int k) {
        if (list == null || list.size() <= 1 || k <= 0) {
            return;
        }

        int size = list.size();
        k = k % size; // Effective rotations
        if (k == 0) {
            return; // No rotation needed
        }

        // Remove last k elements and add them to the front
        for (int i = 0; i < k; i++) {
            int value = list.removeLast();
            list.addFirst(value);
        }
    }

    // Utility function to print the list
    public static void printList(LinkedList<Integer> list) {
        for (int value : list) {
            System.out.print(value + " -> ");
        }
        System.out.println("null");
    }

    // Main function to test the rotation
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List:");
        printList(list);

        int k = 2;
        rotateRight(list, k);

        System.out.println("Rotated List by " + k + " positions:");
        printList(list);
    }
}


