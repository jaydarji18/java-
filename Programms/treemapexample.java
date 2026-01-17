import java.util.*;
public class treemapexample{
    public static void main(String args[]){
        
        //constructors
        TreeMap<Integer, String> stset = new TreeMap<>();

        // others
        // Map<Integer, String> stset2 = new TreeMap<>(anothermap);
        // Map<Integer, String> stset3 = new TreeMap<>(Comparator.naturalOrder()); // returns in ascending order
        // Map<Integer, String> stset4 = new TreeMap<>(Comparator.reverseOrder()); // returns in descending order

        // put
        stset.put(1012, "Heet");
        stset.put(1009, "Jay");
        stset.put(1011, "Dev");
        stset.put(1012, "Heet");
        // System.out.println(stset);

        // putifabsent
        stset.putIfAbsent(1020, "Het");
        System.out.println("\nAfter adding :"+stset);

        // replace
        stset.replace(1009, "Jay Darji");
        System.out.println("\nAfter replace: "+stset);

        // get
        System.out.println("\nget 1009: "+stset.get(1009));

        // containskey
        System.out.println("\ncontains key(1010): "+stset.containsKey(1010));

        // containsvalue
        System.out.println("\ncontains value(jay): "+stset.containsValue("Jay"));

        // firstkey
        System.out.println("\nFirst value: "+stset.firstKey());

        // lastkey
        System.out.println("\nLast value: "+stset.lastKey());

        // First Entry
        System.out.println("\nFirst entry: "+stset.firstEntry());

        //Last Entry
        System.out.println("\nFirst entry: "+stset.lastEntry());
        
        // keyset
        System.out.println("\nKey set: "+stset.keySet());

        // values
        System.out.println("\nValues: "+stset.values());

        // foreach
        stset.forEach((k, v) -> System.out.println(k + "->" + v));

        // entryset
        System.out.println("\nEntry set:"+stset.entrySet());

        // headmap
        Map<Integer, String> headmap = stset.headMap(1012);
        System.out.println("\nHead map: "+headmap);

        // tailmap
        Map<Integer, String> tailmap = stset.tailMap(1012);
        System.out.println("\nTail map: "+tailmap);

        // submap
        Map<Integer, String> submap = stset.subMap(1009, 1012);
        System.out.println("\nSub map: "+submap);

        // descendingkeyset
        System.out.println("\nDescending key set: "+stset.descendingKeySet());

        // descendingmap
        System.out.println("\ndescending map: "+stset.descendingMap());

        // size
        System.out.println("\nSize: "+stset.size());

        // isempty
        System.out.println("\nIs empty: "+stset.isEmpty());

        // remove
        stset.remove(1020);
        System.out.println("\nAfter Removing :"+stset);

        // clear
        stset.clear();
        System.out.println("\nAfter clering :"+stset);

       
    }

}
