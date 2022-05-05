import java.util.Scanner;
import java.sql.SQLOutput;


public class For_loop {
}

class OnetoTen {
    public static void main(String[] args) {
        System.out.println("One to ten");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+", ");
        }
        System.out.println("Odd");
        for (int i = 1; i <= 10 ; i+=2){
            System.out.print(i+", ");
        }
        System.out.println("Even");
        for (int i = 2; i <= 10; i+=2){

            System.out.print(i+", ");
        }
    }
}
class OnetoTwenty {
    public static void main(String[] args) {
        System.out.println("Count");
        for(int i = 1; i<=25; ++i){
            System.out.print(i+", ");
        }
        int sum=0;
        System.out.println("Sum of first 10 natural number");
        for(int j = 1; j <= 10; j++){
            sum+=j;
            System.out.println(sum);
        }
    }
}

/* class Prime_num_forloop{
    public static void main(String[] args) {
        System.out.println("Prime number");
        Scanner scanner=new Scanner(System.in);
        int inp=scanner.nextInt();
        int count=0;
    for(int i= 10;i<=i;i++){
        if(inp%2==0){
            count+=1;
        }
        if(count<=2){
            String result="The number is prime number";
        }else{
            String result="The number is not prime number";
        }    }
        System.out.println(result);
    }
}*/

class Prime_num_nested_forloop{
    public static void main(String[] args) {
        System.out.println("Prime number");
        Scanner scanner=new Scanner(System.in);
        int inp=scanner.nextInt();
        int count=0;
        for(int i= 30;i<=i;i++){

            if(inp%2==0){
                count+=1;
            }
            if(count<=2){
                System.out.println("The number is prime number");
            }else{
                System.out.println("The number is not prime number");
            }
            break;
        }
    }
}

class Nested_numcount{
    public static void main(String[] args)
    {
        // Outer for loop
        for(int i = 1; i <= 6 ; i++)
        {
            if(i>=4){
                System.out.println("Iteration of outer loop i: "+ i );
            }
            // Inner for loop
            for(int j = 1; j <= 3 ; j++)
            {
                System.out.println(" Iteration of inner loop: "+ j );
            }
        }
    }

}
// a government wants  to provide student loans to students in their
// country. Btu for a student to be eligible for getting student loan, s/he must
//in the range 18 to 21 and must have minium of 80% marks in acedemics
//Write a program to accept the name age and marks of the student and display if s/he
// is eligible for loan or not

class Scenario1{
    public static void main(String[] args) {

    }
}

class Nested_User_input{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}

class Prime30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inp = input.nextInt();
        for (int num=2;num<=inp;num++){
            int factors=0;
            for (int i=2;i<num;i++) {
                if (num % i == 0) {
                    factors = 1;
                    break;
                }
            }
            if(factors==0) {
                System.out.println(num);
            }
        }
    }
}