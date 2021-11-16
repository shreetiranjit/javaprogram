import java.util.Scanner ;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Data representation
        int first ;
        int second ;
        int result ;
        // User Input
        System.out.print("Enter the first number : ");
        first = sc.nextInt();
        System.out.print("Enter the second number:");
        second = sc.nextInt();

        // algorithm
        result = first + second ;

        // Output
        System.out.print("Sum of " + first + "and" + second +"is " + result);


    }
}
