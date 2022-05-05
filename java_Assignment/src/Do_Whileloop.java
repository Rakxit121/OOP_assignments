import java.util.Scanner;

public class Do_Whileloop {
}
class ExampleDoWhileLoop
{
    public static void main(String args[])
    {
        int i=6;
        do
        {
            System.out.println(i);
            i++;
        }while(i <=10);
    }
}

// sum of first 10n natural no.
class Sum_10{
    public static void main(String[] args) {
        int i=1;
        int sum =0;
        do{
            sum+=i ;
            i++;
            System.out.println(sum);
        } while(i<=10);

    }
}

//      Add user input sum till 0 usign do wile
class DoWhile_Useradd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uin, sum=0;
        System.out.println("Enter number to add till 0:");
        do{
            uin = scanner.nextInt();
            sum += uin;
        }while(uin!=0);
        System.out.println("The sum of user input number is: "+ sum);

    }
}
