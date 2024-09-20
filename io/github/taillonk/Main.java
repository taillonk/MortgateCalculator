package io.github.taillonk;

public class Main {
    public static void main(String[] args) {
        int principal = Prompts.getInt("Enter loan amount ($1k - $1M): ");
        while (!(principal >= 1_000 && principal <= 1_000_000)){
            principal = Prompts.getInt("Enter a number between 1,000 and 1,000,000");
        }
        double annualInterest = Prompts.getDouble("Enter the Annual Interest Rate (0% - 30%): ");
        while (!(annualInterest >= 0 && annualInterest <= 30)){
            annualInterest = Prompts.getDouble("Enter a value between 0 and 30");
        }
        int term = Prompts.getInt("Enter the term of the loan in years (1 to 30): ");
        while (!(term >= 1 && term <= 30)) {
            term = Prompts.getInt("Enter a value between 1 and 30");
        }
        CalculatePayment calculator = new CalculatePayment(principal, annualInterest,term);
        System.out.println("Mortgage: $" + calculator.calculateMortgage());
    }
}
