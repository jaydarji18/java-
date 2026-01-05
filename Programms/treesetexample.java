import java.util.*;

public class treesetexample{
    public static void main(String args[]){
        // create treeset with method 1
        List<Integer> list = Arrays.asList(20,50,70,40,30,60,10,80);
        TreeSet<Integer> nums = new TreeSet<>(list);

        //create treeset with method 2
        // TreeSet<Integer> nums = new TreeSet<>();
        // nums.add(20);
        // nums.add(50);
        // nums.add(70);
        // nums.add(40);
        // nums.add(30);
        // nums.add(60);
        // nums.add(10);
        // nums.add(80);

        // create treeset with method 3
        // TreeSet<Integer> customOrderSet = new TreeSet<>(Comparator.reverseOrder());
        // customOrderSet.add(30);
        // customOrderSet.add(10);
        // customOrderSet.add(20);
        // customOrderSet.add(40);

        // nums.add(null);
        System.out.println("\nAll elements:"+nums);

        System.out.println("\nFirst element: "+nums.first());

        System.out.println("\nLast element:"+nums.last());
        
        SortedSet<Integer> headset = nums.headSet(40);
        System.out.println("\nHeadset: " + headset);

        System.out.println("\ntail set: "+ nums.tailSet(40));

        System.out.println("\nsubset: "+ nums.subSet(30, 70));

        System.out.println("\ndescending: "+ nums.descendingSet());

        System.out.println("\nadd an duplicate element: "+ nums.add(30));

        System.out.println("\nremoving element: "+nums.remove(100));

        System.out.println("\nfloor element:"+ nums.floor(45));

        System.out.println("\nceiling element: "+ nums.ceiling(45));
        
        System.out.println("\nsize:"+nums.size());
    }
}