import java.util.Scanner;

public class Single_Array {
}
// WAJP (Write a JAVA Program) to print multiple of 3 using function
class Multi3{

}

// WAJP to take user int and loop it 10 times, and store data if the user input data is odd.

// WAJP to createArray to return string


// WAJP to create a function to return from array the count of odd and even numbers
class Odd_Even{
    public static void main(String[] args) {

//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int size=scanner.nextInt();
//        int[] a = new int [size];
//        System.out.println("Enter the numbers to be input into the array");
//        for (int i=0;i<=size;i++){
//            int Inp=scanner.nextInt();
//            a[i]=Inp;

        int[] a = new int[10];
        for (int i = 0;i<9;i++){
            a[i]= i ;
            System.out.println(a[i]);
        }

        count_even_odd(a);

        }


    public static void count_even_odd(int[] arr_num){

        int counteven =0;
        int countodd = 0;
        for (int i = 0;i<9;i++) {
            if (arr_num[i]%2 == 0){
                counteven += 1;
            }else{
                countodd += 1;
            }
        }
        int even= counteven;
        int odd = countodd;
        System.out.println("Even numbers in array = "+even);
        System.out.println("Odd numbers in array = "+odd);

    }
}

class Avg_arr{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 4 numbers: ");
        for (int i = 0;i<4;i++){
            int inp= scanner.nextInt();
            a[i]= inp ;
//            System.out.println(a[]);
        }
        average_ofArray(a);
        }
    public static void average_ofArray(int[] arr){
        int sum=0;
        for(int i=0; i<5;i++){
            sum+=arr[i];
        }
        int avg=sum/4;
        System.out.println("Average of array is = "+avg);
    }
}

// Write a Java program to test if an array contains a specific value
class find_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            int inp = scanner.nextInt();
            a[i] = inp;

//            System.out.println(a[]);
        }
        System.out.println("Enter the number to find ");
        int find = scanner.nextInt();
        find_arr(a,find);

    }

    public static void find_arr(int[] arr, int num){
        int present=0;
        for(int i=0; i<5;i++){
            if(arr[i]==num){
                System.out.println("Num is present in the array");
            }else{
                present +=1  ;
                continue;
            }
        }
        if(5 <= present){
            System.out.println("Num is not present in the array");
        }
    }
}

