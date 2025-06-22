import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        double SHIPPING_FEE = 0.02;
        double shippingCost = 0;
        double totalCost = 0;
        String trash = "";

        System.out.print("Enter the item price: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * SHIPPING_FEE;
            }

            totalCost = itemPrice + shippingCost;

            System.out.println("If the price of your item is $" + itemPrice + ", then the shipping cost is $" + shippingCost + ", and the total cost is $" + totalCost);
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid price: "+ trash + ", enter a valid price ");
        }
    }
}