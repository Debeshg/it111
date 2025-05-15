import java.util.Scanner;

public class dailySpecials {
    public static void main(String [] args){

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday- Friday!");

specials = input.next();


// in the world of coffee, I need a name of a coffee beverage and a price
        String coffee;
        double price;
boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }
        switch (specials) {
            // my cases will be the day of the week
            case "Monday" -> {
                coffee = "latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many lattes would you like to order?");
                int quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like lattes! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only one latte today!");
                } else {
                    double total = quantity * price;
                    System.out.printf("Your total for %d lattes is $%.2f%n", quantity, total);
                }

            }
            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many Frappe would you like to order?");
                int quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like Frappe! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only one Frappe today!");
                } else {
                    double total = quantity * price;
                    System.out.printf("Your total for %d Frappe is $%.2f%n", quantity, total);
                }
            }
            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many Cappuccino would you like to order?");
                int quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like Cappuccino! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only one Cappuccino today!");
                } else {
                    double total = quantity * price;
                    System.out.printf("Your total for %d Cappuccino  is $%.2f%n", quantity, total);
                }
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many Regular Joe would you like to order?");
                int quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like Regular Joe! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only one Regular Joe today!");
                } else {
                    double total = quantity * price;
                    System.out.printf("Your total for %d Regular Joe is $%.2f%n", quantity, total);
                }
            }
            case "Friday" -> {
                coffee = "Green Tea latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many Green Tea latte would you like to order?");
                int quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like Green Tea latte! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only one Green Tea latte today!");
                } else {
                    double total = quantity * price;
                    System.out.printf("Your total for %d Green Tea latte is $%.2f%n", quantity, total);
                }
            }
        }

    }
}
