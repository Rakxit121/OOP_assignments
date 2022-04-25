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
class Switch_1 {
    public static void main(String[] args) {
        String[] subjects = {"Physics", "Chemistry", "Biology", "Maths", "Computer"};
        Scanner input = new Scanner(System.in);
        double marks = 0;

        for (String i : subjects) {
            System.out.print("Enter marks in " + i + ": ");
            marks = marks + input.nextDouble();
        }

        double total = marks;
        double percentage = total / 5;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        double percentage10=percentage/10;
        int intPer= (int) percentage10;

        switch (intPer) {
            case 9 -> System.out.println("Grade: A");
            case 8 -> System.out.println("Grade: B");
            case 7 -> System.out.println("Grade: C");
            case 6 -> System.out.println("Grade: D");
            case 4 -> System.out.println("Grade: E");
            default -> System.out.println("Grade: F");
        }
    }
}

//class Switch_2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter another number:");
//        int num2 = input.nextInt();
//
//        switch (num1 > num2) {
//            case 1 -> System.out.println(num1 + " is greater!");
//            case 0 -> System.out.println(num2 + " is greater!");
//            default -> System.out.println("Both are equal!");
//        }
//    }
//}

class Switch_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();

        switch (year%4) {
            case 0 : switch (year%100) {
                case 0 :
                    switch (year % 400) {
                        case 0 -> System.out.println("Leap Year");
                        default -> System.out.println("Normal Year");
                    }
                    break;
                default:
                    System.out.println("Leap Year");
                    break;
            }break;
            default:
                System.out.println("Normal Year");
                break;
        }
    }
}

class Switch_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1;
        char1 = input.next().charAt(0);
        switch (char1) {
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' -> System.out.println("The character is an alphabet.");
            default -> System.out.println("The character is not an alphabet.");
        }
    }
}

class Switch_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1;
        char1 = input.next().charAt(0);
        switch (char1) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("The alphabet is a vowel.");
            default -> System.out.println("The alphabet is a consonant.");
        }
    }
}

class Switch_8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1 ;
        char1= input.next().charAt(0);
        switch (char1) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> System.out.println("The character is a digit.");
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' -> System.out.println("The character is an alphabet.");
            default -> System.out.println("The character is a special character");
        }
    }
}

class Switch_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the week number:");
        int day= input.nextInt();

        switch (day) {
            case 1 -> System.out.println("It is Sunday");
            case 2 -> System.out.println("It is Monday");
            case 3 -> System.out.println("It is Tuesday");
            case 4 -> System.out.println("It is Wednesday");
            case 5 -> System.out.println("It is Thursday");
            case 6 -> System.out.println("It is Friday");
            case 7 -> System.out.println("It is Saturday");
            default -> System.out.println("Invalid Number!");
        }
    }
}

class Switch_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the month number:");
        int day= input.nextInt();

        switch (day) {
            case 1,3,5,7,8,10,12 -> System.out.println("No. of Days: 31");
            case 4,6,9,11 -> System.out.println("No. of Days: 30");
            case 2 -> System.out.println("No. of Days: 28");
            default -> System.out.println("Invalid Number!");
        }
    }
}

class Switch_13 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a1,a2,a3,sum;
        System.out.print("Enter the angle ");
        a1 = input.nextInt();
        System.out.print("Enter the angle ");
        a2 = input.nextInt();
        System.out.print("Enter the angle ");
        a3 = input.nextInt();
        sum=a1+a2+a3;
        switch (sum) {
            case 180 -> System.out.println("The triangle is valid.");
            default -> System.out.println("The triangle is not valid.");
        }
    }
}

class Switch_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int salary = input.nextInt();

        double hra, da, grossSalary;
        int salaryInt = (salary-1)/10000;

        switch (salaryInt) {
            case 0:
                hra = 0.2*salary;
                da = 0.8*salary;
            case 1:
                hra = 0.25*salary;
                da = 0.9*salary;
            default:
                hra = 0.3*salary;
                da=0.95*salary;
        }

        grossSalary=salary+hra+da;

        System.out.println("Gross salary:  Rs."+grossSalary);
    }
}

class Switch_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total units: ");
        int units = input.nextInt();
        double price;

        int unitsInt = units/50;
        switch (unitsInt) {
            case 0 -> price=units*0.5;
            case 1,2 -> price=25+(units-50)*0.75;
            case 3,4 -> price=25+75+(units-150)*1.2;
            default -> price=25+75+180+(units-250)*1.5;
        }
        double total=price+0.2*price;
        System.out.println("Total price: "+total);
    }
}

