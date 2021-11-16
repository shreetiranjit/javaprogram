//	Take input of age of 3 people by user and determine oldest and youngest among them
import java.util.Scanner;
public class UserAge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first age :");
        int first_age = sc.nextInt();

        System.out.print("Enter the second age:");
        int second_age = sc.nextInt();

        System.out.print("Enter the third age:");
        int third_age = sc.nextInt();

        // algorithm
            // oldest
        if((first_age > third_age) && (first_age >second_age)){
            System.out.print(first_age + "is oldest");
        }
        if((second_age > third_age) && (second_age >first_age)){
            System.out.print(second_age + "is oldest");
        }
        if((third_age > first_age) && (third_age >second_age)){
            System.out.print(third_age + "is oldest");
        }
            // youngest
        if((first_age < third_age) && (first_age < second_age)){
            System.out.println(first_age + "is youngest");
        }
        if((second_age < third_age) && (second_age <first_age)){
            System.out.println(second_age + "is youngest");
        }
        if((third_age <  first_age) && (third_age < second_age)){
            System.out.println(third_age + "is youngest");
        }

    }
}
