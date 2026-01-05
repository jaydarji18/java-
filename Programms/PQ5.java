// check string is a palindrome or not using stringbuffer

public class PQ5{
    public static void main(String args[]){
        String str = "srs";
        if(checkpelindrome(str)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }

    }

    public static boolean checkpelindrome(String str){

        StringBuffer original = new StringBuffer(str);
        return original.reverse().toString().equals(str);

    }
}