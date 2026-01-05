// final class carfinalkeyword{
//     final void display(){
//         System.out.println("Inside car's method");
//     }
// }

// class BMWfinalkeyword extends carfinalkeyword{
//     void display(){
//         System.out.println("Inside BMW's method");
//     }
// }

// public class finalkeyword{
//     public static void main(String args[]){
//         final double finalvariable = 3.14;
//         if(finalvariable == 3.14){
//             finalvariable = 3.20;
//         }

//     }
// }


// Implementation of sealed class

sealed class A permits B,C{
}

final class B extends A{
}

final class C extends A{
}

public class finalkeyword{
    public static void main(String[] args) { 
    }
}

