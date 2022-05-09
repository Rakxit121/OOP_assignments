import java.util.Scanner;

public class Assignment5 {
}
//Write a program to print numbers from 1 to 10.
class Ques1 {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}

//WAP to display even number between 10 and 30.
class Ques2 {
    public static void main(String[] args) {
        int i=10;
        while (i<=30){
            System.out.println(i);
            i+=2;
        }

    }
}

//WAP to display the number of even numbers between 10 and 30.
class Ques3 {
    public static void main(String[] args) {


        int i=10;
        int count=0;
        do{
            if (i%2==0){
                count++;
            }
            i++;
        }while(i<=30);
        System.out.println(count);


    }
}

//WAP to display no. of even and no. of odd number between 10 and 30.
class Ques4 {
    public static void main(String[] args) {
        int i=10;
        int count1=0;
        int count2=0;
        while(i<=30){
            if(i%2==0){
                count1++;
            }else{
                count2++;
            }
            i++;
        }
        System.out.println("Even no:"+count1+"\n Odd no:"+count2);
    }
}

//WAP to display multiplication table of a given no.
class Ques5 {
    public static void main(String[] args) {
        int n=1;
        while(n<=10){
            int product=n*5;
            System.out.println("5 X "+n+ "=" +product);
            n++;
        }
    }
}



//Write a program to calculate the sum of first 10 natural number.
class Ques6 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum is:"+sum);
    }
}


//Write a program that prompts the user to input a positive integer. It should then
//print the multiplication table of that number.
class Ques7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= scanner.nextInt();
        for (int i=1;i<=10;i++){
            int product=i*n;
            System.out.println(n + "X "+i+ "=" +product);

        }
    }
}

//Write a program to find the factorial value of any number entered through the
//keyboard.
class Ques8 {
    public static void main(String[] args) {
        int  count2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int j = input.nextInt();
        while (j>0) {
            count2=count2*j;
            j--;
        }
        System.out.println("Factorial: "+count2);
    }

}

//Two numbers are entered through the keyboard. Write a program to find the value
//of one number raised to the power of another. (Do not use Java built-in method)
class Ques9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //For loop
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter exponent: ");
        int pow = input.nextInt();

        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * num;
        }
        System.out.println("Result: " + result);

    }
}

//Write a program that prompts the user to input an integer and then outputs the
//number with the digits reversed. For example, if the input is 12345, the output
//should be 54321.
class Ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int digit;
        int i;
        int rev=0;
        i=num;
        rev=0;
        do {
            digit = i % 10;
            rev = rev * 10 + digit;
            i/=10;
        } while (i>0);
        System.out.println(rev);

    }
}