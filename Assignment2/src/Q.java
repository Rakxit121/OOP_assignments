import java.util.Scanner;

//Assignment 2
public class Q {
    public static void main(String[] args) {

    }
}

class Q1 {
    public static void main(String[] args) {

//        1. Write a program to take student details as input and display the result.
        // user input string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String a = scanner.nextLine();
        System.out.println("Enter last name: ");
        String l = scanner.nextLine();
        System.out.println("Enter class: ");
        String cl = scanner.nextLine();
        System.out.println("Enter age: ");
        String b = scanner.nextLine();
        System.out.println("Enter address: ");
        String c = scanner.nextLine();

        System.out.println("------Student details-----");
        System.out.print("NAME: " + a);
        System.out.println(" " + l);
        System.out.println("CLASS: " + cl);
        System.out.println("AGE: " + b);
        System.out.println("ADDRESS: " + c);

    }
}


class Q2 {
    public static void main(String[] args) {

//            2. Write a program to calculate sum of four numbers taking user input.

        // input the number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();


        int sum = num1+num2+num3+num4;
        System.out.println("The sum of "+num1+","+num2+","+num3+","+num4+"= "+sum);

    }
}



class Q3 {
    public static void main(String[] args) {

            /*        3. Write a program to take input of the total marks of four subjects of a student and calculate
        the total percentage secured. Then display the percentage and final result of the student;
        If equal to or more than 70 -> First Class
        If more than 59 -> Upper second Class
        If more than 49 -> Second class
        If more than 39 -> Third class and if below than 40 the result is fail.*/

        // input the marks of subjects
        float eng, math, sci, com;
        double total, average, percentage;
        Scanner op=new Scanner(System.in);
        /* Input marks of all five subjects */
        System.out.println("Enter marks of four subjects:");
        System.out.print("Enter marks of English subjects:");
        eng=op.nextFloat();
        System.out.print("Enter marks of Maths subjects:");
        math=op.nextFloat();
        System.out.print("Enter marks of Science subjects:");
        sci=op.nextFloat();
        System.out.print("Enter marks of Computer subjects:");
        com=op.nextFloat();

        /* Calculate total, percentage */
        total = eng + math + sci + com;
        percentage = (total / 400.0) * 100;

        System.out.println("The total marks obtained from the four subjects is: "+total/100+"%");
    }
}

class Q4{
    public static void main(String[] args) {
//        4. Write a program to take two integer inputs from user and print sum and product of them.

        // input two integer number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 +num2;
        System.out.println("The of two integer "+num1+" and "+num2+" = "+sum);
    }
}


class Q5{
    public static void main(String[] args) {
/*    5.   Ask user to give two double input for length and breadth of a rectangle and print area type
        casted to int.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        double len = scanner.nextDouble();
        System.out.println("Enter breadth: ");
        double bdth = scanner.nextDouble();

        // output
        int area = (int)len * (int)bdth;
        System.out.println("The are is: "+ area);
    }
}


class Q6{
    public static void main(String[] args) {
//        6. Take name, roll number and field of interest from user and print in the format below :Hey,
//                my name is xyz and my roll number is xyz. My field of interest are xyz.

    }
}


class Q7{
    public static void main(String[] args) {
//        Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//        of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

    }
}


class Q8{
    public static void main(String[] args) {
//        8. Write a program to find square of a number.
//                E.g.- INPUT : 2 OUTPUT : 4
//        INPUT : 5 OUTPUT : 25

    }
}


class Q9{
    public static void main(String[] args) {
//        9. Take two different string input and print them in same line. E.g.-
//                INPUT : Codes
//                Dope
//        OUTPUT : CodesDope

    }
}


class Q10{
    public static void main(String[] args) {
//        10. Take 3 inputs from user and check :
//        all are equal
//        any of two are equal
//                ( use && || with ternary operator )
    }
}
class Q11{
    public static void main(String[] args) {
//        11. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//        check if both the conditions 'a < 50' and 'a < b' are true.

    }
}

class Q12{
    public static void main(String[] args) {
//        12. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.

    }
}