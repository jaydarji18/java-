class carinconstructorchainingdc{
	carinconstructorchainingdc(){
        System.out.println("Inside car's constructor");
    }
}

class lamboinconstructorchainingdc extends carinconstructorchainingdc{
	lamboinconstructorchainingdc(){
        super();
        System.out.println("Inside lambo's constructor");
    }

    void display(){
        System.out.println("End of the program");
    }
}

public class constructorchainingdc{
    public static void main(String[] args) {
    	lamboinconstructorchainingdc obj = new lamboinconstructorchainingdc();
        obj.display();
    }
}