package BasicPrograms;
import java.util.Scanner;

public class Even0rOdd {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number");
        int x =number.nextInt();

        if (x % 2 == 0 ){
            System.out.println(x + "is a Even number");
        }else{
            System.out.println(x +"is a Odd number");
        }
    }
}
