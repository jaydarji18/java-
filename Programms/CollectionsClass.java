import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {
        // Initial List
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 3, 5));
        System.out.println("Original List: " + list);

        // 1. Sort
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // 2. Reverse
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // 3. Shuffle
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // 4. Rotate
        Collections.rotate(list, 2);
        System.out.println("Rotated List (+2): " + list);

        // 5. Max & Min
        System.out.println("Max Value: " + Collections.max(list));
        System.out.println("Min Value: " + Collections.min(list));

        // 6. Frequency
        System.out.println("Frequency of 5: " + Collections.frequency(list, 5));

        // 7. ReplaceAll
        Collections.replaceAll(list, 5, 50);
        System.out.println("Replace 5 with 50: " + list);

        // 8. Fill
        List<Integer> fillList = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
        Collections.fill(fillList, 9);
        System.out.println("Filled List: " + fillList);

        // 9. Copy
        List<Integer> destList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        Collections.copy(destList, list);  // list must be <= dest size
        System.out.println("Copied to destList: " + destList);

        // 10. Swap
        Collections.swap(list, 0, 1);
        System.out.println("Swapped 0 and 1 index: " + list);

        // 11. nCopies
        List<String> names = Collections.nCopies(3, "Java");
        System.out.println("nCopies List: " + names);

        // 12. disjoint
        List<Integer> anotherList = Arrays.asList(100, 200, 300);
        System.out.println("Disjoint with anotherList? " + Collections.disjoint(list, anotherList));

        // 13. synchronizedList
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>(list));
        System.out.println("Synchronized List: " + syncList);

        // 14. unmodifiableList
        List<Integer> unmodList = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable List: " + unmodList);

        // Uncommenting below will throw an exception (read-only list)
        // unmodList.add(10);

        // 15. binarySearch
        Collections.sort(list); // binarySearch needs sorted list
        int index = Collections.binarySearch(list, 8);
        System.out.println("Index of 8 (binary search): " + index);
    }
}
