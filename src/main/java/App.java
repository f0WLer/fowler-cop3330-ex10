import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        final int n_items = 3;
        double subtotal = 0.0;

        for (int i = 0; i < n_items; i++) {
            System.out.print("Enter the price of item " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            System.out.print("Enter the quantity of item " + (i + 1) + ": ");
            double quantity = scanner.nextDouble();
            subtotal += price * quantity;
        }

        double tax = subtotal * 0.055;
        double total = subtotal + tax;

        System.out.println(String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f",
                subtotal, tax, total));
    }
}
