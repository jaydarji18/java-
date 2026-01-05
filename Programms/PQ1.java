// Practical question: How do you find the maximum product of two integers in an array

import java.util.*;
public class PQ1{
    public static void main(String args[]){
        int array[] = {10,80,30,90,70,50,40,20,60};

        Arrays.sort(array);

        System.out.println("Product is :"+array[array.length-1] * array[array.length-2]);
    }
}