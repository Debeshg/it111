import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String specials = "";
        String coffee = "";
        double price = 0;
        boolean isWeekend;

        // Repeat until a valid weekday is entered
        while (true) {
            System.out.println("Please enter a weekday (Monday–Friday only!):");
            specials = input.next().toLowerCase(); // ignore case
            isWeekend = specials.equals("saturday") || specials.equals("sunday");

            if (isWeekend) {
                System.out.println("Please enter a weekday, exclude weekends!");
            } else {
                // Use switch inside the while loop
                switch (specials) {
                    case "monday" -> {
                        coffee = "Latte";
                        price = 4.95;
                    }
                    case "tuesday" -> {
                        coffee = "Frappe";
                        price = 5.95;
                    }
                    case "wednesday" -> {
                        coffee = "Cappuccino";
                        price = 4.35;
                    }
                    case "thursday" -> {
                        coffee = "Regular Joe";
                        price = 2.95;
                    }
                    case "friday" -> {
                        coffee = "Green Tea Latte";
                        price = 6.95;
                    }
                    default -> {
                        System.out.println("Invalid weekday entered.");
                        continue; // Loop again
                    }
                }
                break; // valid weekday found
            }
        }

        // Capitalize the first letter of the weekday
        String capitalizedDay = specials.substring(0, 1).toUpperCase() + specials.substring(1);

        // Display coffee of the day
        System.out.println(capitalizedDay + "'s coffee of the day is a " + coffee + " and the price is $" + price);

        // Ask for quantity
        System.out.println("How many " + coffee + "(s) would you like to order?");
        int quantity = input.nextInt();

        if (quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + "! So sad!!!");
        } else {
            double total = quantity * price;
            double discount = 0;

            if (quantity >= 10) {
                discount = total * 0.20;
                System.out.printf("You qualify for a 20%% group discount! Discount: $%.2f%n", discount);
            } else if (quantity >= 5) {
                discount = total * 0.10;
                System.out.printf("You qualify for a 10%% group discount! Discount: $%.2f%n", discount);
            }

            double finalTotal = total - discount;

            if (quantity == 1) {
                System.out.println("Looks like you will be ordering only one " + coffee + " today!");
                System.out.printf("Your total is: $%.2f%n", total);
            } else if (quantity < 5) {
                System.out.printf("Your total for %d %s(s) is: $%.2f%n", quantity, coffee, total);
            } else {
                System.out.printf("Your total for %d %s(s) is: $%.2f%n", quantity, coffee, total);
                System.out.printf("Your final price after discount is: $%.2f%n", finalTotal);
            }
        }

        input.close();
    }
}
