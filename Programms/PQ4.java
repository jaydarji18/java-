//practical question: reverse the string without using inbuilt function

public class PQ4{
    public static void main(String args[]){
        String str = args[0];

        System.out.println(str);

        int len = str.length();
        char[] revchar = new char[len];

        int i=len-1;
        for( char c : str.toCharArray()){
            revchar[i]=c;
            i--;
        }

        String reversed = new String(revchar);
        System.out.println(reversed);
    }
}