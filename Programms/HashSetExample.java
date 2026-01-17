import java.util.*;


public class HashSetExample{
    public static void main(String args[]){
        String[] array = {"Heet","Het","Kishan"};
        ArrayList<String> arrlist = new ArrayList<>(Arrays.asList(array));
        HashSet<String> list = new HashSet<>(arrlist);
        list.add(null);
        list.add("Jay");
        System.out.println("All elements: "+list);

        HashSet<String> list2 = new HashSet<>();
        // list2.add(null);
        list2.add("Harshit");
        list2.add("Jay");
        list2.add("Kishan");
        list2.add("Dev");
        System.out.println("Is Empty: "+list.isEmpty());
        System.out.println("Size: "+list.size());
        System.out.println("Contains: "+list.contains("Kishan"));
        System.out.println("Equals: "+list.equals(list2));
        list.remove("Kishan");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }

}
