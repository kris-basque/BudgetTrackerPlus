
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your monthly income: $");
        double income = scanner.nextDouble();

        System.out.println("Enter your monthly rent: $");
        double rent = scanner.nextDouble();

        System.out.println("Enter your monthly groceries expenses: $");
        double groceries = scanner.nextDouble();

        System.out.println("Enter your monthly transportation expenses: $");
        double transportation = scanner.nextDouble();

        System.out.println("Enter your monthly entertainment expenses: $");
        double entertainment = scanner.nextDouble();

        double totalExpenses = rent + groceries + transportation + entertainment;
        System.out.printf("Your total expenses is: $%.2f%n", totalExpenses);

        double remaingBudget = income - totalExpenses;
        System.out.printf("Your Remaining budget is: $%.2f%n", remaingBudget);

        System.out.println("\n********** Budget Summary **********");

        System.out.printf("%nMonthly Income: $%.2f", income);
        System.out.printf("%nTotal Expenses: $%.2f", totalExpenses);
        System.out.printf("%nRemaining Budget: $%.2f", remaingBudget);
        System.out.println("\n\nExpenses Breakdown:");
        System.out.printf("%nRent: $%.2f (%.2f%% of income)", rent, (rent / income) * 100);
        System.out.printf("%nGroceries: $%.2f (%.2f%% of income)", groceries, (groceries / income) * 100);
        System.out.printf("%nTransportation: $%.2f (%.2f%% of income)", transportation, (transportation / income) * 100);
        System.out.printf("%nEntertainment: $%.2f (%.2f%% of income)%n", entertainment, (entertainment / income) * 100);

        System.out.println("\n************************************");



        scanner.close();
    

    }
}
