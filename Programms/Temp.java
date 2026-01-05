public class Temp {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        int n =3;
        System.out.println(findNthlargest(nums, n));

    }

    public static int findNthlargest(int[] nums, int n){
        
        int nthlargest = -1;
        int maxindex= -1;
        for(int i=0 ; i<n ; i++){
            int largest = Integer.MIN_VALUE;
            for(int j=0 ; j<nums.length ; j++){
                if(nums[j] > largest){
                    largest = nums[j];
                    maxindex = j;
                }
            }

            nthlargest = largest;
            nums[maxindex] = Integer.MIN_VALUE;
        }

        return nthlargest;

    }
}