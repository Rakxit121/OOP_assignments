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

// Java program of above implementation
class GFG {
    /* Class Pair is used to return two values from getMinMax() */
    static class Pair {

        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int low, int high) {
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int mid;

        // If there is only one element
        if (low == high) {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }

        /* If there are two elements */
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }

        /* If there are more than 2 elements */
        mid = (low + high) / 2;
        mml = getMinMax(arr, low, mid);
        mmr = getMinMax(arr, mid + 1, high);

        /* compare minimums of two parts*/
        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        } else {
            minmax.min = mmr.min;
        }

        /* compare maximums of two parts*/
        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        } else {
            minmax.max = mmr.max;
        }

        return minmax;
    }

    /* Driver program to test above function */
    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, 0, arr_size - 1);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);

    }
}

