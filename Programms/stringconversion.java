/*
string to stringbuffer and stringbuilder
stringbuffer to string and stringbuilder
stringbuilder to string and stringbuffer
 */

public class stringconversion{
    public static void main(String args[]){
        String str = "jay";
        fromstring(str);

        StringBuffer sbf2 = new StringBuffer("jay");
        fromstringbuffer(sbf2);

        StringBuilder sbl3 = new StringBuilder("jay");
        fromstringbuilder(sbl3);
    }

    public static void fromstring(String str){
        StringBuffer sbf1 = new StringBuffer(str);
        StringBuilder sbl1 = new StringBuilder(str);
        System.out.println("\nbuffer: "+sbf1+"\nbuilder:"+sbl1);
    }

    public static void fromstringbuffer(StringBuffer sbf2){
        String str2 = sbf2.toString();
        StringBuilder sbl2 = new StringBuilder(sbf2);
        System.out.println("\nString: "+str2+"\nbuilder:"+sbl2);
    }

    public static void fromstringbuilder(StringBuilder sbl3){
        String str2 = sbl3.toString();
        StringBuffer sbf3 = new StringBuffer(sbl3);
        System.out.println("\nString: "+str2+"\nbuilder:"+sbf3);
    }
}