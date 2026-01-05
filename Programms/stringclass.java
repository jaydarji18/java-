
public class stringclass{
    public static void main(String[] args) {
        char[] arr = {'j','a','y','d','a','r','j','i'};
        String str1 = new String("Hello java");
        String str2 = new String(str1);
        String str3 = new String(arr);

        System.out.println("\nString 1: "+str1+"\nString 2: "+str2+"\nString 3: "+str3);

        System.out.println("\nLength of str3: "+str3.length());

        String str4 = str3.toUpperCase();
        System.out.println("Uppercase of Str3: "+str4);

        if(str1.equals(str2)){
            System.out.println("Str1 and str2 are equal");
        }
        else{
            System.out.println("Not equal");
        }

        if(str3.equalsIgnoreCase(str4)){
            System.out.println("Str3 and Str4 are equal");
        }
        else{
            System.out.println("not equal");
        }
        
        System.out.println("Concat:" + str1.concat(str3));

        System.out.println("char at 3 in str3 :" +str3.charAt(3));

        System.out.println("Substring str2: "+ str2.substring(2,6));

        System.out.println("index of :"+str3.indexOf('d'));

        System.out.println("after replace: "+str2.replace('l','m'));

        boolean startwith = str2.startsWith("Hello");
        System.out.println("Starts  with: "+startwith);

        char[] array=str1.toCharArray();
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}