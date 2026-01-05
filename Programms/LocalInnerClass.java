class factorialInlocalinnerclass{
    public void factorial(int number){

        class factorialmanager{
            public int fact(int num){
                int mul=1;
                for(int i=num ; i>0 ; i--){
                    mul=mul*i;
                }
                return mul;
            }
        }

        factorialmanager fmn = new factorialmanager();
        int result = fmn.fact(number);
        System.out.println(result);
    }
}

public class LocalInnerClass{
    public static void main(String args[]){
        factorialInlocalinnerclass fct = new factorialInlocalinnerclass();
        fct.factorial(5);
    }
}