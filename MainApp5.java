public class VariableDeclaration {
    public static void main(String[] args) {
        // Integer variable to store age
        int age = 25;

        // Double variable to store weight
        double weight = 65.5;

        // String variable to store name
        String name = "John Doe";

        // Printing the values of the variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);

        // Updating the values of variables
        age = 30;
        weight = 70.2;
        name = "Jane Smith";

        // Printing the updated values
        System.out.println("\nUpdated Values:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);

        // Performing operations using the variables
        double ageInMonths = age * 12;
        double weightInKgs = weight * 0.4536;

        // Printing the calculated values
        System.out.println("\nCalculated Values:");
        System.out.println("Age in months: " + ageInMonths);
        System.out.println("Weight in kilograms: " + weightInKgs);
    }
}
