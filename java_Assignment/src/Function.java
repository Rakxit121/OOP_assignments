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

class PR {
    public static void main(String[] args) {
        Function functions = new Function();
//        Integer val = functions.addNum();
//        System.out.println(val);
        int val = addNum();
        System.out.println(val);
    }
         public static int addNum(){
            int a=3;
            int b=12;
            int c=a+b;
return c;
    }
}

class NPR{
    public static void main(String[] args) {
        Function functions = new Function();
    }

    public Integer subtract(Integer data){

        return data;
    }
}


class PNR{
    public static void main(String[] args) {
        Function functions = new Function();
    }


    public static void multiply(){

    }
}

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

