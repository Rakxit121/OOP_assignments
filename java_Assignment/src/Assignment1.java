//Write a program to check whether a person can cast a vote or not. Condition is you must be above 18 years to vote.

public class Assignment1 {
}
class Q1 {
    public static void main(String[] args) {
        int age = 33;
        if (age > 18) {
            System.out.println("Yes boy, you can cast vote");
        } else {
            System.out.println("Sorry, you can't cast vote");
        }
    }
}
class Q2{
    /*
//Write a program to calculate SI, Area of triangle and Volume of Cube and Cuboid.
public class Q2 {

    public static void main(String[] args) {
        double side1 = 3;
        double side2 = 6;
        double side3 = 7;
        double semi_perimeter = (side1+side2+side3)/2d;

        double area = Math.pow (semi_perimeter(semi_perimeter-side1)(semi_perimeter-side2)(semi_perimeter-side3),0.5d);
        System.out.printf("Hence the are of given triangle is %.2f sq. units",area);

        System.out.println("\n");
        System.out.println("Volume of cube with side 1 is "+ side1side1side1+"cubic units");
        System.out.println("Volume of cuboid is "+ side1side2*side3+"cubic units");

    }
}
*/

}

class Q3 {
    public static void main(String[] args) {
        //. Write ternary operator for the question no. 1.
        // variable = Expression ? expression1 : expression2
        int age = 2;
        String vote = (age > 18) ? "yes you can vote" : "no, you can't vote";

        System.out.println(vote);

    }
}

class Q4{    //Write a program to calculate the total marks of four subjects of a student and the total percentage secured.
    public static void main(String[] args) {
        float sub1 = 80;
        float sub2 = 80;
        float sub3 = 80;
        float sub4 = 80;

        float total = sub1+sub2+sub3+sub4;
        float percentage = total/400 *100;
        String result;

        result =  (percentage>70)?"First class": (percentage>59)? "upper second class": (percentage>49)? "second class": (percentage>39)? "Third class":"Fail";
        System.out.println("Hey, your result is "+result);
    }
}