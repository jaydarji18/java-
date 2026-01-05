class carinstanceofop{
}

class lamboinstanceofop extends carinstanceofop{
}

public class instanceofop{
    public static void main(String[] args) {
    	carinstanceofop c1 = new carinstanceofop();

        if(c1 instanceof carinstanceofop){
            System.out.println("yes, C1 is a instace");
        }
        else{
            System.out.println("No, C1 is not a instance");
        }

        lamboinstanceofop l1 = new lamboinstanceofop();
        // carinstanceofop c2 = new lamboinstanceofop();
        if(l1 instanceof carinstanceofop){
            System.out.println("yes, l1 is a instace");
        }
        else{
            System.out.println("No, l1 is not a instance");
        }
    }
}