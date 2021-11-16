// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.
import java.util.Scanner;
public class ShopDiscount {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the cost of product: ");
        int cost = sc.nextInt();

        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        int total_cost = cost * quantity;

        if (total_cost > 1000) {
            System.out.print("You got 10% discount");
            int discounted_price = total_cost * 10/100;
            int final_cost =  total_cost - discounted_price ;
            System.out.println("The final cost is" + final_cost);
        } else {
            System.out.print("The final cost is" + total_cost);
        }



    }
}
