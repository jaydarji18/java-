import java.util.*;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(5, 3, 7, 1, 9, 2, 8, 6, 4);

        System.out.println("Original List: " + numbers);

        // 1. Sorted
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\nSorted List: " + sortedNumbers);

        // 2. Map (Multiply each number by 2)
        List<Integer> mappedNumbers = numbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println("\nMapped List (Each element * 2): " + mappedNumbers);

        // 3. Filter (Keep only even numbers)
        List<Integer> filteredNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("\nFiltered List (Even numbers): " + filteredNumbers);

        // 4. Distinct (Remove duplicates)
        List<Integer> distinctNumbers = Arrays.asList(5, 3, 7, 5, 9, 2, 8, 2, 4).stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("\nDistinct List: " + distinctNumbers);

        // 5. Collect (Collect as a List)
        List<Integer> collectedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\nCollected List: " + collectedNumbers);

        // 6. ForEach (Print each element)
        System.out.print("\nForEach Output: ");
        numbers.stream().forEach(num -> System.out.print(num + " "));
        System.out.println();

        // 7. Reduce (Sum all numbers)
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("\nReduced Result (Sum): " + sum);

        // 8. Count (Count total elements)
        long count = numbers.stream()
                .count();
        System.out.println("\nCount of Elements: " + count);

        // 9. Limit (Limit to first 5 elements)
        List<Integer> limitedNumbers = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("\nLimited List (First 5 elements): " + limitedNumbers);

        // 10. FindElement (Find any element greater than 5)
        Optional<Integer> foundNumber = numbers.stream()
                .filter(num -> num > 5)
                .findAny();
        System.out.println("\nFound Element (>5): " + foundNumber.orElse(null));
    }
}
