import java.util.Scanner;

public class While_loop {
}
class ExampleOfwhileLoop
{
    public static void main(String[] args)
    {
        int i = 1;
        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }
    }
}
class Odd_first {
    public static void main(String[] args) {
        int i=1;
        while (i <= 20) {
            if(i%2!=0){
                System.out.println(i);
                i+=1;
                }else{
                break;
                            }
        }
    }
}

class Multiplication{
    public static void main(String[] args) {
        int n=2,i=1;
        while(i<=10){
        int multi=n*i;
        System.out.println(n+"x"+i+" = "+multi);
        i++;
    }
}
}

// first 10 multiple of 2 and first 10 multiple of 3 then subtract

class Multiple_sub{
    public static void main(String[] args) {
        int n1=2, n2=3,sub, sum;
        int i=1;
        while(i<=5){
            System.out.println("Multiple of 2: "+ n1*i);
            System.out.println("Multiple of 2: "+ n2*i);

            System.out.println("Subtraction of Multiple of 2 and 3: ");
            sub=(n2*i)-(n1*i);
            System.out.println(sub);
            System.out.println("Addition of Multiple of 2 and 3: ");
            sum=(n2*i)+(n1*i);
            System.out.println(sum);

//            if (i%2==0 && i<=10){
//                count2++;
//                sum3=sum2+1;
//
//            }

            i++;
        }
    }
}

// Prime number

class Prime_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inp = input.nextInt();
        int i=2, count = 0;
        while(i<=inp){
            if(i%2==0){
                count+=1;
            }
            i++;

            }
        if(count<=2){
            System.out.println("The number is prime number");
        }else{
            System.out.println("The number is not prime number");
        }
    }
}

class ExampleOfInfiniteWhileLoop{
    public static void main(String[] args)
    {
        int i=10;
        while(true)
        {
            i--;
            if(i>=1){
                System.out.println(i);
            }

        }
    }
}