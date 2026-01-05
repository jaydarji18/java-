import java.util.*;

public class arraysclass{
    public static void main(String args[]){

        // array to list
        String[] array = {"apple", "banana", "cherry"};
        List<String> arrlist = Arrays.asList(array);
        System.out.println(arrlist);

        // binary search
        int[] nums = {10,20,30,40,50,60};
        int index = Arrays.binarySearch(nums, 40);
        System.out.println("found at: "+index);

        // equals
        int[] a = {1,2,3};
        int[] b = {1,3,2};
        if(Arrays.equals(a,b)){
            System.out.println("arrays are equal");
        }
        else{
            System.out.println("arrays are not equal");
        }

        // filling all elements
        Arrays.fill(nums, 30);
        for(int item : nums){
            System.out.println(item);
        }

        // sorting
        int[] nums2 = {30,10,50,60,20,40};
        Arrays.sort(nums2);
        for(int item : nums2){
            System.out.println(item);
        }

        // hashcode
        System.out.println(Arrays.hashCode(nums2));

        // to String
        String str = Arrays.toString(array);
        System.out.println("To string: "+str);

        // copy of
        int[] original = {1,2,3};
        int[] copy = Arrays.copyOf(original, 5);
        for(int item : copy){
            System.out.println(item);
        }

        // copy of range
        // copyOfRange(array, start, end)
        System.out.println("Copy of range");
        int[] input = {10,20,30,04,50};
        int[] rangeof = Arrays.copyOfRange(input, 2, input.length);
        for(int element : rangeof){
            System.out.println(element);
        }
    }
}