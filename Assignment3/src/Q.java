import javax.swing.*;
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
        String fname = JOptionPane.showInputDialog("Enter your first name: ");
        String lname = JOptionPane.showInputDialog("Enter your last name: ");
        String rollno = JOptionPane.showInputDialog("Enter your Rollno.: ");
        String age = JOptionPane.showInputDialog("Enter your age: ");
        String address = JOptionPane.showInputDialog("Enter your address: ");
        String batch = JOptionPane.showInputDialog("Enter your batch: ");

        JOptionPane.showMessageDialog(null,"----- User Data ----- \n Name:"+fname+" "+lname+"\nBatch: "+batch+"\nRollno. "+rollno+"\nAddress: "+address);
        System.out.println("------Student details-----");
        System.out.print("NAME: " + fname);
        System.out.println(" " + lname);
        System.out.println("Batch: " + batch);
        System.out.println("AGE: " + age);
        System.out.println("ADDRESS: " + address);

    }
}


class Q2 {
    public static void main(String[] args) {

//            2. Write a program to calculate sum of four numbers taking user input.

        // input the number
        double num1, num2, num3, num4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four number: ");

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"1st num"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"2nd num"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog(null,"3rd num"));
        num4 = Double.parseDouble(JOptionPane.showInputDialog(null,"4th num"));


        double sum = num1+num2+num3+num4;
        String eq = num1 +"+"+num2+"+"+num3+"+"+num4;
        JOptionPane.showMessageDialog(null,"The sum of four numbers are:: \n"+eq+"\n"+sum);

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
            double eng, math, sci, com;
            Scanner op=new Scanner(System.in);
            /* Input marks of all five subjects */
            System.out.println("Enter marks of four subjects:");
            eng = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of English subjects:"));
            math = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of Maths subjects:"));
            sci = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of Science subjects:"));
            com = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of Computer subjects:"));


            /* Calculate total, percentage */
            int total =(int) ((eng + math + sci + com)/400*100);
            int percentage = total;

//        System.out.println("The total marks obtained from the four subjects is: "+percentage+"%");
            JOptionPane.showMessageDialog(null,"The obtained marks is--\n"+percentage+"\u0025");
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
        /*    5.   Ask user to give two double input for length and breadth of a rectangle and print area type cast to int.*/

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your roll no. : ");
        String rollno = scanner.nextLine();
        System.out.println("Enter your interest : ");
        String interest = scanner.nextLine();

        System.out.println("Hey,\n" +
                " Hey my name is"+ name +"and my roll number is "+rollno+". My field of interest are "+interest+".");

    }
}


class Q7{
    public static void main(String[] args) {
//        Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//        of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

        Scanner scanner = new Scanner(System.in);

        // input the length of a square
        System.out.println("For area and volume of square");
        System.out.println("Enter length of square: ");
        double len = scanner.nextDouble();

        int area = (int)len^2;
        int volume = (int)len^3;

        System.out.println();
        // output
        System.out.println("The area  of square is : "+area);
        System.out.println("The volume  of square is : "+volume);

        System.out.println("Using the same length of square- "+len+" as length of cube");
        int volume_cube = area^3;

        System.out.println("The volume of cube is: "+volume_cube);

        System.out.println();

        System.out.println("For area of triangle");
        System.out.println("Enter length of triangle: ");
        double len_tri = scanner.nextDouble();
        System.out.println("Enter breadth of triangle: ");
        double height_tri = scanner.nextDouble();

        double area_tri = len_tri*height_tri;

        // output
        System.out.println("The area of triangle is : "+(area_tri/2));

    }
}


class Q8{
    public static void main(String[] args) {
//        8. Write a program to find square of a number.
//                E.g.- INPUT : 2 OUTPUT : 4
//        INPUT : 5 OUTPUT : 25

        Scanner scanner = new Scanner(System.in);

        // input number to square
        System.out.println("Enter the number you want to square square: ");
        double num = scanner.nextDouble();

        int square = (int)num * (int)num;
        int cube = (int)num * (int)num *(int)num;

        System.out.println("The square of input number is: "+square);
        System.out.println("The cube of input number is: "+cube);
    }
}


class Q9{
    public static void main(String[] args) {
//        9. Take two different string input and print them in same line. E.g.-
//                INPUT : Codes
//                Dope
//        OUTPUT : CodesDope

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String str2 = scanner.nextLine();

        System.out.println("------String-----");
        System.out.print(str1);
        System.out.println(str2);
    }
}


class Q10{
    public static void main(String[] args) {
//        10. Take 3 inputs from user and check :
//        all are equal
//        any of two are equal
//                ( use && || with ternary operator )

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if ((num1 == num2) && (num1== num2) && (num2==num3)) {
            System.out.println("All are equal");
        }else if ((num1 == num2) || (num1== num2) || (num2==num3)) {
            System.out.println("2 numbers are equal");
        }else {
            System.out.println("Numbers are not  equal");
        }
    }
}
class Q11{
    public static void main(String[] args) {
//        11. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//        check if both the conditions 'a < 50' and 'a < b' are true.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.println("Enter value for b: ");
        int b = scanner.nextInt();

        if ((a<50) && (a<b)){
            System.out.println("The condition a<50 and a<b are true");
        }else {
            System.out.println("The condition a<50 and a<b are false");
        }
    }
}

class Q12{
    public static void main(String[] args) {
//        12. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.

        float eng, math, sci, com;
        double total,percentage;
        Scanner op=new Scanner(System.in);
        /* Input marks of all five subjects */
        System.out.println("Enter three marks of Robert:");
        System.out.print("Enter marks of English:");
        eng=op.nextFloat();
        System.out.print("Enter marks of Maths:");
        math=op.nextFloat();
        System.out.print("Enter marks of Computer:");
        com=op.nextFloat();

        /* Calculate total, percentage */
        total = eng + math+ com;
        percentage = (total / 300.0) * 100;

        System.out.println("The total marks obtained Roberts in three subjects is: "+percentage+"%");
    }

}

class Q14{
    public static void main(String[] args) {
//        12. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.

        float eng, math, sci, com;
        double total,percentage;
        Scanner op=new Scanner(System.in);
        /* Input marks of all five subjects */
        System.out.println("Enter three marks of Robert:");
        System.out.print("Enter marks of English:");

        /* Calculate total, percentage */
//        total = eng + math+ com;
//        percentage = (total / 300.0) * 100;
//
//        System.out.println("The total marks obtained Roberts in three subjects is: "+percentage+"%");
    }

}