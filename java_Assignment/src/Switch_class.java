import javax.print.attribute.standard.PresentationDirection;
import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Switch_class {
}

// Check if number is odd or even
class Switch_Q1{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int a = num % 2;


        switch(num%2){
            case 0:
                System.out.println("The number is even");
                break;
            case 1:
                System.out.println("The num is odd");

        }
    }
}
// Find the max number of two
class Switch_Q2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another Number: ");
        int num2 = scanner.nextInt();
        int result;
        if (num1>num2) {
            result = 0;
        }
        else if (num2>num1) {
            result = 1;
        }
        else {
            result = 2;
        }
        switch (result){
            case 0:
                System.out.println(num1 +" is Greatest.");
                break;
            case 1:
                System.out.println(num2+" is Greatest.");
                break;
            case 2:
                System.out.println("Both are Equal");
                break;
        }    }
}

// Find the max number of the three
class Switch_Q3{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = scanner.nextInt();
        int result;
        if (num1>num2) {
            result = 0;
        }
        else if (num2>num1) {
            result = 1;
        }
        else {
            result = 2;
        }
        switch (result){
            case 0:
                System.out.println(num1 +" is Greatest.");
                break;
            case 1:
                System.out.println(num2+" is Greatest.");
                break;
            case 2:
                System.out.println("Both are Equal");
                break;
        }

    }
}

// Enter sides of triangle and find if triangle is scalan, isosceles or equatorial
class Switch_Q4{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter side2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter side3: ");
        int num3 = scanner.nextInt();
        int result = (num1==num2 && num2==num3)?0: (num1==num2 || num2==num3 || num1 == num3)?1:2 ;

        switch(result){
            case 0:
                System.out.println("The triangle is equilateral ");
                break;
            case 1:
                    System.out.println("The triangle is isoceles ");
                    break;
            default:
                System.out.println("The triangle is scalen");



        };

    }
}

//
class Qu1 {
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

        double percentage10 = percentage / 10;
        int intPer = (int) percentage10;

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

class Qu2{
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("Input Integer");
        int a=z.nextInt();
        System.out.println("Input Integer");
        int b=z.nextInt();
        int result;
        if (a>b){
            result=0;
        }
        else if (a==b){
            result =1;
        }
        else{
            result=2;
        }
        switch(result){
            case 0:
                System.out.println("maximum number " + a);
                break;
            case(1):
                System.out.println("Both are equal");
                break;
            case(2):
                System.out.println("maximum number " + b);
                break;
        }

    }
}

//JAVA Program to find the maximum between three numbers. Using the switch statement.

class Qu3{
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        System.out.println("Input Integer");
        int a=z.nextInt();
        System.out.println("Input Integer");
        int b=z.nextInt();
        System.out.println("Input Integer");
        int c=z.nextInt();
        int result;
        if (a>b && a>c){
            result=0;
        }
        else if (a==b && b==c){
            result =1;
        }
        else if(b>c && b>a) {
            result = 3;
        }
        else{
            result=2;
        }
        switch(result){
            case 0:
                System.out.println("maximum number " + a);
                break;
            case(1):
                System.out.println("All are equal");
                break;
            case(2):
                System.out.println("maximum number " + c);
                break;
            case(3):
                System.out.println("maximum number " + b);
                break;



        }}}


//
class Qu4{
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("Input Integer");
        int A=z.nextInt();
        int result;
        if ((A%5==0) && (A%11==0)){
            result=0;
        }
        else{
            result=1;
        }
        switch (result){
            case 0:
                System.out.println("divisible by both");
                break;
            case 1:
                System.out.println("not divisible by both");
                break;
        }
    }

}




class Qu5 {
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

class Qu6 {
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

class Qu7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1;
        char1 = input.next().charAt(0);
        switch (char1) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("The alphabet is a vowel.");
            default -> System.out.println("The alphabet is a consonant.");
        }
    }}

class Qu8{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1 ;
        char1= input.next().charAt(0);
        switch (char1) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> System.out.println("The character is a digit.");
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' -> System.out.println("The character is an alphabet.");
            default -> System.out.println("The character is a special character");
        }}}




//JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the
//switch statement.
class Qu9{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1 ;
        char1= input.next().charAt(0);
//        }
        switch (char1) {
            case 'A','B','C','D','E','F','G','H','I','J','K','M','N','O','P','Q','R',
                    'S','T','U','V','W','X','Y','Z' :
                System.out.println("The character is an uppercase alphabet.");
                break;
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                    'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' :
                System.out.println("The character is lower alphabet.");
            default :
                System.out.println("The character is a special character");
        }
    }
}

//JAVA Program to take the value from the user as input the month number and print number of
//days in that month. Using switch statement
class Qu11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        int day=scanner.nextInt();
        switch(day) {
            case 0:
                System.out.println("Baisakh has 30 days");
                break;
            case 1:
                System.out.println("jestha has 30 days");
                break;
            case 2:
                System.out.println("Aasar has 30 days");
                break;
            case 3:
                System.out.println("Shrawan has 30 days");
                break;
            case 4:
                System.out.println("Bhadra has 30 days");
                break;
            case 5:
                System.out.println("Ashwoj has 30 days");
                break;
            case 6:
                System.out.println("Kartik has 30 days");
                break;
            case 7:
                System.out.println("mangsir has 30 days");
                break;
            case 8:
                System.out.println("paush has 30 days");
                break;
            case 9:
                System.out.println("magh has 30 days");
                break;
            case 10:
                System.out.println("falgun has 30 days");
                break;
            case 11:
                System.out.println("chitra has 30 days");
                break;

            default:
                System.out.println("invalid");
                break;
        }
    }
}


