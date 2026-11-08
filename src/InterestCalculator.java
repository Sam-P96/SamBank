import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("What is your name? ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s, welcome to SamBank\n", name);
        System.out.printf("Deposite amount (EUR): ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.printf("Annual interest rate (%%): ");
        double interestRate = Double.parseDouble(scanner.nextLine());
        System.out.printf("Number of years: ");
        double maxYears = Double.parseDouble(scanner.nextLine());

        double originalAmount = amount;
        double interest;
        double tax;
        double netInterest = 0;

        for (int year = 0; year < maxYears; year++) {
            interest = amount * (interestRate / 100);
            tax = interest * 0.3;
            netInterest = (interest - tax);
            amount += netInterest;
            System.out.printf("--- Year %d --- \n", year + 1);
            System.out.printf("Interest: %9.2f EUR \n", interest);
            System.out.printf("Tax (30%%): %9.2f EUR %n", tax);
            System.out.printf("Net interest: %9.2f EUR \n", netInterest);


        }

        double balance = amount;
        double totalGain = balance - originalAmount;
        double averageInterest = totalGain / maxYears;
        int euros = (int) balance;
        int cents = (int) ((balance - euros) * 100);


        System.out.printf("--- After %1.0f years (compound) --- \n", maxYears);
        System.out.printf("Final Balance: %9.2f EUR \n", balance);
        System.out.printf("Total Gain: %9.2f EUR \n",totalGain);
        System.out.printf("Average Interest per year: %9.2f EUR \n", averageInterest);
        System.out.printf("That is %d euros and %d cents. \n", euros, cents);

    }
}
