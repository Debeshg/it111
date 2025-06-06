package package_person_homework;

public class Person {
    // Fields (variables)
    String name;
    char gender;
    int age;
    int car;
    boolean violations;
    double creditScore;

    // Display person info
    public void display() {
        System.out.println("Customer name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Car: " + car);
        System.out.println("Violations: " + violations);
        System.out.println("Credit Score: " + creditScore);
    }

    // Calculate rate based on car year + violations + creditScore
    public double getRate(double monthlyRate) {
        if (car >= 2015) {
            monthlyRate = 800.00;
        } else if (car < 2015) {
            monthlyRate = 200.00;
        } else if (violations == true && creditScore <= 700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }

        return monthlyRate;
    }

    // Retain the assumeGender method, but note: **not used anymore**
    public double assumeGender(double adjustedRate) {
        if (gender == 'M' && age <= 25) {
            adjustedRate = 100;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }
}
