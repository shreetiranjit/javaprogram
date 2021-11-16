import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter principle: ");
        Float P = sc.nextFloat();
        System.out.print("Enter time:");
        Float T = sc.nextFloat();
        System.out.print("Enter rate:");
        Float R = sc.nextFloat();

        Float result = (P * T * R) / 100;


        System.out.print(result);

    }
}