class Switch_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = input.nextInt();
        hours = hours%24;
        System.out.println("Enter minutes: ");
        input.nextInt();

        switch (hours) {
            case 0,1,2,3,4,5,6,7,8,9,10,11 -> System.out.println("AM");
            case 13,14,15,16,17,18,19,20,21,22,23 -> System.out.println("PM");
        }
    }
}

class Switch_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(-num);
    }
}

class Switch_24 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int num,x;
        System.out.print("Enter the number ");
        num= demo.nextInt();
        x= num%2;
        switch (x) {
            case 0 -> num += 1;
            default -> {
            }
        }
        System.out.println(num);
    }
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
class if_else_Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int A=scanner.nextInt();
        System.out.println("enter the digit: ");
        int B=scanner.nextInt();

        if (A>=B){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }
    }
}

//2. Write a JAVA program to find maximum between three numbers.
class If_else_Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int A=scanner.nextInt();
        System.out.println("enter the digit: ");
        int B=scanner.nextInt();
        System.out.println("enter the digit: ");
        int C=scanner.nextInt();
        if (A>B && B>C){
            System.out.println("A is greater.");
        }
        else if (B>A && A>B){
            System.out.println("B is greater. ");
        }
        else{
            System.out.println("c is greater.");
        }

    }
}

//3. Write a JAVA program to check whether a number is negative, positive or zero.
class If_else_Q3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int A=scanner.nextInt();
        if (A<0){
            System.out.println("Number is negative");
        }
        else if(A==0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is positive");
        }
    }
}

//4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
class If_else_Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int A=scanner.nextInt();
        if ((A%5==0)&& (A%11==0)){
            System.out.println("The given number is divisible by both 5 and 11.");
        }
        else{
            System.out.println("The number is not divisible by 5 and 11.");
        }
    }
}

//5. Write a JAVA program to check whether a number is even or odd.
class If_else_Q5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int A = scanner.nextInt();
        if (A % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }
    }
}

//6. Write a JAVA program to check whether a year is leap year or not.
class If_else_Q6{
    public static void main(String[] args) {

    }
}

//7. Write a JAVA program to check whether a character is alphabet or not.
class If_else_Q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char character = scanner.next().charAt(0);

        if((character>='a' && character<='z') || (character>='A' && character<='Z')){
            System.out.print(character + " is an alphabet.");
        }else{
            System.out.print(character + " is not an alphabet.");
        }

    }
}
//8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
class If_else_Q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char character = scanner.next().charAt(0);

        if((character>='a' && character<='z') || (character>='A' && character<='Z')){
            if((character>='a' ||character<='A'||character>='E' && character<='e'
                    ||character>='I' ||character<='i'||character>='O' && character<='o'
                    ||character>='U' && character<='u')){
                System.out.println(character+" is a vowel alphabet.");
            }
            else{
                System.out.println(character+" is a consonant alphabet.");
            }
        }
        else{
            System.out.print(character + " is not an alphabet.");
        }
    }
}

//9. Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.
class If_else_Q9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char character = scanner.nextLine().charAt(0);

        if((character>='a' && character<='z') || (character>='A' && character<='Z')){
            System.out.print(character + " is an alphabet.");
        }
        else if (character>='0' && character<='9' ){
            System.out.print(character + " is an digit.");
        }
        else{
            System.out.print(character + " is a special character.");
        }}}


//10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
class If_else_Q10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char character = scanner.nextLine().charAt(0);

        if((character>='A' && character<='Z')){
            System.out.print(character + " is an upper case alphabet.");
        }
        else if(character>='a' && character<='z'){
            System.out.print(character + " is an lower case alphabet.");
        }
        else{
            System.out.print(character + " is not an alphabet.");
        }
    }
}

class If_else_Q11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int day=scanner.nextInt();
        if (day==1){
            System.out.println("sunday");
        }
        else if (day==2){
            System.out.println("monday");
        }
        else if (day==3){
            System.out.println("tuesday");
        }
        else if (day==4){
            System.out.println("wednesday");
        }
        else if (day==5){
            System.out.println("Thursday");
        }
        else if (day==6){
            System.out.println("friday");
        }
        else if (day==7){
            System.out.println("saturday");
        }
        else{
            System.out.println("default");
        }
    }
}

