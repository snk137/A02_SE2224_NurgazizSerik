import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Shop!");

        System.out.println("Select a base coffee:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        int baseChoice = scanner.nextInt();

        Coffee baseCoffee = null;
        switch (baseChoice) {
            case 1:
                baseCoffee = new Espresso();
                break;
            case 2:
                baseCoffee = new Latte();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                System.exit(0);
        }

        while (true) {
            System.out.println("Do you want to add a condiment?");
            System.out.println("1. Milk");
            System.out.println("2. Sugar");
            System.out.println("3. Whipped Cream");
            System.out.println("4. Caramel");
            System.out.println("5. Finish and show order");
            int condimentChoice = scanner.nextInt();

            if (condimentChoice == 5) {
                break;
            }

            switch (condimentChoice) {
                case 1:
                    baseCoffee = new Milk(baseCoffee);
                    break;
                case 2:
                    baseCoffee = new Sugar(baseCoffee);
                    break;
                case 3:
                    baseCoffee = new WhippedCream(baseCoffee);
                    break;
                case 4:
                    baseCoffee = new Caramel(baseCoffee);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedCost = decimalFormat.format(baseCoffee.cost());

        System.out.println("Your coffee order:");
        System.out.println("Description: " + baseCoffee.getDescription());
        System.out.println("Cost: $" + formattedCost);
        scanner.close();
    }
}
