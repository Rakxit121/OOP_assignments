import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Manual data input in 2x2
        int[] [] arr = new int [2] [2];
//
//        arr[0][0]=1;
//        arr[0][1]=2;
//        arr[1][0]=4;
//        arr[1][1]=5;

        // Manual data input in 3x3
//        int[] [] arr = new int [3] [3];
//
//        arr[0][0]=1;
//        arr[0][1]=2;
//        arr[0][2]=3;
//        arr[1][0]=4;
//        arr[1][1]=5;
//        arr[1][2]=6;
//        arr[2][0]=7;
//        arr[2][1]=8;
//        arr[2][2]=9;

        System.out.println("Enter numbers");
        for(int i=0;i<=2;i++){
            for(int j=0;j<=0;j++){
                int num = arr[i][j];
//                arr[i][j]=i+1;
            }
            System.out.println(Arrays.deepToString(arr));
        }

    }
}

class name_age{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] [] arr = new String [3] [2];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter Age, Name: ");
                String age = scanner.next();
                arr[1][1] = age;

            }
            System.out.println(Arrays.deepToString(arr));
        }

    }

}