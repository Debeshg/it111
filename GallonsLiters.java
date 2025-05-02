public class GallonsLiters {
    public static void main(String[] args) {
        double gal, lit;
        int counter = 1;

        // Loop through gallons from 1 to 100
        for (gal = 1; gal <= 100; gal += 5) {
            lit = gal * 3.79;  // converting gallons to liters
            System.out.printf("%.0f gallons = %.2f liters%n", gal,lit);

            counter++;

            // Add a blank line every 5 rows
            if (counter % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println("We are done!!!");
    }
}
