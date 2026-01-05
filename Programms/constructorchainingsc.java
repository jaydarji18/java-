class carinconstructorchainingsc{
    String msg;
    carinconstructorchainingsc(){
        this("Hello from parameterized");
        System.out.println("Hello from default");
    }

    carinconstructorchainingsc(String msg){
        System.out.println(msg);
    }
}


public class constructorchainingsc{
    public static void main(String args[]){
        carinconstructorchainingsc car1 = new carinconstructorchainingsc();

    }
}
