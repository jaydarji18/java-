public class stringbufferclass{
    public static void main(String[] args) {
        //StringBuffer sb1 = new StringBuffer(); // initial capacity:16
        StringBuffer sb2 = new StringBuffer("Hello java");
        //StringBuffer sb3 = new StringBuffer(20);
        
        System.out.println("Append: "+ sb2.append(".com"));

        System.out.println("insert: "+ sb2.insert(6,"from "));

        System.out.println("Delete: "+ sb2.delete(2,6));
        
        sb2.insert(2,"llo ");
        System.out.println("Reverse:"+ sb2.reverse());
        sb2.reverse();

        System.out.println("Replace:"+sb2.replace(6,10,"FROM"));
        System.out.println(sb2);
        System.out.println("capacity:"+sb2.capacity());

    }
}