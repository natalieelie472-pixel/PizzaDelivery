/*
 * Program: PizzaDelivery.java
 * Programmer:  Natalie Elie
 */
package pizzadelivery;

import java.util.Scanner;

public class PizzaDelivery {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();
        
        System.out.println("Enter your address: ");
        String customerAddress = scanner.nextLine();
        
        System.out.println("Enter your phone number");
        String customerPhoneNumber = scanner.nextLine();
        
        System.out.println("Enter your email: ");
        String customerEmail = scanner.nextLine();
        
        System.out.println("What size pizza would you like? (small, medium, or large): ");
        String pizzaSize = scanner. nextLine();
        
        System.out.println("What type of crust would you like? (thin,thick,or pan): ");
        String pizzaCrust = scanner.nextLine();
        
        System.out.println("What toppings would you like? (enter a comma-separated list): ");
        String pizzaToppings = scanner.nextLine();
        
        double price = calculatePrice(pizzaSize, pizzaCrust, pizzaToppings);
        
        System.out.println("Order summary:");
        System.out.println("Customer name: " + customerName);
        System.out.println("Customer address: " + customerAddress);
        System.out.println("Customer phone number: " + customerPhoneNumber);
        System.out.println("Customer email: " + customerEmail);
        System.out.println("Pizza size: " + pizzaSize);
        System.out.println("Pizza crust: " + pizzaCrust);
        System.out.println("Pizza toppings: " + pizzaToppings);
        System.out.println("Pizza price: $" + price);
        
        System.out.println("How would you like to pay? (cash, credit, or debit)");
        String paymentMethod = scanner.nextLine();
        
        processPayment(paymentMethod, price);
        
        placeOrder(customerName, customerAddress, customerPhoneNumber, customerEmail, pizzaSize, pizzaCrust, pizzaToppings, paymentMethod);
        
        System.out.println("Thank you for your order.");
        
    }
    
    private static double calculatePrice(String pizzaSize, String pizzaCrust, String pizzaToppings) {
        double price = 0;
        
        if (pizzaSize.equals("small")) {
            price = 10;
        } else if (pizzaSize.equals("medium")) {
            price = 12;
        } else if (pizzaSize.equals("large")) {
            price = 14;
        }
        
        if (pizzaCrust.equals("thin")) {
            price += 1;
        } else if (pizzaCrust.equals("thick")) {
            price += 2;
        } else if (pizzaCrust.equals("pan")) {
            price += 3;
        }
        
        String[] toppingList = pizzaToppings.split(",");
        for (String pizzaTopping : toppingList) {
            price += 0.5;
        }
        
        return price;
    }
    
    private static void processPayment(String paymentMethod, double price) {
        
    }
    
    private static void placeOrder(String customerName, String customerAddress, String customerPhoneNumber, String customerEmail, String pizzaSize, String pizzaCrust, String pizzaToppings, String paymentMethod) {
        
    }
 }