import java.util.*;

public class comparator{
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>(Arrays.asList(345, 256, 612, 582)); 

        Collections.sort(nums,Comparator.reverseOrder());
        System.out.println("sorting of nums : "+nums);

        
    }
}