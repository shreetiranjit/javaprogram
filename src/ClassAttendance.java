// 6.	A student will not be allowed to sit in exam if his/her attendance is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.
import java.util.Scanner;
public class ClassAttendance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of classes held:");
        Float total_class_held = sc.nextFloat();

        System.out.print("Enter the number of classes attended:");
        Float total_class_attended = sc.nextFloat();

        Float total_attendance = ((total_class_attended/ total_class_held ) * 100);
        System.out.println("Percentage of class attended" + " " + total_attendance);

        if (total_attendance < 75){
            System.out.println("You are not allowed to sit in an exam");
        }
        else {
            System.out.println("You are allowed to sit in an exam");
        }

    }
}
