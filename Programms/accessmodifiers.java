class test{
    public int public_member=10;
    //private int private_member=20;
    protected int protected_member=30;
    int default_memebr=40;
}

public class accessmodifiers{
    public static void main(String args[]){
        test t = new test();
        System.out.println("Public member: "+t.public_member);
        //System.out.println("Private member: "+t.private_member); it generates an error
        System.out.println("Protected member: "+t.protected_member);
        System.out.println("Default member: "+t.default_memebr);
    }
}