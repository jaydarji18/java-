import java.util.*;

public class array {
    public static void main(String[] args) {
        // Single-dimensional array
        System.out.println("Single-Dimensional Array:");
        int[] singleDimArray = {10, 20, 30, 40, 50};
        for (int i = 0; i < singleDimArray.length; i++) {
            System.out.println("Single dimension array["+i+"]: " + singleDimArray[i]);
        }

        // Multi-dimensional array (2D array)
        System.out.println("\nMulti-Dimensional Array (2D Array):");
        int[][] multiDimArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < multiDimArray.length; i++) {
            for (int j = 0; j < multiDimArray[i].length; j++) {
                System.out.println("Multi dimension array["+i+"]["+j+"]: " + multiDimArray[i][j]);
            }
        }

        // Jagged array
        System.out.println("\nJagged Array:");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.println("Jagged array["+i+"]["+j+"]: " + jaggedArray[i][j]);
            }
        }

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,0};
        
        System.out.println("\n1)merge \n2)copy \n3)reverse \nselect any operation: ");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                merge(arr1,arr2);
                break;

            case 2:
                copy(arr1);
                break;

            case 3:
                reverse(arr1);
                break;
        
            default:
            System.out.println("wrong choice");
                break;
        }
        sc.close();
    }
    public static void merge(int[] array1, int[] array2){
        int[] mergedarr = new int[(array1.length)+(array2.length)];

        for(int i=0 ; i<array1.length ; i++){
            mergedarr[i] = array1[i];
        }

        int k=0;
        for(int i=array1.length ; i<mergedarr.length ; i++){
            mergedarr[i] = array2[k];
            k++;
        }
        System.out.println("First array:");
        printarray(array1);
        System.out.println("Second array:");
        printarray(array2);
        System.out.println("\n Merged array: ");
        printarray(mergedarr);
    }

    public static void copy(int[] array1){
        int[] copiedarr = new int[array1.length];

        for(int i=0; i<array1.length ; i++){
            copiedarr[i] = array1[i];
        }
        
        System.out.println("Original array:");
        printarray(array1);
        System.out.println("\n Copied array: ");
        printarray(copiedarr);
    }

    public static void reverse(int[] array1){
        int[] reversearr = new int[array1.length];

        int k=0;
        for(int i = array1.length-1 ; i>=0 ; i--){
            reversearr[k] = array1[i];
            k++;
        }

        System.out.println("Original array:");
        printarray(array1);
        System.out.println("\n Reversed array: ");
        printarray(reversearr);
    }

    static void printarray(int arr[]){
        for(int i=0 ; i<arr.length ;i++){
            System.out.println("["+i+"]: "+ arr[i]);
        }
    }
    
}
