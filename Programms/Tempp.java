
import java.util.*;
class Tempp {
    public static void main(String[] args){
        System.out.println(bulb(10));
    }

    public static int bulb(int n){

        // off -0
        // on -1
        int[] input = new int[n];
        Arrays.fill(input,0);

        // trav(input);
        for(int i=1 ; i<=n ; i++){
            if(i==1){
                Arrays.fill(input,1);
            }
            else if(i>1 && i<n){
                int temp = i-1;
                while(temp < n){
                    if(input[temp] == 0){
                        input[temp] =1;
                    }
                    else{
                        input[temp] =0;
                    }
                    temp = temp +i;
                }
            }
            else if(i==n){
                if(input[i-1] == 0){
                    input[i-1] =1;
                }
                else{
                    input[i-1] =0;
                }
            }

            // System.out.print("round-"+i+" : ");
            // trav(input);
        }

        return count(input);

    }

    public static void trav(int[] nums){
        for(int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static int count(int[] numbers) {
        int c = 0;
        for(int ele:numbers){
            if(ele == 1){
                c++;
            }
        }
        return c;
    }

}
