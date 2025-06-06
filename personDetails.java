package package_person_homework;

public class personDetails {
    public static void main(String[] args) {

        Person firstPerson = new Person();
        Person secondPerson = new Person();

        // First customer details
        firstPerson.name = "Cathy Jones";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        // Second customer details
        secondPerson.name = "Kendall Black";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 2019;
        secondPerson.violations = true;
        secondPerson.creditScore = 570;

        double monthlyRate;

        // Display first person info
        firstPerson.display();
        monthlyRate = firstPerson.getRate(0);
        System.out.println("Insurance paid: " + monthlyRate + " dollars\n");

        // Display second person info
        secondPerson.display();
        monthlyRate = secondPerson.getRate(0);
        System.out.println("Insurance paid: " + monthlyRate + " dollars\n");
    }
}
