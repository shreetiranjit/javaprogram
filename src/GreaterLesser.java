import java.util.Scanner ;
public class GreaterLesser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int first = sc.nextInt();

        System.out.print("Enter the second number:");
        int second = sc.nextInt();

        if (first > second) {
            System.out.print(first + "is greater.");
        }
        else {
            System.out.print(second + "is greater.");
        }

    }
}
