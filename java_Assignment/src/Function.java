import java.util.Scanner;
// Function and parameter

/* Access- modifier Static/non-static return Type method name(parameter){
----body---
 }


 Access modifier----
 public
 private
 protected
 default

Static should be used while you want to access any function without the use of object.


NO any key word is required if you want to access the function by using the object.


If your function returns certain data type then you must specify the data type of the returned value
for example: int,double,float,String,long,char,boolean,etc,.


If you function returns nothing then you must use void keyboard.

Name of the function should be always in perfect camel case or its initials should
always Start from lowercase.


parameter of the function:
 parameterized and return type
 parameterless and return type
 parameterized and non-return type
 parameterless and non-return type

 */


public class Function {
    public static void main(String[] args) {

        Function functions = new Function();
//        String value = functions.helloWorld("hello World");    // parameterized with return type
        String value = functions.helloWorld("hello World"); // parameterized with without return type
        System.out.println(value);
//        helloWorld();
    }


    // parameterless function with no return type
    public String helloWorld(String data){   // parameter with string data type
//    public static void helloWorld() {   // parameterless with void data type
//        System.out.println("Hello World!!");
//        String helloWorld = "Hello World ";
//                return helloWorld;
return data;

    }
}


class Sinterest {
    public static void main(String[] args) {
        helloInt();
    }
    public static void helloInt() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        float prn=scanner.nextFloat();

        System.out.println("Enter the time: ");
        float time=scanner.nextFloat();


        System.out.println("Enter the rate: ");
        float rate=scanner.nextFloat();

        float interest =(prn*time*rate)/100;
        System.out.println(interest);
    }
}


//class PR {
//    public static void main(String[] args) {
//
//        Function fun1 = new Function();
//        int value = fun1(addition());
//        System.out.println(value);
//
//        public int addition(int a; int b){
//            a = 3;
//            b = 3;
//            int c = a + b;
//            System.out.println(c);
//    }
//    }
//}

// Addition
class PR {
    public static void main(String[] args) {
        PR functions = new PR();

        int a=3;
        int b=12;int val = functions.addNum(a,b);
//        System.out.println(val);
//        int val = addNum();
//        addNum();
        System.out.println(val);
    }
    public int addNum(int a, int b){

        int c=a+b;
return c;
    }
}

// Subtract
class NPR{
    public static void main(String[] args) {

        int a=20;
        int b=8;


        System.out.println(subtract(a,b));
    }

    public static Integer subtract(int a, int b){
        int c=a-b;
        return c;
    }
}

// Multiply
class PNR{
    public static void main(String[] args) {
        PNR functions = new PNR();

        int a=21;
        int b=13;
//

    }


    public static void multiply(){

    }
}

//Divide
class NPNR{
    public static void main(String[] args) {
        Function functions = new Function();
    }

    public static void divide(){

    }
}



//
//class Fun1{
//    public static void main(String[] args) {
//        System.out.println(addition());
//    }
//    public  static int addition(){
//        int a=10;
//        int b=10;
//        int sum=a+b;
//        return sum;
//    }
//}
//
class Fun2{
    public static void main(String[] args) {
        subtraction();
    }
    public static void subtraction(){
        int a=10;
        int b=20;
        int sub=a-b;
        System.out.println(sub);
    }
}

class Fun3{
    public static void main(String[] args) {
//        Function function=new Function();
//        function.subtraction();
        subtraction(10,12);
    }
    public static void subtraction(int a,int b){
//        int a=10;
//        int b=20;
        int sub=a-b;
        System.out.println(sub);
    }
}

class Prime {
    public static void main(String[] args) {
        int low = 30, high = 50;
        while (low < high) {
            if(checkPrimeNumber(low))
                System.out.print(low + " ");
            ++low;
        }
    }

    public static boolean checkPrimeNumber(int num) {
        boolean flag = true;

        for(int i = num; i <= num/2; ++i) {

            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}


class Prime_num{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        printPrime(start,end);
    }

    public static void printPrime(int start, int end){
        for(int i=start; i<=end;i++){
            int counting=0;
            for (int j=1;j<=1;j++){
                if (i % j == 0) {
                    counting++;
                }
            }
        }
    }
}


// write a java program to find sum of multiples of 5 and 11 which are present in a specific range between a and b.


class SumOfMulti{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumOfMulti function = new SumOfMulti();
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
//        int a = 1;
//        int b=100;

        System.out.println(multi_inBet(a,b));

    }

    public static int multi_inBet(int a, int b) {

        int sum = 0;
        for (int i = 1; i <= b; i++) {

            if (i % 5 == 0 && i % 11 == 0) {
                sum = sum + i;
            }
        }
        int sum1 = sum;
        return sum1;
    }
}


