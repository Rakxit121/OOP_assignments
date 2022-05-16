import java.util.Scanner;
import java.util.ArrayList;

public class Lesson_ArrayList {
    public static void main(String[] args) {

        // add
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);

        // indexing
        myArrayList.add(0,6);
        myArrayList.add(0,7);
        myArrayList.add(0,8);
        myArrayList.add(0,9);
        myArrayList.add(0,10);

        //set
        myArrayList.set(0,11);
        myArrayList.set(0,12);
        myArrayList.set(0,13);
        myArrayList.set(0,14);
        myArrayList.set(0,15);

        // Remove
//        myArrayList.remove(0);

        // Print
        System.out.println(myArrayList);
    }
}

class new_ArrayList{
    public static void main(String[] args) {

        ArrayList<String> new_list = new ArrayList<String>();

        new_list.add("One");
        new_list.add("Two");
        new_list.add("Three");
        new_list.add("Four");
        new_list.add("Five");

        //remove
        new_list.remove("Three");
        new_list.remove(0);

        // get
        System.out.println(new_list.get(4));

        // print
        System.out.println(new_list);


//        int lent = new_list.size();
//        for (int i = 0; i<=lent-1;i++){
//            System.out.println(new_list.get(i));
//        }
    }
}

// make an arraylist with 10 numbers and sum of the even number there

class num_ArrList{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num_arrList = new ArrayList<Integer>(10);
        System.out.println("Enter 10 numbers into the array");
        for(int i = 0;i<10;i++){
            int num = scanner.nextInt();
            num_arrList.add(num);
        }
        System.out.println("For even number:  "+sum_even(num_arrList));
//        System.out.println("For prime number: "+sum_prime(num_arrList));
    }


    static int sum_even(ArrayList<Integer> num) {
        int n_sum=0;
        for(int i =0;i<num.size();i++){
            if(num.get(i) %2==0){
                n_sum+= num.get(i);
            }
        }
        return n_sum;
    }

//    static int sum_prime(ArrayList<Integer> num) {
//        int prime_sum=0;
//        for(int i =0;i<num.size();i++){
//            int cn = 0;
//            int val = num.get(i);
//            for(int j = 1;j<=val;j++){
//                if(num.get(i) %i==0){
//
//                }
//            }prime_sum+= num.get(i);
//        }
//        return prime_sum;
//    }

}


//

class name_list{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Ellyse");
        names.add("Starxis");
        names.add("Mitchell");

        System.out.println(names);

        System.out.println(names.get(1));
        System.out.println(names);
        names.set(0,"Ram");

        System.out.println(names.get(1));
        System.out.println(names);

        ArrayList<String> second_name = (ArrayList<String>) names.clone();
        System.out.println(second_name);

    }
}