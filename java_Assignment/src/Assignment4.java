import java.util.Scanner;

public class Assignment4 {
}

class switch_week {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weekday number : ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Today is Saturday");
                break;
            case 2:
                System.out.println("Today is Sunday");
                break;
            case 3:
                System.out.println("Today is Monday");
                break;
            case 4:
                System.out.println("Today is Tuesday");
                break;
            case 5:
                System.out.println("Today is Wednesday");
                break;
            case 6:
                System.out.println("Today is Thursday");
                break;
            case 7:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Sorry not a week day");
        }
    }
}
class switch1{

}



class if_week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weekday number : ");
        int weekday = scanner.nextInt();
        if (weekday == 1) {
            System.out.println("Sunday");
        }else if (weekday == 2){
            System.out.println("Monday");
        }else if (weekday == 3){
            System.out.println("Tuesday");
        }else if (weekday == 4){
            System.out.println("Wednesday");
        }else if (weekday == 5){
            System.out.println("Thursday");
        }else if (weekday == 6){
            System.out.println("Friday");
        }else if (weekday == 7){
            System.out.println("Saturday");
        }else{System.out.println("It is not a week day");}
    }
}

