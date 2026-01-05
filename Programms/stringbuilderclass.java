public class stringbuilderclass{
    public static void main(String args[]){
        StringBuilder sb1 = new StringBuilder("Jay darji");
        //StringBuilder Sb2 = new StringBuilder(); //initial capacity = 16
        //SreingBuilder sb3 = new Stringbuilder(20);

        System.out.println("Append: "+sb1.append(".com"));
        System.out.println("Insert: "+sb1.insert(4, "vinodkumar "));
        System.out.println("Delete: "+sb1.delete(20,24));
        System.out.println("Reverse:"+sb1.reverse());
        sb1.reverse();
        System.out.println("replace:"+sb1.replace(0,3,"JAY"));
        
        System.out.println(sb1);

        // setCharAt
        // deleteCharAt
        

    }
}