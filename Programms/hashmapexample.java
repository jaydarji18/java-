import java.util.*;
public class hashmapexample{
    public static void main(String[] args) {
        HashMap<Integer, String> stset = new HashMap<>();

        //others
        HashMap<Integer, String> stset1 = new HashMap<>(20); //initial capacity=20
        // HashMap<Integer, String> stset2 = new HashMap<>(anothermap);

        // put
        stset.put(1012, "Heet");
        stset.put(1009, "Jay");
        stset.put(1011, "Isha");
        stset.put(1012, "Heet");
        
        // putifabsent
        stset.putIfAbsent(1012, "Heet");
        System.out.println("\nAfter putting : "+stset);

        // replace
        stset.replace(1012, "Heet D");
        System.out.println("\nAfter replace: "+stset);

        // get
        System.out.println("\nGet 1009: "+ stset.get(1009));

        // containskey
        System.out.println("\nContains key(1009): "+ stset.containsKey(1009));

        // containsvalue
        System.out.println("\nContains Values(isha): "+ stset.containsValue("Isha"));

        // foreach
        System.out.println("\nforeach");
        stset.forEach((k, v) -> System.out.println(k + " -> " + v));

        //entry list
        System.out.println("\nEntry list: "+stset.entrySet());
        
        // keyset
        //Set<Integer> keys = stset.keySet();
        System.out.println("\nkeys are: "+stset.keySet()); //returns in list

        // values
        System.out.println("\nvalues: "+ stset.values()); //returns in list

        // size
        System.out.println("\nSize: "+stset.size());//returns size not capacity
        
        // isempty
        System.out.println("\nIs empty: "+stset1.isEmpty()); 

        // remove
        stset.remove(1012);
        System.out.println("\nAfter removing: "+stset);

        // clear
        stset.clear(); 
        System.out.println("After Clearing: "+stset);   
    }
}