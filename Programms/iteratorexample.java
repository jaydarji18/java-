import java.util.*;

public class iteratorexample{
    public static void main(String args[]){
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(10);
        elements.add(20);
        elements.add(30);
        elements.add(40);

        System.out.println(elements);

        Iterator<Integer> itr = elements.iterator();

        while(itr.hasNext()){
            if(itr.next() == 30){
                itr.remove();
            }
        }
        System.out.println(elements);
    }
}