import java.util.Scanner;

public class FindDay{
    public static void main(String args[]){
        System.out.println("Enter date in format (DD/MM/YYYY): ");
        Scanner sc = new Scanner(System.in);
        String date_enter =sc.nextLine();

        String parts[] = date_enter.split("/");

        int date= Integer.valueOf(parts[0]);
        int month= Integer.valueOf(parts[1]);
        int year= Integer.valueOf(parts[2]);
        finddate(year, month, date);
        sc.close();
    }

    public static void finddate(int year, int month, int date){
        String[] days = {"sunday","monaday","tuesday","wednesday","thursday","friday","saturday"};
        int[] month_code_list = {1,4,4,0,2,5,0,3,6,0,1,4,6};
        int[] month_leap_list = {0,3};

        int month_code;
        if(isLeapYear(year) && month < 3){
            month_code = month_leap_list[month-1];
        }
        else{
            month_code = month_code_list[month-1];
        }

        int firstPart = (year / 100) * 100;
        int secondPart = year % 100;
        
        int result= (date + month_code + codeForYear(firstPart) + secondPart + howManyLeapYear(secondPart) + 5)%7;
        
        System.out.println(days[result]);
    }

    public static Boolean isLeapYear(int year) {
        if(year % 4 == 0){
            return true;
        }
        return false;
    }

    public static int howManyLeapYear(int year){
        return year/4;
    }

    public static int codeForYear(int year){
        switch(year % 400){
            case 0: return 0; 
            case 100: return 5;
            case 200: return 3;
            case 300: return 1;
        }
        return -1;
    }
}