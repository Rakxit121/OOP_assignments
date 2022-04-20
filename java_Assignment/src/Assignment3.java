import javax.swing.*;
import java.util.Scanner;

//Assignment 2
public class Assignment3{
    public static void main(String[] args) {

    }
}

class Q_joption1 {
    public static void main(String[] args) {

//        1. Write a program to take student details as input and display the result.
        // user input string
        String fname = JOptionPane.showInputDialog("Enter your first name: ");
        String lname = JOptionPane.showInputDialog("Enter your last name: ");
        String rollno = JOptionPane.showInputDialog("Enter your Rollno.: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String address = JOptionPane.showInputDialog("Enter your address: ");
        String batch = JOptionPane.showInputDialog("Enter your batch: ");

        JOptionPane.showMessageDialog(null,"----- User Data ----- \n Name:"+fname+" "+lname+"\nBatch: "+batch+"\nRollno. "+rollno+"\nAddress: "+address);
        JOptionPane.showMessageDialog(null,"------Student details-----");
        JOptionPane.showInputDialog(null,"NAME: " + fname);
        JOptionPane.showMessageDialog(null," " + lname);
        JOptionPane.showMessageDialog(null,"Batch: " + batch);
        JOptionPane.showMessageDialog(null,"AGE: " + age);
        JOptionPane.showMessageDialog(null,"ADDRESS: " + address);

    }
}


class Q_joption2 {
    public static void main(String[] args) {

//            2. Write a program to calculate sum of four numbers taking user input.

        // input the number
        double num1, num2, num3, num4;
        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter four number: ");

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"1st num"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"2nd num"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog(null,"3rd num"));
        num4 = Double.parseDouble(JOptionPane.showInputDialog(null,"4th num"));


        double sum = num1+num2+num3+num4;
        String eQ_joption = num1 +"+"+num2+"+"+num3+"+"+num4;
        JOptionPane.showMessageDialog(null,"The sum of four numbers are:: \n"+eQ_joption+"\n"+sum);

    }
}



class Q_joption3 {
    public static void main(String[] args) {

            /*        3. Write a program to take input of the total marks of four subjects of a student and calculate
        the total percentage secured. Then display the percentage and final result of the student;
        If eQ_joptionual to or more than 70 -> First Class
        If more than 59 -> Upper second Class
        If more than 49 -> Second class
        If more than 39 -> Third class and if below than 40 the result is fail.*/
            double eng, math, sci, com;
            Scanner op=new Scanner(System.in);
            /* Input marks of all five subjects */
            JOptionPane.showMessageDialog(null,"Enter marks of four subjects:");
            eng = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of English subjects:"));
            math = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of Maths subjects:"));
            sci = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of Science subjects:"));
            com = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of Computer subjects:"));


            /* Calculate total, percentage */
            int total =(int) ((eng + math + sci + com)/400*100);
            int percentage = total;

//        JOptionPane.showMessageDialog(null,"The total marks obtained from the four subjects is: "+percentage+"%");
            JOptionPane.showMessageDialog(null,"The obtained marks is--\n"+percentage+"\u0025");
        }
}

class Q_joption4{
    public static void main(String[] args) {
//        4. Write a program to take two integer inputs from user and print sum and product of them.

        // input two integer number
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter 1st num: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter 2nd num: "));

        double sum = num1 +num2;
        JOptionPane.showMessageDialog(null,"The of two integer "+num1+" and "+num2+" = "+sum);

    }
}


class Q_joption5{
    public static void main(String[] args) {
        /*    5.   Ask user to give two double input for length and breadth of a rectangle and print area type cast to int.*/

        Double length = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter length of rectangle: "));
        Double breadth = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter length of rectangle: "));

        // output
        Double area = length * breadth;
        JOptionPane.showMessageDialog(null,"The are of reactangle is: "+area);
    }
}


class Q_joption6{
    public static void main(String[] args) {
//        6. Take name, roll number and field of interest from user and print in the format below :Hey,
//                my name is xyz and my roll number is xyz. My field of interest are xyz.

        Scanner scanner = new Scanner(System.in);
        String name = JOptionPane.showInputDialog(null, "Enter your name: ");
        String interest = JOptionPane.showInputDialog(null, "Enter your interest: ");
        int rollno = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Roll no.: "));


        JOptionPane.showMessageDialog(null,"Hey,\n" +
                " Hey my name is"+ name +"and my roll number is "+rollno+". My field of interest are "+interest+".");
        JOptionPane.showMessageDialog(null," Hey my name is"+ name +" and my roll number is "+rollno+". My field of interest are "+interest+"." );
    }
}


