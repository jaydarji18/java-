class generics<I,N>{
    I var1;
    N var2;

    generics(I var1,N var2){
        this.var1=var1;
        this.var2=var2;
    }

    I getvar1(){
        return var1;
    }

    N getvar2(){
        return var2;
    }
}

class GenericsMethod{
    public <I> void printData(I data){
        System.out.println(data);
    }
}

class BoundedGenerics{
    public <M extends Number> void printdata(M data){
        System.out.println(data);
    }
}

public class GenericsExample{
    public static void main(String[] args) {
        generics<Integer,String> obj = new generics<>(1009,"Jay");
        System.out.println("ID: "+obj.getvar1()+" Name: "+obj.getvar2());

        generics<String, String> obj2 = new generics<>("Jay", "Darji");
        System.out.println("First name: "+obj2.getvar1()+" Last name: "+obj2.getvar2());

        generics<Integer, Integer> obj3 = new generics<>(10,20);
        System.out.println("Addition: "+ (obj3.getvar1()+obj3.getvar2()));

        System.out.println();
        GenericsMethod gm = new GenericsMethod();
        gm.printData(100);
        gm.printData("jay");

        System.out.println();
        BoundedGenerics bg = new BoundedGenerics();
        bg.printdata(100);
        // bg.printdata("Jay");

    }
}
