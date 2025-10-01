import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the price of the item: ");
        Scanner input = new Scanner(System.in);
        double ItemPrice = input.nextDouble();
        double ShipCost = 0;

        if (ItemPrice >= 100) {
            ShipCost = 0;
            System.out.println("The item price is: " + ItemPrice);
            System.out.println("The ship cost is: " + ShipCost);
        } else if (ItemPrice < 100) {
            ShipCost = ItemPrice * .02;
            double totalCost = ItemPrice + ShipCost;
            System.out.println("The total price is: " + totalCost);
            System.out.println("The ship cost is: " + ShipCost);
        }
    }
}