class Q_joption7{
    public static void main(String[] args) {
//        Take side of a sQ_joptionuare from user and print area and perimeter of it. Also, calculate SI, Area
//        of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

        Scanner scanner = new Scanner(System.in);

        // input the length of a sQ_joptionuare
        double len = Double.parseDouble(JOptionPane.showInputDialog(null,"For area and volume of sQ_joptionuare\n"+"Enter the length of a sQ_joptionuare"));

        int area = (int)(len * len);
        int volume = (int)(len*len*len);
        int volume_cube = area*area*area;
        // output
        JOptionPane.showMessageDialog(null,"The input length of sQ_joptionuare is: "+len+"\n"+"The area  of sQ_joptionuare is : "+area+"\n"+"The volume  of sQ_joptionuare is : "+volume+"\n"+
                "Using the same length of sQ_joptionuare- "+len+" as length of cube.\n"+"The volume of cube is: "+volume_cube);

        double len_tri = Double.parseDouble(JOptionPane.showInputDialog(null,"For area of triangle: "+"Enter the length of a triangle: "));
        double height_tri = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the length of a triangle: "));
        double area_tri = (len_tri*height_tri)/2;

        // output
        JOptionPane.showMessageDialog(null,"The area of triangle is : "+area_tri);

    }
}


class Q_joption8{
    public static void main(String[] args) {
//        8. Write a program to find sQ_joptionuare of a number.
//                E.g.- INPUT : 2 OUTPUT : 4
//        INPUT : 5 OUTPUT : 25

       // input number to sQ_joptionuare
        double num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number you want tot sQ_joptionuare: "));

        int sQ_joptionuare = (int)num * (int)num;
        int cube = (int)num * (int)num *(int)num;

        JOptionPane.showMessageDialog(null,"The sQ_joptionuare of input number is: "+sQ_joptionuare);
        JOptionPane.showMessageDialog(null,"The cube of input number is: "+cube);
    }
}


class Q_joption9{
    public static void main(String[] args) {
//        9. Take two different string input and print them in same line. E.g.-
//                INPUT : Codes
//                Dope
//        OUTPUT : CodesDope

        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter string: ");
        String str1 = scanner.nextLine();
        JOptionPane.showMessageDialog(null,"Enter second string: ");
        String str2 = scanner.nextLine();

        JOptionPane.showMessageDialog(null,"------String-----");
        JOptionPane.showInputDialog(null,str1);
        JOptionPane.showMessageDialog(null,str2);
    }
}


class Q_joption10{
    public static void main(String[] args) {
//        10. Take 3 inputs from user and check :
//        all are eQ_joptionual
//        any of two are eQ_joptionual
//                ( use && || with ternary operator )

        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter the three numbers: ");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter third number: "));


        if ((num1 == num2) && (num1== num2) && (num2==num3)) {
            JOptionPane.showMessageDialog(null,"All are eQ_joptionual");
        }else if ((num1 == num2) || (num1== num2) || (num2==num3)) {
            JOptionPane.showMessageDialog(null,"2 numbers are eQ_joptionual");
        }else {
            JOptionPane.showMessageDialog(null,"Numbers are not  eQ_joptionual");
        }
    }
}
class Q_joption11{
    public static void main(String[] args) {
//        11. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//        check if both the conditions 'a < 50' and 'a < b' are true.

        float a,b;
        Scanner scanner = new Scanner(System.in);
        a = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter value for a: "));

        b = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter value for b: "));


        if ((a<50) && (a<b)){
            JOptionPane.showMessageDialog(null,"The condition a<50 and a<b are true");
        }else {
            JOptionPane.showMessageDialog(null,"The condition a<50 and a<b are false");
        }
    }
}

class Q_joption12{
    public static void main(String[] args) {
//        12. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.

        float eng, math, sci, com;
        double total,percentage;
        Scanner op=new Scanner(System.in);
        /* Input marks of all five subjects */
        JOptionPane.showMessageDialog(null,"Enter three marks of Robert:");
        eng = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter marks of English:"));
        math= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter marks of Maths:"));
        com= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter marks of Computer:"));

        /* Calculate total, percentage */
        total = eng + math+ com;
        percentage = (total / 300.0) * 100;

        JOptionPane.showMessageDialog(null,"The total marks obtained Roberts in three subjects is: "+percentage+"%");
    }

}

class Q_joption14{
    public static void main(String[] args) {
//        12. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.

        float eng, math, sci, com;
        double total,percentage;
        Scanner op=new Scanner(System.in);
        /* Input marks of all five subjects */
        JOptionPane.showMessageDialog(null,"Enter three marks of Robert:");
        eng= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter marks of English:"));

        /* Calculate total, percentage */
//        total = eng + math+ com;
//        percentage = (total / 300.0) * 100;
//
//        JOptionPane.showMessageDialog(null,"The total marks obtained Roberts in three subjects is: "+percentage+"%");
    }

}