//0. JAVA Program to take the value from the user as an input week number and print weekday by
//using the switch statement.

class Qu10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int day = scanner.nextInt();
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid");
                break;

        }
    }
}

//12. JAVA Program to count the total number of notes in a given amount. Using the switch
//statement.
class Qu12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the total amount: ");
        int A=scanner.nextInt();
        int B=5;
        int result;
        if (A%B==0){
            result=0;
        }
        else{
            result=1;
        }
        switch (result){
            case 0:
                float total=A/B;
                System.out.println(total);
                break;
            case 1:
                System.out.println("invalid");
        }
    }}

//JAVA Program to take the value from the user as input all sides of a triangle and check whether
//the triangle is valid or not. Using switch statement.

class Qu13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the angle: ");
        int angel1 = scanner.nextInt();
        System.out.println("enter the angle: ");
        int angle2 = scanner.nextInt();
        System.out.println("enter the angle: ");
        int angle3 = scanner.nextInt();
        int sum=angel1+angle3+angle2;
        int result;
        if (sum==180) {
            result=0;
        }
        else{
            result=1;
        }
        switch (result){
            case 0:
                System.out.println("The triangle is valid.");
            case 1:
                System.out.println("the triangle is not valid.");
        }}}

//JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
//Using switch statement
class Qu14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the side: ");
        int side1 = scanner.nextInt();
        System.out.println("enter the side: ");
        int side2 = scanner.nextInt();
        System.out.println("enter the side: ");
        int side3 = scanner.nextInt();
        int result;
        if ((side1 == side2) && (side3 == side2)) {
            result=0;
        }
        else if ((side1 == side2) || (side3 == side2)) {
            result=1;
        }
        else{
            result=2;
        }
        switch (result) {
            case 0 -> System.out.println("equilateral");
            case 1 -> System.out.println("isosceles");
            case 2 -> System.out.println("Scalene");
        }}}

//JAVA Program to find all the roots of a quadratic equation. Using switch statement
class Qu15{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the a");
        float a=scanner.nextFloat();
        System.out.println("Enter the b");
        float b= scanner.nextFloat();
        System.out.println("Enter the c");
        float c= scanner.nextFloat();
        double determinant=(b*b)-(4*a*c);
        double sqrt=Math.sqrt(determinant);
//        System.out.println(determinant);
        double firstRoot=(-b + sqrt)/(2*a);
        double secondRoot=(-b + sqrt)/(2*a);
        int result;
        if (determinant>0){
            result=0;
        }
        else if(determinant==0){
            result=1;
        }
        else{
            result=2;
        }
        switch(result){
            case 0:
                System.out.println("first root : "+firstRoot+" and "+secondRoot);
                break;
            case 1:
                System.out.println(firstRoot);
                break;
        }
    }}


//16. JAVA Program to calculate profit or loss. Using switch statement.
class Qu16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Cost price: ");
        int cp = scanner.nextInt();
        System.out.println("enter the selling price: ");
        int sp = scanner.nextInt();
        int result;
        if (sp > cp) {
            result=0;
        }
        else{
            result=1;
        }
        switch (result){
            case 0:
                System.out.println("you had profit.");
            case 1:
                System.out.println("You had loss.");
        }
    }
}

// JAVA Program to take the value from the user as input the basic salary of an employee and
//calculate its Gross salary according to the following: Basic Salary <= 10000: HRA = 20%, DA =
//80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA =
//90%………………………………Basic Salary > 20000 : HRA = 30%, DA = 95%
class Qu17 {
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
//8. JAVA Program to take the value from the user as input electricity unit charges and calculate
//total electricity bill according to the given condition: For the first 50 units Rs.
//0.50/unit………….For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit
//……………For unit above 250 Rs. 1.50/unit………An additional surcharge of 20% is added to
//the bill…….Using the switch statement
class Qu18{
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

//Program to take the hours and minutes as input by the user and the show that whether it is AM
//or PM by using the switch statement.
class Qu19 {
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

//20. Program to convert a positive number into negative number and negative number into a positive
//number using switch statement
class Qu20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int positiveVal = scanner.nextInt();
        int negativeVal = (~(positiveVal - 1));
        int positiveVal1= ~(~(negativeVal));
        int result;
        if (positiveVal<=0){
            result=0;
        }
        else{
            result=1;
        }
        switch (result){
            case 0:
                System.out.println("negative to positive "+positiveVal1);
                break;
            case 1:
                System.out.println("positive to negative "+negativeVal);
        }


    }
}
//Write a program to swap the values of two numbers if the values of both variables are not the
//same using a switch statement.
class Qu21{
    public static void main(String[] args) {
        int a,b;
        a=2;
        b=3;
        int temp = a;
        a = b;
        b = temp;
        switch (a) {
            case 0:
                System.out.println(a);
                break;

        }}}



//22. Program to Convert even number into its upper nearest odd number Switch Statement.
class Qu22 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int num, x;
        System.out.print("Enter the number ");
        num = demo.nextInt();
        x = num % 2;
        switch (x) {
            case 0 -> num += 1;
            default -> {
            }
        }
        System.out.println(num);
    }
}

class Even{
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int num, x;
        System.out.print("Enter the number ");
        num = demo.nextInt();
        x = num % 2;

        switch (x) {
            case 0 -> System.out.println("Even");
            default -> {
                System.out.println("Odd");
            }
        }
    }
}
