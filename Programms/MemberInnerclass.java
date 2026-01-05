// member inner class: 

class calculator{
    int num1,num2;
    calculator(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    class adder{
        void sum(){
            int sum = num1+num2;
            System.out.println("Addition is : "+sum);
        }
    }
}

public class MemberInnerclass {
    public static void main(String[] args) {
        calculator cal = new calculator(10,20);
        calculator.adder add = cal.new adder();
        add.sum();
    }
}