//12. Write a JAVA program to input month number and print number of days in that month.
class If_else_Q12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int day=scanner.nextInt();
        if (day==1){
            System.out.println("Jan has 30 days");
        }
        else if (day==2){
            System.out.println("Enter the year: ");
            int number_of_DaysInMonth;
            int year=scanner.nextInt();

            if (((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0))) {
                number_of_DaysInMonth = 29;
                System.out.println("Feb has "+number_of_DaysInMonth+" days in year "+year);
            }
            else{
            number_of_DaysInMonth =28;
                System.out.println("Feb has "+number_of_DaysInMonth+" days in year "+year);
            }

        }
        else if (day==3){
            System.out.println("Mar has 30 days");
        }
        else if (day==4){
            System.out.println("Apr has 31 days");
        }
        else if (day==5){
            System.out.println("May has 30 days");
        }
        else if (day==6){
            System.out.println("June has 30 days");
        }
        else if (day==7){
            System.out.println("July has 31 days");
        }
        else if (day==8){
            System.out.println("Aug has 30 days");
        }
        else if (day==9){
            System.out.println("Sep has 30 days");
        }
        else if (day==10){
            System.out.println("Oct has 31 days");
        } else if (day==11){
            System.out.println("Nov has 31 days");
        } else if (day==12){
            System.out.println("Dec has 30 days");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}

//13. Write a JAVA program to count total number of notes in given amount.
class If_else_Q13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int totalNoOfNotes;
        if (amount % 2 == 0);
    }

}

//14. Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
class If_else_Q14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the angle: ");
        int angel1 = scanner.nextInt();
        System.out.println("enter the angle: ");
        int angle2 = scanner.nextInt();
        System.out.println("enter the angle: ");
        int angle3 = scanner.nextInt();
        int sum=angel1+angle3+angle2;
        if (sum==180) {
            System.out.println("Triangle is valid.");
        }
        else{
            System.out.println("triangle is invalid");
        }}}
//  Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not
class If_else_Q15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first side: ");
        int side1 = scanner.nextInt();
        System.out.println("enter the second side: ");
        int side2 = scanner.nextInt();
        System.out.println("enter the third side: ");
        int side3 = scanner.nextInt();
        if (side1+side2>side3){
            System.out.println("It is a valid triangle");
        }else{
            System.out.println("It is not a valid triangle");
        }
}


//16. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
class If_else_Q16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the side: ");
        int side1 = scanner.nextInt();
        System.out.println("enter the side: ");
        int side2 = scanner.nextInt();
        System.out.println("enter the side: ");
        int side3 = scanner.nextInt();
        if ((side1 == side2) && (side3 == side2)) {
            System.out.println("Triangle is equilateral.");
        }
        else if ((side1 == side2) || (side3 == side2)) {
            System.out.println("Triangle is isosceles.");
        }
        else{
            System.out.println("Triangle is scalene.");
        }
    }
}

// Write a JAVA program to find all roots of a quadratic equation.
class If_else_Q17{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        // value a, b, and c
        double a, b, c;
        double root1, root2;

        System.out.println("enter the side: ");
        a = scanner.nextInt();
        System.out.println("enter the side: ");
        b = scanner.nextInt();
        System.out.println("enter the side: ");
        c = scanner.nextInt();


        // calculate the determinant (b2 - 4ac)
        double determinant = b * b - 4 * a * c;

        // check if determinant is greater than 0
        if (determinant > 0) {

            // two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        // check if determinant is equal to 0
        else if (determinant == 0) {

            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }

        // if determinant is less than zero
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}

}

//18. Write a JAVA program to calculate profit or loss.
class If_else_Q18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Cost price: ");
        int cp = scanner.nextInt();
        System.out.println("enter the selling price: ");
        int sp = scanner.nextInt();
        if (sp > cp) {
            System.out.println("you had profit.");
        }
        else{
            System.out.println("You had loss.");
        }
    }
}

//19. Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,
//        Mathematics and Computer. Calculate percentage and grade according to following:
//        Percentage >= 90% : Grade A
//        Percentage >= 80% : Grade B
//        Percentage >= 70% : Grade C
//        Percentage >= 60% : Grade D
//        Percentage >= 40% : Grade E
//        Percentage < 40% : Grade F
class If_else_Q19{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}

//20. Write a JAVA program to input basic salary of an employee and calculate its Gross salary
//        according to following:
//        Basic Salary <= 10000 : HRA = 20%, DA = 80%
//        Basic Salary <= 20000 : HRA = 25%, DA = 90%
//        Basic Salary > 20000 : HRA = 30%, DA = 95%
class If_else_Q20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}

//21. Write a JAVA program to input electricity unit charges and calculate total electricity bill
//        according to the given condition:
//        For first 50 units Rs. 0.50/unit
//        For next 100 units Rs. 0.75/unit
//        For next 100 units Rs. 1.20/unit
//        For unit above 250 Rs. 1.50/unit
//        An additional surcharge of 20% is added to the bill
class If_else_Q21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }
}