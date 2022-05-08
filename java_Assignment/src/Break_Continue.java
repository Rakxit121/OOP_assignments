import java.util.Scanner;

public class Break_Continue {
}
// ##################  BREAK  ############################
// E.g. of for loop
class BreakDemo1 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==8){
                break;
            }
            System.out.println(i);
        }
    }
}

// E.g. of do-while loop
class BreakDoWhileDemo1
{
    public static void main(String[] args)
    {
        int i=1;
        do
        {
            if(i==15)
            {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }while(i<=20);
    }
}

//E.g. of for nested loop
class Demo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                if (j == 2)
                    break;
                System.out.println(j);
            }
        }
    }
}



//// check weather input number is prime or not
//class BFP{
//    public static void main(String[] args) {
//        System.out.println("Prime Number: ");
//        int n=20, c=0;
//        for(int i=1; i<=n ;i++){
//            if (n%i==0){
//                c++;
//            }
//            if (c==2){
//                System.out.println(i+" is prime");
//            }else{
//                System.out.println(i+" is not prime");
//            }
//        }
//    }
//}

// ####################  CONTINUE  ###########################

// E.g. of for loop
class ContinueExample {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 10; ++i) {
            // if value of i is between 4 and 9
            // continue is executed
            if (i > 4 && i < 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}


// E.g. of nested loop
class Nested {
    public static void main(String[] args) {
        int i = 1, j = 1;
        // outer loop
        while (i <= 3) {
            System.out.println("Outer Loop: " + i);
            // inner loop
            while(j <= 3) {
                if(j == 2) {
                    j++;
                    continue;
                }
                System.out.println("Inner Loop: " + j);
                j++;
            }
            i++;
        }
    }
}

// print even no. of 1 to 10 using continue for loop
class CFE{
    public static void main(String[] args) {

        for (int i = 1; i<=30; i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
            }

        }
    }


// print odd no. from 1 to 10 using while loop
class CWO{
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            if (i%2==0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
